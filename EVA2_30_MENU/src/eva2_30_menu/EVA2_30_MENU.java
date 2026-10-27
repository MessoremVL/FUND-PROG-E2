
package eva2_30_menu;

import java.util.Scanner;


public class EVA2_30_MENU {

   public static void main(String[] args) {
   Scanner cap = new Scanner(System.in);

   int opcion;
   
   do{
   System.out.println("-------MENU DEL SISTEMA--------");
   System.out.println("1.Ventas");
   System.out.println("2.Compras");
   System.out.println("3.Proveedores");
   System.out.println("4.Clientes");
   System.out.println("5.Salir");
   opcion = cap.nextInt();
   cap.nextLine();

   }while(opcion != 5); // != ----> diferente de
   //EN TODOS LOS CICLOS: LA REPETICION SE REALIZA CUANDO
   //LA CONDICION ES VERDADERA. TERMINA CUANDO LA CONDICION ES FALSA
   
    System.out.println("Saliendo del sistema!!");
   }
   
}
