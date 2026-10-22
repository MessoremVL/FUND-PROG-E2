
package eva2_23_capturar;

import java.util.Scanner;


public class EVA2_23_CAPTURAR {

   public static void main(String[] args) {
     //solicitar calificaciones y promediar
     int cant, califa = 0;
     double promedio;
     
     Scanner cap = new Scanner(System.in);
     
     System.out.println("Cuantas calificaciones vas a capturar? ");
     cant = cap.nextInt();
     cap.nextLine();
     for(int i = 1; i <= cant; i++){
     System.out.println("Captura tu calificacion: ");
     califa = califa + cap.nextInt(); //acumulador
     
     cap.nextLine();
     
     }
     System.out.println("ACUMULADO = " + califa);
     promedio = califa / (cant * 1.0);
          System.out.println("PROMEDIO = " + promedio);

   }
   
}
