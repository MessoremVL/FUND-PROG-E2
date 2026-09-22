
package eva2_1_if;

import java.util.Scanner;


public class EVA2_1_IF {

    
    public static void main(String[] args) {
        int edad;
        Scanner cap = new Scanner (System.in);
        System.out.println("CUAL ES TU EDAD");
        edad = cap.nextInt();
        if(edad >= 18){ //QUE HACEMOS SI ES VERDADERO
            System.out.println("BIENVENIDO, PUEDES PASAR");
        } //EN ESTE CASO COMO SOLO ES UN PRINTLN PARA CADA UNO, PUEDES NO PONERLE LLAVES {}
        else{ //QUE HACEMOS SI ES FALSO (OPCIONAL)
            System.out.println("NO PUEDES PASAR");
        }           
    }
    
}
