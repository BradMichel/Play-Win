
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.Dimension;
import java.awt.Image;






/**
 *
 * @author Brad Michel
 */
public class Laberinto {


    private int id_laberinto,alto_camino, ancho_camino, div_ancho, div_alto;
    private Dimension tamaño;
    private Image imagen_laberinto;
    private Pasos pasos;




    public Laberinto(int id_laberinto, int ancho, int alto) {

        this.id_laberinto = id_laberinto;
        tamaño = new Dimension(0, 0);
        div_ancho = ancho;
        div_alto = alto;
        this.pasos = new Pasos(this.div_ancho, this.div_alto);
        this.pasos.consultar_laberinto();
        System.out.println(this.pasos.getColumnaFinal());
        

    }

    public int getId_laberinto() {
        return id_laberinto;
    }

    
    
    public Image getImagen_laberinto() {
        return imagen_laberinto;
    }

    
    
    public int getAncho_camino() {
        return ancho_camino;
    }

    public int getAlto_camino() {
        return alto_camino;
    }

    public int getDiv_ancho() {
        return div_ancho;
    }

    public int getDiv_alto() {
        return div_alto;
    }

    public Dimension getTamaño() {
        return tamaño;
    }

    public Pasos getPasos() {
        return pasos;
    }


    


    
    
}
