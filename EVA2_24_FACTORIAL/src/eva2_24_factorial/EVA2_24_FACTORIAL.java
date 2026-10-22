
package eva2_24_factorial;

import java.util.Scanner;


public class EVA2_24_FACTORIAL {

   public static void main(String[] args) {
    int num, fact = 1;
     
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("Valora a calcular ");
     num = cap.nextInt();
     
     for(int i = 1; i <= num; i++){
        //operacion
        fact = fact * i;//acumulador (en multiplicaciones, debe iniciar en 1)
     }
     System.out.println("Factorial de " + num + " = " + fact);
   }
   
}
