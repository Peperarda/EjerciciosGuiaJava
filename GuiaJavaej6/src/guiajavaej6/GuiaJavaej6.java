/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaej6;

import java.util.Scanner;

/**
 *
 * @author pulaf
 */
public class GuiaJavaej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          System.out.println("Ingrese un número");
          int num= leer.nextInt();
          boolean fov= false;
          if (num%2==0){
              fov= true;
              System.out.println("El número es par");
             } 
              else {
              fov=false;
              System.out.println("El número es impar");
          }
                  
        // TODO code application logic here
    }
    
}
