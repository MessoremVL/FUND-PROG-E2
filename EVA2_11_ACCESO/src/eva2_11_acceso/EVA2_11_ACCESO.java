
package eva2_11_acceso;

import java.util.Scanner;


public class EVA2_11_ACCESO {
    final static String USUARIO = "admin";
    final static String PWD = "admin";

    public static void main(String[] args) {
      
        String usuario, pwd;
        Scanner cap = new Scanner(System.in);
        System.out.println("USUARIO: ");
        usuario = cap.nextLine();
        System.out.println("PASSWORD: ");
        pwd = cap.nextLine();
        //        if(usuario.equals(USUARIO)
        if(usuario.equals(USUARIO) && pwd.equals(PWD)){
            
            System.out.println("ACCESO CONCEDIDO!!");
           
        }else{
           System.out.println("ACCESO DENEGADO!!!");
            
        }
        
    }
    
}
