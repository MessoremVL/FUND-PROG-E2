
package eva2_18_switch;

import java.util.Scanner;


public class EVA2_18_SWITCH {


   public static void main(String[] args) {
      
      Scanner cap = new Scanner(System.in);
      System.out.println("INTRODUCE EL NUMERO DEL DIA (1-7): ");
      int dia = cap.nextInt();
      
      switch(dia){
         case 1:
            System.out.println("DOMINGO");
            //AQUI PODEMOS PONER CUANTAS INSTRUCCIONES NECESITEMOS
            break;//TERMINA EL CASO Y EL SWITCH, LOS 2
         
            case 2:
            System.out.println("LUNES");
            break;
           
            case 3:
            System.out.println("MARTES");
            break;
            
            case 4:
            System.out.println("MIERCOLES");
            break;
           
            case 5:
            System.out.println("JUEVES");
            break;
            
            case 6:
            System.out.println("VIERNES");
            break;
            
            case 7:
            System.out.println("SABADO");
            break;
            default: // opcional: que hago si no es ninguna de las opciones
               System.out.println("DIA NO VALIDO");

      }
   }
   
}
