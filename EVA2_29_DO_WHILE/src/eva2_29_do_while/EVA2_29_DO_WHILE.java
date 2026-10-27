
package eva2_29_do_while;

import java.util.Scanner;


public class EVA2_29_DO_WHILE {

   
   public static void main(String[] args) {
     Scanner cap = new Scanner(System.in);
     int monto, cuenta = 5000;
     
     do{ //EJECUCION AL MENOS UNA VEZ
     System.out.println("Cuanto quieres retirar?");
     //ACUMULADOR
     monto = cap.nextInt();
     
     cuenta = cuenta - monto;
     System.out.println("Tu saldo es = " + cuenta);
     }while(cuenta > 0);
   System.out.println("Se te acabo el dinero");
   }
   
}
