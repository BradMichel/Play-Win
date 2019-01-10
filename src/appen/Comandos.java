/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brad Michel
 */
public class Comandos {
    
    private Juego juego;
    
    public Comandos(Juego juego) {
        this.juego = juego;
        
    }
    
    public void avanzar(int e) {
        
        if (e == KeyEvent.VK_RIGHT && juego.getDibujante().getPasos().getPasos_verticales()[juego.getYo().getCasillax() + 1][juego.getYo().getCasillay()]) {
            
            juego.getYo().setX(juego.getYo().getX() + juego.getDibujante().getAncho_camino());
            juego.getYo().setCasillax(juego.getYo().getCasillax() + 1);
        }
        if (e == KeyEvent.VK_LEFT && juego.getDibujante().getPasos().getPasos_verticales()[juego.getYo().getCasillax()][juego.getYo().getCasillay()]) {
            juego.getYo().setX(juego.getYo().getX() - juego.getDibujante().getAncho_camino());
            juego.getYo().setCasillax(juego.getYo().getCasillax() - 1);
            
        }
        
        if (e == KeyEvent.VK_UP && juego.getDibujante().getPasos().getPasos_horizontales()[juego.getYo().getCasillax()][juego.getYo().getCasillay()]) {
            juego.getYo().setY(juego.getYo().getY() - juego.getDibujante().getAlto_camino());
            juego.getYo().setCasillay(juego.getYo().getCasillay() - 1);
        }
        if (e == KeyEvent.VK_DOWN && juego.getDibujante().getPasos().getPasos_horizontales()[juego.getYo().getCasillax()][juego.getYo().getCasillay() + 1]) {
            juego.getYo().setY(juego.getYo().getY() + juego.getDibujante().getAlto_camino());
            juego.getYo().setCasillay(juego.getYo().getCasillay() + 1);
        }
        

        if (juego.getYo().getCasillax() == juego.getLaberinto().getPasos().getColumnaFinal() && juego.getYo().getCasillay() == juego.getLaberinto().getPasos().getFilaFinal()) {
            
            JFrame gane = new JFrame("Play & Win");
            JLabel m = new JLabel("Ganaste");
            gane.add(m);
            gane.pack();
            gane.setLocationRelativeTo(null);
            gane.setVisible(true);
            
        }
        juego.getDibujante().setPlayers(juego.getYo());
        juego.getDibujante().preparar_imagen();
    }
    
}
