
package eva2_13_expresiones_boleanas;


public class EVA2_13_EXPRESIONES_BOLEANAS {

 
   public static void main(String[] args) {

      boolean entrarAntro, tieneCredencial = false;
      int edad =18;
      
      //AND ---> PARA QUE SEA VERDAD, AMBAS EXPRESIONES DEBEN SER VERDAD
      entrarAntro = (edad >= 18) && (tieneCredencial == true);
      System.out.println("Permiso para entrar" + entrarAntro);
      //OPERACIONES BOOLEANAS
      //AND -> Y -> &&
      //OR -> O -> ||
      //NOT -> NEGACION -> !
      
      //OR ---> PARA QUE SEA VERDAD, SOLO UNA (CUALQUIERA) DEBESER VERDAD
      boolean estaSoleado = false, tienesDinero = true;
      boolean permisoSalir;
      
      permisoSalir =(estaSoleado == false) || (tienesDinero == false);
      System.out.println("Permiso para salir de paseo: " + permisoSalir);
      
   }
   
}
