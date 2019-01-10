/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.awt.Canvas;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author ASUS
 */
public class Persona extends SQLQuery {

    private int Id_persona;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Puntuacion;

    public Persona(String Nombre) {
  
        this.Nombre = Nombre;
        

    }

    public int getId_persona() {
        return Id_persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setId_persona(int Id_persona) {
        this.Id_persona = Id_persona;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

}
