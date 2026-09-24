/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_5_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //ANIDAMIENTO:
   int edad, credencial;
   Scanner cap = new Scanner(System.in);
   
   System.out.println("CUAL ES TU EDAD?: ");
   edad = cap.nextInt();
   if(edad >= 18){
       System.out.println("TIENES CREDENCIAL DE ELECTOR? (1 = si, 0, = no:");
       credencial = cap.nextInt();
       if(credencial == 1){//TIENE CREDENCIAL
           System.out.println("PUEDES PASAR");
       }else{
           System.out.println("NO PUEDES PASAR!!");
       }
   }else{
       System.out.println("KICK IN THE BACK!!");
   }
   
    
    }
    
}
