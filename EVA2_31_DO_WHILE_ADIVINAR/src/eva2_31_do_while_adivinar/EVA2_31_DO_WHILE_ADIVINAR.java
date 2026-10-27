
package eva2_31_do_while_adivinar;

import java.util.Scanner;

public class EVA2_31_DO_WHILE_ADIVINAR {

   public static void main(String[] args) {
      //PIDE AL USUARIO ADIVINAR UN NUMERO,
      //TERMINA CUANDO ADIVINA EL NUMERO
      
         Scanner cap = new Scanner(System.in);

   int num;
    System.out.println("ADIVINA EL NUMERO DEL 1-100");
   do{

   num = cap.nextInt();
   cap.nextLine();
   

   }while(num != 72); 
   
    System.out.println("FELICIDADES ADIVINASTE");
   }
   
}
