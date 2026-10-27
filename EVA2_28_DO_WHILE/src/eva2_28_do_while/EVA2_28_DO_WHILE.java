
package eva2_28_do_while;

import java.util.Scanner;


public class EVA2_28_DO_WHILE {
   static final String USUARIO = "admin";
   static final String CONTRA = "admin";
   public static void main(String[] args) {
     Scanner cap = new Scanner(System.in);
     String usu, pwd;
     
     do {
        System.out.println("USUARIO: ");
        usu = cap.nextLine();
        System.out.println("CONTRASEÑA: ");
        pwd = cap.nextLine();
        
        
     }while(!(usu.equals(USUARIO)) || !(pwd.equals(CONTRA)));
  
     
     System.out.println("ACCESO CONCEDIDO");
        
   
   }
   
        
}
