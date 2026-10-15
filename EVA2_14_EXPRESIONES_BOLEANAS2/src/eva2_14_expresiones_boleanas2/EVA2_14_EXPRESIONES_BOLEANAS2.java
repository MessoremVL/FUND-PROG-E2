
package eva2_14_expresiones_boleanas2;

import java.util.Scanner;


public class EVA2_14_EXPRESIONES_BOLEANAS2 {

  
   public static void main(String[] args) {
     
      Scanner cap = new Scanner(System.in);
      //BECA
      //PROMEDIO >= 95
      //ESTA EN EQUIPO REPRESENTATIVO
      int promedio;
      String equipoRepresentativo;
      
       System.out.println("ESTAS EN UN EQUIPO REPRESENTATIVO (S/N)? ");
      equipoRepresentativo = cap.nextLine();
      
      
      System.out.println("CUAL ES TU PROMEDIO: ");
      promedio = cap.nextInt();
      
      
      //CONDICIONES PARA DAR BECA:
      if(promedio >= 95 || equipoRepresentativo.equals("S")){
         System.out.println("BECA CONCEDIDA!!");
      }else{
      System.out.println("BECA DENEGADA!!");
      }
      
      
      
   }
   
}
