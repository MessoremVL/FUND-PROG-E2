
package eva2_32_continue;


public class EVA2_32_CONTINUE {

   
   public static void main(String[] args) {

      //CONTINUE ----> INTERRUMPE LA ITERACION ACTUAL
      //BREAK -----> DETIENE EL CICLO POR COMPLETO
      for(int i = 0; i <=20; i++){
         //para saber si es par, me interesa el residuo de dividir
         //entre 2
         int residuo = i % 2;
         if(residuo == 0){// el numero es par
         System.out.println("-" + i );
         continue; // interrumpe la iteracion actual
         
         }
         ;
      }
   }
   
}
