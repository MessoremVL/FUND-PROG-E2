
package eva2_24_ejercicios_1;

import java.util.Scanner;

public class EVA2_24_EJERCICIOS_1 {

 static void main(String[] args) {
 int num1,num2;
    
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("Numero inicial ");
     num1 = cap.nextInt();
     cap.nextLine();
     System.out.println("Numero final ");
     num2 = cap.nextInt();
     cap.nextLine();
     
     for(int i = num1; i <= num2; i++){
  
     
       System.out.println(" - " + i);
     }
    
      
   }
   
}
