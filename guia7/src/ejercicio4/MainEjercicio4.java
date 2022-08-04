
package ejercicio4;

import static ejercicio4.servicioRectangulo.*;
import java.util.Scanner;

public class MainEjercicio4 {

  static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        Rectangulo rec = new Rectangulo();
         pedirDatos(rec);
        crearRectangulo(rec);
        System.out.println("la superficie es: " + mostrarSuperficie(rec));
    }

}
