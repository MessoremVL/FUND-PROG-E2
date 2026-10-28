
package eva2_33_break;

import java.util.Scanner;


public class EVA2_33_BREAK {

 
   public static void main(String[] args) {
    Scanner cap = new Scanner(System.in);
      
      int valor =10, nume;
    
    while(true){//ciclo infinito
       System.out.println("introduce un valor");
       nume = cap.nextInt();
       
       if(nume == valor){
          System.out.println("ADIVINASTE, EL VAOR ES 10, GANASTE!!");
       break;
       }
       
    
    }
    
   }
   
}
