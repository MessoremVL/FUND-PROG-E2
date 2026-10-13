
package eva2_10_califas;

import java.util.Scanner;


public class EVA2_10_CALIFAS {

   
    public static void main(String[] args) {
      Scanner cap = new Scanner(System.in);
      
        int prom;
        
        System.out.println("CUAL ES TU PROMEDIO");
        prom = cap.nextInt();
            if(prom < 0 ){
             System.out.println("DATO INVALIDO!");
        }else if(prom > 100){
                  System.out.println("DATO INVALIDO!");
             
        }else if (prom < 70){
             System.out.println("INSUFICIENTE ");
        }else if (prom < 80){
             System.out.println("ACEPTABLE ");
        }else if (prom < 90){
             System.out.println("BUENO");
        }else if (prom >= 90){
           System.out.println("SOBRESALIENTE"); 
            
    }
    }
    
}
