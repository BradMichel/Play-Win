/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.Canvas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brad Michel
 */
public class Juego extends Canvas {

    private int id_juego;
    private Laberinto laberinto;
    //private HashMap<Integer, Jugador> jugadores;
    private Map<Integer, Jugador> players;
    protected Jugador yo;
    private Graficador dibujante;
    private Comandos comandos;

    public Juego() {

        this.yo = new Jugador("Yo.png", 100, 100, 0, 15);
        this.players = new HashMap<Integer, Jugador>();
        this.players.put(this.yo.getId_persona(), yo);
        new Elegir_juego();
        this.laberinto = new Laberinto(1, 16, 16);
        this.dibujante = new Graficador(this.laberinto, this.yo);
        this.laberinto = this.dibujante.getLaberinto();
       // this.yo.setLaberinto(laberinto);
        this.comandos = new Comandos(this);

    }

    public void actualizar() {

    }

    public class Elegir_juego extends SQLQuery {

        public Elegir_juego() {

            Jugador player = new Jugador("Yo.png", 100, 100, 0, 16);
            players.put(player.getId_persona(), player);

            /*    try {
             this.conectar_usuario();

             this.consulta = this.conn.prepareStatement("SELECT COUNT(*) AS total, MIN(Id_juego) AS minimo FROM juego WHERE Player1 != '" + yo.getId_persona() + "'and Player2 = '0' and Id_ganador = '0'");
             ResultSet r1 = this.consulta.executeQuery();

             if (r1.next()) {

             if (r1.getInt("total") != 0) {

             int minimo = r1.getInt("minimo");

             this.consulta.close();
             this.consulta = this.conn.prepareStatement("UPDATE juego set Player2 = ? where Id_juego = '" + minimo + "'");
             this.consulta.setInt(1, yo.getId_persona());
             this.consulta.executeUpdate();

             this.consulta.close();

             this.consulta = this.conn.prepareStatement("SELECT Player1 FROM juego WHERE Id_juego = '" + minimo + "' ");
             ResultSet r2 = this.consulta.executeQuery();

             if (r2.next()) {

             id_juego = minimo;

             Jugador player = new Jugador("Yo.png", 100, 100, 0, 15);
             players.put(player.getId_persona(), player);

             }
             this.consulta.close();

             } else {

             this.consulta = this.conn.prepareStatement(" insert into juego (Player1) values(?)");
             this.consulta.setInt(1, yo.getId_persona());
             this.consulta.execute();
             this.consulta.close();

             this.consulta = this.conn.prepareStatement("SELECT MAX(Id_juego) AS ultimo FROM juego WHERE Player1 = '" + yo.getId_persona() + "'");
             ResultSet r2 = this.consulta.executeQuery();

             if (r2.next()) {

             id_juego = r2.getInt("ultimo");

             }

             }
             }

             } catch (ClassNotFoundException ex) {
             Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
             Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
             }
             */
        }

        public void cargar_nuevos_jugadores() {

        }
        /*     
         try {
         this.conectar_usuario();

         this.consulta = this.conn.prepareStatement("SELECT * AS minimo FROM juego WHERE Id_juego = '"+id_juego+"' ");
         ResultSet r1 = this.consulta.executeQuery();

         if (r1.next()) {
                    
         if(r1.getInt("Player1") != yo.getId_persona()){   players.put(r1.getInt("Player1"), new Jugador( "Yo.png", 100, 100, 0, 15));};
         if(r1.getInt("Player2") != yo.getId_persona()){ players.put(r1.getInt("Player2"),new Jugador( "Yo.png", 100, 100, 0, 15));}
         }

         } catch (ClassNotFoundException ex) {
         Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
         Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
         }
            
         }
         */

    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public Jugador getYo() {
        return yo;
    }

    public Graficador getDibujante() {
        return dibujante;
    }

    public Comandos getComandos() {
        return comandos;
    }

}
