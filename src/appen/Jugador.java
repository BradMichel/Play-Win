/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.GradientPaint;
import java.awt.Image;
import java.util.HashMap;




/**
 *
 * @author Brad Michel
 */
public class Jugador extends Canvas{
    private int id_persona;
    private Image jugador;
    private int puntaje, x, y, casillax, casillay;
    private HashMap respuestas;
    private BasicStroke wideStroke,fineStroke;
    private GradientPaint gradient;
    private Laberinto laberinto;

    public Jugador( String url,int x, int y,  int casillax, int casillay)  {

   
       this.jugador = new Cargar_imagen(url).getImagen();
       this.x = x;
       this.y = y;
       this.casillax = casillax;
       this.casillay = casillay;

    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public Image getJugador() {
        return jugador;
    }

    public int getX() {
        return x;
    }
    
      public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCasillax() {
        return casillax;
    }

    public void setCasillax(int casillax) {
        this.casillax = casillax;
    }

    public int getCasillay() {
        return casillay;
    }

    public void setCasillay(int casillay) {
        this.casillay = casillay;
    }

    public int getId_persona() {
        return id_persona;
    }
    
    

    


    
}
