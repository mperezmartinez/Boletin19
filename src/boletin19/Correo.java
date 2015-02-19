/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Correo {

    private String contenido;
    private boolean leido;
    

    public Correo() {
    }

    public Correo(String contenido, boolean leido) {
        this.contenido = contenido;
        this.leido = leido;
    }    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean getLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}
