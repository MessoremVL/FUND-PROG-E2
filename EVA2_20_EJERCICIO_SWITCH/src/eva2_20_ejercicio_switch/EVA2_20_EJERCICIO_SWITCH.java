
package eva2_20_ejercicio_switch;

import java.util.Scanner;


public class EVA2_20_EJERCICIO_SWITCH {

   
   public static void main(String[] args) {
     Scanner cap = new Scanner(System.in);
     //CALCULADORA:
     //PEDIR DOS VALORES ENTEROS
     //PERID LA OPERACION:
     //1 SUMA
     //2 RESTA
     //3 MULTIPLICACION
     //4 DIVISION
     //CUALQUIER OTRO VALOR ---> OPERACION NO VALIDA
     //MOSTRAR EL RESULTADO
     
     int ope;
     double ent1,ent2, res;
        
     System.out.println("DAME EL PRIMER VALOR ENTERO PARA LA OPERACION: ");
     ent1 = cap.nextDouble();
     
     System.out.println("DAME EL SEGUNDO VALOR ENTERO PARA LA OPERACION: ");
     ent2 = cap.nextDouble();
     
     System.out.println("QUE OPERACION QUIERES HACER(1-SUMA  2-RESTA  3-MULTIPLICACION  4-DIVISION): ");
     ope = cap.nextInt();
     
     switch(ope){
      case 1:
         res = ent1 + ent2;
         System.out.println("RESULTADO: " + res );
      break;
      
      case 2:
      res = ent1 - ent2;
         System.out.println("RESULTADO: " + res );
      break;
      
      case 3:
      res = ent1 * ent2;
         System.out.println("RESULTADO: " + res );
      break;
      
      case 4:
      res = ent1 / ent2;
         System.out.println("RESULTADO: " + res );
      break;
      default: 
      System.out.println("OPERACION INVALIDA");

      
   }
     
     
     
   }
   
}
