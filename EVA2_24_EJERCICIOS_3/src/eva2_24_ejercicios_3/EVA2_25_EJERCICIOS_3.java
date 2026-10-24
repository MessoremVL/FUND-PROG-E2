
package eva2_24_ejercicios_3;

import java.util.Scanner;

public class EVA2_25_EJERCICIOS_3 {

   public static void main(String[] args) {

      int num;
    
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("INGRESA UN NUMERO ");
     num = cap.nextInt();
     cap.nextLine();
    
     
     for(int i = 1; i <= 10; i++){
        
     
       System.out.println(num + " x " + i + "= " + num * i);
     }
   }
   
}
