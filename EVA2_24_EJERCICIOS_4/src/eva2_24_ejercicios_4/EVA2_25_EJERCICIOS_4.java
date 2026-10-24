
package eva2_24_ejercicios_4;

import java.util.Scanner;


public class EVA2_25_EJERCICIOS_4 {

 
   public static void main(String[] args) {
       int num1,num2;
    
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("INGRESA LA BASE DEL NUMERO ");
     num1 = cap.nextInt();
     cap.nextLine();
     
     System.out.println("INGRESA EL EXPONENTE ");
     num2 = cap.nextInt();
     cap.nextLine();
    
     
     for(int i = 1; i <= num2; i++){
        i = num1;
     
       System.out.println(" - " + i );
     }
   }
   
}
