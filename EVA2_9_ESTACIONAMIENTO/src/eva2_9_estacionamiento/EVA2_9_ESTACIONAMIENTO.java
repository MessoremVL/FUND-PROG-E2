
package eva2_9_estacionamiento;

import java.util.Scanner;


public class EVA2_9_ESTACIONAMIENTO {

    
    public static void main(String[] args) {
                int horas, pago;
        Scanner cap = new Scanner(System.in);
        System.out.println("HORAS DE ESTACIONAMIENTO: ");
        horas = cap.nextInt();
        
        if(horas <= 2){
        pago = horas * 25;
 
            System.out.println("PAGAS: " + pago+"$");
             
             
        }else if(horas <= 5){
        pago = horas * 20;
 
            System.out.println("PAGAS: " + pago+"$");
             
        }else if (horas <= 10){
        pago = horas * 15;
 
            System.out.println("PAGAS: " + pago+"$");
        }else if(horas > 10){
        pago = 150;
 
            System.out.println("PAGAS: " + pago+"$");
        }
    }
    

        
    }
    


