
package ejercicio3;

import java.util.Scanner;

import static ejercicio3.servicioOperacion.*;

public class MainEjercicio3 {
 static Scanner read = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        Operacion op = new Operacion();
        ingresarNumeros(op);
        System.out.println(op.toString());
        System.out.println("la suma es: " + sumarNumeros(op));
        System.out.println("la resta es: "+ restarNumeros(op));
        System.out.println("la multiplicacion es: " + multiplicarNumeros(op));
        System.out.println("la division es: " + dividirNumeros(op));
    }

}
