/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brad Michel
 */
public class Pasos extends SQLQuery {

    private boolean[][] pasos_horizontales, pasos_verticales;
    private boolean[][] pasos_horizontalesLeer = {{false, true, true, false, true, true, true, true, false, true, true, true, false, true, true, false}, {false, false, true, true, true, false, true, true, false, true, false, true, true, true, false, false}, {false, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false}, {false, true, true, false, true, true, false, true, false, false, false, false, false, false, false, true}, {false, false, false, true, false, false, true, false, false, true, false, true, false, false, true, true}, {false, true, true, true, false, true, false, false, true, true, false, false, false, false, true, true}, {false, false, false, true, true, false, false, true, true, false, false, false, true, true, false, false}, {false, false, false, false, true, true, true, true, true, false, true, false, false, true, false, false}, {false, true, false, true, true, false, true, true, false, false, false, true, true, false, false, true}, {false, false, true, true, false, true, false, false, true, true, false, false, false, true, false, false}, {false, true, true, false, true, true, false, true, true, false, true, false, false, true, true, false}, {false, false, true, false, false, true, false, true, false, true, false, false, false, true, true, true}, {false, false, true, true, false, false, true, false, false, true, false, true, true, false, false, true}, {false, true, true, false, false, true, true, false, true, false, true, false, true, false, true, false}, {false, false, true, true, true, true, true, false, false, true, true, false, false, true, true, true}, {false, true, true, true, false, true, true, true, false, true, true, true, true, true, false, false}, {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}};
    private boolean[][] pasos_verticalesLeer = {{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, false, false, true, false, false, false, true, true, false, false, false, true, false, true, true}, {true, false, false, true, false, true, false, false, true, true, false, false, true, false, true, true}, {true, true, true, false, false, true, false, false, true, true, true, false, true, true, true, true}, {false, true, true, false, true, false, true, true, true, false, true, true, false, true, false, false}, {true, false, false, true, true, false, true, true, false, true, false, true, true, false, false, true}, {true, false, false, true, false, true, true, false, false, true, true, true, true, true, true, false}, {false, true, true, false, false, true, false, false, true, false, true, true, false, false, true, true}, {true, true, true, false, false, false, false, false, true, true, true, false, true, true, false, true}, {true, true, false, false, true, true, false, true, false, true, true, false, false, true, true, true}, {true, false, false, true, false, false, true, false, false, false, false, true, true, false, true, true}, {true, false, true, true, false, true, true, false, false, true, true, true, false, false, false, true}, {true, true, false, false, true, false, true, true, true, false, true, true, false, true, false, false}, {false, false, false, true, true, false, true, true, false, true, false, false, true, true, true, true}, {true, false, false, true, false, false, false, true, true, false, true, true, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, true, false, true, true, true}, {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}};

    private int filaFinal, columnaFinal, filas, columnas;

    public Pasos(int div_ancho, int div_alto) {

        pasos_horizontales = new boolean[div_ancho + 1][div_alto + 1];
        pasos_verticales = new boolean[div_ancho + 1][div_alto + 1];
        filas = div_alto + 1;
        columnas = div_ancho + 1;
    }

    public void consultar_laberinto() {

        for (int i = 0; i < filas-1; i++) {
            for (int j = 0; j < columnas-1; j++) {
            pasos_horizontales[i][j] = pasos_horizontalesLeer[i][j];

              pasos_verticales[i][j]= pasos_verticalesLeer[i][j];
            }
        }
//pasos_horizontales[r1.getInt("Columna")][r1.getInt("Fila")] = r1.getBoolean("Horizontal");
        //pasos_verticales[r1.getInt("Columna")][r1.getInt("Fila")] = r1.getBoolean("Vertical");
//this.consulta = this.conn.prepareStatement("SELECT * FROM laberinto WHERE Id_laberinto = '" + id_laberinto + "'");
//filaFinal = r2.getInt("Fila");
//columnaFinal = r2.getInt("Columna");
    }

    public boolean[][] getPasos_horizontales() {
        return pasos_horizontales;
    }

    public boolean[][] getPasos_verticales() {
        return pasos_verticales;
    }

    public int getFilaFinal() {
        return filaFinal;
    }

    public int getColumnaFinal() {
        return columnaFinal;
    }

}
