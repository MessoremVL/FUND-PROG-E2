/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicios_if_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_EJERCICIOS_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
    double salariom, porciento1, porciento2;
    Scanner cap = new Scanner (System.in);
    System.out.println("CUAL ES TU NOMBRE");
   nombre = cap.next();
   System.out.println("CUAL ES TU SALARIO");
   salariom = cap.nextDouble();
   
   if(salariom < 12000){
       System.out.println("LA EMPRESA TE DA UN BONO DE 10%");
       porciento1 = (salariom * 0.10) + salariom; 
       
       System.out.print("TU SALARIO SERIA DE: ");
       System.out.println(porciento1);
       System.out.println("DATOS");
       System.out.println(nombre);
       System.out.println(salariom);
       System.out.println(porciento1);
       
   }
   else{
        System.out.println("LA EMPRESA TE DA UN BONO DE 5%");
       porciento1 = (salariom * 0.05) + salariom; 
       
       System.out.print("TU SALARIO SERIA DE: ");
       System.out.println(porciento1);
       System.out.println("DATOS");
       System.out.println(nombre);
       System.out.println(salariom);
       System.out.println(porciento1);
   }
    }
    
}
