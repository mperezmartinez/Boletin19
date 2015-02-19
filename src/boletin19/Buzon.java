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
        System.out.println(tam);
        return tam;
    }

    public void add() {
        String c=JOptionPane.showInputDialog(null, "Contido: ");
        cor.add(new Correo(c,false));
    }

    public void porLeer() {
        int aux=0;
        for (Correo ex : cor) {

            if (ex.getLeido() == false) {
                aux+=1;
            }
        }
        System.out.println("Quedan "+ aux+" correos por leer");
    }

    public String primerNoLeido() {
        String c = "";
        int aux=0;
        for (Correo ex : cor) {
            if (ex.getLeido() == false) {
                c = ex.getContenido();
                System.out.println(c);
                ex.setLeido(true);
                aux=1;
                break;
            }else{
                aux=0;
            }
            
        }
        if (aux==0)
                System.out.println("Todos leidos");
        return c;
    }

    public String mostrar() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
        String m = cor.get(p).getContenido();
        System.out.println(m);
        return m;
    }

    public void delete() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
        cor.remove(p);
    }
}
