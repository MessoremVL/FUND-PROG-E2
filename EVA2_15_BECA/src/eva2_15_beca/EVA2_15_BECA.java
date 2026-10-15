
package eva2_15_beca;

import java.util.Scanner;


public class EVA2_15_BECA {

  
   public static void main(String[] args) {

      Scanner cap = new Scanner(System.in);
      
      int promedio, ingresos;
     
      
       System.out.println("CUALES SON LOS INGRESOS DE TU FAMILIA: ");
      ingresos = cap.nextInt();
      
      
      System.out.println("CUAL ES TU PROMEDIO: ");
      promedio = cap.nextInt();
      
      
      //CONDICIONES PARA DAR BECA:
      if(promedio > 80 && ingresos < 10000){
         System.out.println("BECA CONCEDIDA!!");
      }else{
      System.out.println("BECA DENEGADA!!");
      }
   }
   
}
