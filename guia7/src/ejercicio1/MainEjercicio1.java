//1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.

package ejercicio1;



import static ejercicio1.servicioLibro.cargarLibro;
import java.util.Scanner;



public class MainEjercicio1 {

   static Scanner read = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        cargarLibro(libro1);
        System.out.println(libro1.toString());
    }

}
