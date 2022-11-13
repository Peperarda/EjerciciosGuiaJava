/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaej5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author pulaf
 */
public class GuiaJavaej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          System.out.println("Escriba un número");
          int num = leer.nextInt();
          int por2 = num*2;
          int por3= num*3;
          double raiz= sqrt(num);
          System.out.println("El número ingresado es: "+num);
          System.out.println("El doble del número es: "+por2);
          System.out.println("El triple del número es: "+por3);
          System.out.println("La raíz cuadrada del número es: "+raiz);
                  
        // TODO code application logic here
    }
    
}
