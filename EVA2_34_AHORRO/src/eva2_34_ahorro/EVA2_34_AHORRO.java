
package eva2_34_ahorro;

import java.util.Scanner;


public class EVA2_34_AHORRO {

   public static void main(String[] args) {
     //depositar hasta que llegue a la meta
   Scanner cap = new Scanner(System.in);

     int ahorro = 15000, deposito;
     int cuenta = 0;
     while(true){
        System.out.println("Introduce el deposito:");
        deposito = cap.nextInt();
        //VERIFICAR SI NO NOS ESTAMOS PASANDO
        if((cuenta + deposito) > ahorro){
           System.out.println("Te pasaste de la meta");
           continue;
        }
        cuenta += deposito;
        System.out.println("CUENTA: " + cuenta);
        if(cuenta == ahorro){
           System.out.println("META CUMPLIDA!!");
           break;//detiene el ciclo por completo
        }
        
     }
   }
   
}
