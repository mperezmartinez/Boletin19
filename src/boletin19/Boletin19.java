/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author Miguel
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Buzon b=new Buzon();
        
       int op;
        do {
            op = b.menu();
            switch(op){
                case 1:b.add();
                    break;
                case 2:b.numCorreos();
                    break;
                case 3:b.mostrar();
                    break;
                case 4:b.primerNoLeido();
                    break;
                case 5:b.porLeer();
                    break;
                case 6:b.delete();
                    break;
                case 7:if(op == 7 && op == 0)
                    System.exit(0);
            }

        } while (op != 7 && op != 0);
    }
    
}
