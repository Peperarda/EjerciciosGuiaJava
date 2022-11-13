/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaej3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author pulaf
 */
public class GuiaJavaej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase");
        String frase= leer.nextLine();
        frase=frase.toUpperCase(); 
        System.out.println(frase);
        frase=frase.toLowerCase();
        System.out.println(frase);
        // TODO code application logic here
    }
    
}
