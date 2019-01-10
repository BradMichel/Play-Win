/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Brad Michel
 */
public class Graficador extends Canvas {

    private Laberinto laberinto;
    private Dimension tamaño;
    private Image imagen_laberinto;
    private Graphics muros;
    private Pasos pasos;
    private int ancho_camino, alto_camino, div_ancho, div_alto;
    private Jugador players;

    public Graficador(Laberinto laberinto, Jugador players) {
        this.laberinto = laberinto;
        this.tamaño = laberinto.getTamaño();
        this.ancho_camino = laberinto.getAncho_camino();
        this.alto_camino = laberinto.getAlto_camino();
        this.imagen_laberinto = laberinto.getImagen_laberinto();
        this.div_ancho = laberinto.getDiv_ancho();
        this.div_alto = laberinto.getDiv_alto();
        this.pasos = new Pasos(this.div_ancho, this.div_alto);

        this.players = players;

    }

    public void preparar_imagen() {

        if (!laberinto.getTamaño().equals(getSize())) {

            this.tamaño = getSize();
            this.ancho_camino = (this.tamaño.width - 200) / laberinto.getDiv_ancho();
            this.alto_camino = (this.tamaño.height - 200) / laberinto.getDiv_alto();

            this.imagen_laberinto = createImage(tamaño.width - 100, tamaño.height - 100);

            this.muros = imagen_laberinto.getGraphics();

            this.muros.setColor(Color.WHITE);
            this.muros.fillRect(100, 100, Integer.parseInt("" + ancho_camino * this.ancho_camino), Integer.parseInt("" + alto_camino * this.alto_camino));
        }

        muros.setColor(Color.BLACK);

        for (int x = 100, i = 0; i <= this.div_ancho; x = x + ancho_camino, i++) {

            for (int y = 100, j = 0; j <= this.div_alto; y = y + alto_camino, j++) {
     

                if (j < this.div_alto && i < this.div_ancho) {

                    if (!this.pasos.getPasos_horizontales()[i][j]) {
                        muros.drawLine(x, y, x + ancho_camino, y);

                    } else {
                        muros.drawLine(x, y, x, y);
                    }

                    if (!this.pasos.getPasos_verticales()[i][j]) {
                        muros.drawLine(x, y, x, y + alto_camino);
                    } else {
                        muros.drawLine(x, y, x, y);
                    }
                } else {
                    if(i == this.div_ancho && j == 0 ){}else{
                    if (j == this.div_alto) {
                        muros.drawLine(x, y, x + ancho_camino, y);
                    }
                    if (i == this.div_ancho) {
                        muros.drawLine(x, y, x, y + alto_camino);
                    }
                }}

            }
        }

    }

    public void setPlayers(Jugador players) {
        this.players = players;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public int getAncho_camino() {
        return ancho_camino;
    }

    public int getAlto_camino() {
        return alto_camino;
    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public Image getImagen_laberinto() {
        return imagen_laberinto;
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (imagen_laberinto != null) {

            Dimension tamaño_actual = getSize();

            if (tamaño.equals(tamaño_actual)) {
                g.drawImage(imagen_laberinto, 0, 0, null);
            } else {
                g.drawImage(imagen_laberinto, 0, 0, tamaño_actual.width, tamaño_actual.height, null);
            }
        }

       // Iterator it = players.entrySet().iterator();

      //  while (it.hasNext()) {
          //  Map.Entry e = (Map.Entry) it.next();

        //    Jugador prueba = (Jugador) e.getValue();
            g.drawImage(players.getJugador(), players.getX() + 1, players.getY() + ((this.div_alto - 1) * this.alto_camino) + 1, this.alto_camino - 1, this.alto_camino - 1, this);

       // }
    }

}
