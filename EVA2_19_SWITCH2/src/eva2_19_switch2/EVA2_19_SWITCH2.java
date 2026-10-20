
package eva2_19_switch2;

import java.util.Scanner;


public class EVA2_19_SWITCH2 {

 
   public static void main(String[] args) {
   Scanner cap = new Scanner(System.in);
   
   String carrera;
   System.out.println("INTRODUCE LA CARRERA (SISTEMAS, INFORMATICA, ADMINISTRACION)");
   carrera = cap.nextLine();
   
   switch(carrera){ // if (carrera.equals("SISTEMAS"))
      case "SISTEMAS":
      System.out.println("ISC");
      break;
      
      case "INFORMATICA":
      System.out.println("INF");
      break;
      
      case "ADMINISTRACION":
      System.out.println("LA");
      break;
   }

   }
   
}
