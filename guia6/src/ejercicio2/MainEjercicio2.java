
package ejercicio2;

import static ejercicio2.servicioCalculos.*;

import java.util.Scanner;


public class MainEjercicio2 {

   static Scanner read = new Scanner(System.in);
  
   
    public static void main(String[] args) {
       
        Circunferencia  C1 = new Circunferencia();
        crearCircunferencia(C1);
        total(C1);
        
    }

}
