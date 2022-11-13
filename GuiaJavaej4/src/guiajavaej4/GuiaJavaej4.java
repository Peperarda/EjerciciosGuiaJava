/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaej4;

import java.util.Scanner;

/**
 *
 * @author pulaf
 */
public class GuiaJavaej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         System.out.println("Escriba los grados que quiere tranformar a farenheit");
         int grados= leer.nextInt();
         int faren=32+(9*grados/5);
         System.out.println(grados+"°C es igual a : "+faren+"°F");
                 

        // TODO code application logic here
    }
    
}
