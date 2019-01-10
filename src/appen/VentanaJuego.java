/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Brad Michel
 */
public class VentanaJuego extends JFrame {

    private static final int ancho_ventana = 700;
    private static final int alto_ventana = 700;
    private Juego juego;
    private JPanel ventana;
    private KeyListener listener;

    public VentanaJuego(String nickName) {

        ventana = (JPanel) this.getContentPane();
        listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
        juego = new Juego();
        ventana.add(juego.getDibujante());
        setTitle("Play&Win");
        final JButton play = new JButton("play "+ nickName);       
        play.addKeyListener(listener);

        ventana.add(play, BorderLayout.NORTH);
        setSize(ancho_ventana, alto_ventana);
        setVisible(true);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                play.setText("Jugando");                                    
                juego.getDibujante().getPasos().consultar_laberinto();
                juego.getDibujante().preparar_imagen();
                juego.getDibujante().repaint();                  
                juego.actualizar();

            }
        });

        juego.getDibujante().preparar_imagen();
        setDefaultCloseOperation(3);

    }

    public class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

            juego.getComandos().avanzar(e.getKeyCode());
            juego.getDibujante().repaint();

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }

}
