/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TEMPERATURA
        //35 MUY CALIDA
        //20 AGRADABLE
        //10 FRESCO
        //MUY FRIO
        int temp;
        Scanner cap = new Scanner(System.in);
        System.out.println("CUAL ES LA TEMPERATURA: ");
        temp = cap.nextInt();
        if(temp >= 35){
             System.out.println("MUY CÁLIDO!!");
        }else if(temp >= 20){
                  System.out.println("AGRADABLE!!");
             
        }else if (temp >= 10){
             System.out.println("FRESCO!! ");
        }else{
             System.out.println("CONGELANTE!! ");
        }
    }
    
}
