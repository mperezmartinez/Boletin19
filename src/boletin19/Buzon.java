/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Buzon {

    public ArrayList<Correo> cor = new ArrayList<Correo>();

    public Buzon() {
    }
    
     public int menu() {

        int op= JOptionPane.showOptionDialog(
                null,"Selecciona una opción","Menú",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                "Crear Correo",
                "Número de correos",
                "Mostrar(posición)",
                "Mostrar primero sin leer",
                "Correos por leer",
                "Borrar correo",
                "Exit"},
                "Exit");
        return op+1;
    }

    public int numCorreos() {
        int tam = cor.size();
        return tam;
    }

    public void add() {
        JOptionPane.showInputDialog(null, "Contido: ");
        cor.add(new Correo());
    }

    public void porLeer() {
        for (Correo ex : cor) {
            boolean n = ex.getLeido();
            if (ex.getLeido() == false) {
                System.out.println("Non quedan por leer");
            } else {
                System.out.println("Quedan por ler");
            }
        }
    }

    public String primerNoLeido() {
        String c = "Todos leidos";
        for (Correo ex : cor) {
            if (ex.getLeido() == false) {
                c = ex.getContenido();
            }
        }
        return c;
    }

    public String mostrar() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
        String m = cor.get(p).getContenido();
        return m;
    }

    public void delete() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
        cor.remove(p);
    }
}
