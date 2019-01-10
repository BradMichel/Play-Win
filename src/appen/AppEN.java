/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import com.sun.org.apache.bcel.internal.Constants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class AppEN {

    private static JFrame inicio;
    private static JTextField nombreJtextField;
    private static JPasswordField contraseñaJtextField;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //    Persona prueba = new Persona(null,"bradmichel@hotmail.com","12345678");
         inicio = new JFrame("Play & Win");
       
        
        JPanel registro = new JPanel(new GridLayout(3,2));

        JLabel nombreJlabel = new JLabel("Ingrese su Nickname: ");
        registro.add(nombreJlabel);
        nombreJtextField = new JTextField();
        registro.add(nombreJtextField);

        
        inicio.add(new JLabel("Logueate para comenzar a jugar "));
        inicio.add(registro);
        registro.add(new JLabel(" "));
        JButton inicioJboton = new JButton("Iniciar");
                inicioJboton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                   
            inicio.setVisible(false);
     
            Persona persona = new Persona(nombreJtextField.getText());
                       
        VentanaJuego L1 = new VentanaJuego(nombreJtextField.getText());              

            }
        });
        registro.add(inicioJboton);
        
        inicio.setDefaultCloseOperation(3);
        inicio.setSize(300, 150);
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);


    }


}
