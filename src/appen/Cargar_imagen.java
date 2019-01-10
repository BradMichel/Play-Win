/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Brad Michel
 */
public class Cargar_imagen {

    private Image imagen;
    
    public Cargar_imagen( String ref) {
        URL url = this.getClass().getClassLoader().getResource("img/" + ref);
        BufferedImage buffer = null;
        try {
            buffer = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
        }

        GraphicsConfiguration gconfig = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        imagen = gconfig.createCompatibleImage(buffer.getWidth(), buffer.getHeight(), Transparency.BITMASK);

        imagen.getGraphics().drawImage(buffer, 0, 0, null);

    }

    public Image getImagen() {
        return imagen;
    }
    
    
    
}
