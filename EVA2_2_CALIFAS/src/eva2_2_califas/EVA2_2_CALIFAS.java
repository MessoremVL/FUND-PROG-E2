/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calif;
        Scanner cap = new Scanner (System.in);
        System.out.println("CUAL ES TU CALIFICACIÓN");
        calif = cap.nextInt();
        if(calif >= 70){ 
            System.out.println("PASASTE LA UNIDAD, FELICIDADES!!");
        } 
        else{ 
            System.out.println("NO PASASTE LA UNIDAD, ECHALE MAS GANAS!!");
        }           
    }
    
}
    
    

