
package eva2_21_ciclos;

public class EVA2_21_FOR {

 
   public static void main(String[] args) {
   
      //IMPRIMIR UN LISTADO DE 1 AL 10:
      //ACCESO POR INDICES --> i
      //3 PARAMETROS
      //PUNTO DE PARTIDA
      //CONDICION PARA DETENERSE
      //AVANCE (DE CUANTO EN CUANTO) ---> EN ESTE CASO UNO EN UNO
      for(int i = 1; i <= 10; i ++){
      //instruccion a repetir
         System.out.println( "-"+ i);
      }
      //20 22 24 26 28 30 32 34 36 38
      System.out.println();
      for(int i = 20; i <= 38; i +=2){
       System.out.println( "-"+ i);
      
      }
            System.out.println();
            for(int i = 0; i < 10; i++){
            System.out.println( "-"+ i);
            }
      //del 10 al 1
      //pares entre 0 20
       System.out.println();
      for(int i = 10; i >=1; i --){
         System.out.println( "-"+ i);
      }
       System.out.println();
       for(int i = 0; i <=20; i +=2){
         System.out.println( "-"+ i);
       }
   }
   
}
