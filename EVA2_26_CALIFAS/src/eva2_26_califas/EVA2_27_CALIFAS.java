

package eva2_26_califas;

import java.util.Scanner;



public class EVA2_27_CALIFAS {

  
   
   public static void main(String[] args) {
      Scanner cap = new Scanner(System.in);
      int califa = 0;
      double promedio;
      
      while(califa > -1){
      System.out.println("INTRODUCE LA CALIFICACION A CAPTURAR: (-1 PARA TERMINAR)");
      califa = cap.nextInt();
      cap.nextLine();
      promedio = califa / 1.0;
      
      System.out.println(promedio);
      }
     
      
   }
   
}
