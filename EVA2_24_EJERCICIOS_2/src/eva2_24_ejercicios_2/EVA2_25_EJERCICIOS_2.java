
package eva2_24_ejercicios_2;

import java.util.Scanner;


public class EVA2_25_EJERCICIOS_2 {

   public static void main(String[] args) {

      int num;
      String ac = "";
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("Numero de veces a imprimir ");
     num = cap.nextInt();
     cap.nextLine();
     
     
     for(int i = 1; i <= num; i++){
        ac += ("*");
     
       System.out.println(ac);
     }
   }
   
}
