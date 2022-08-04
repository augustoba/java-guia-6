package ejercicio1;

import static ejercicio1.MainEjercicio1.read;


public class servicioLibro {

   public static void cargarLibro(Libro carga){
       System.out.println("ingrese el ISBN del libro");
       carga.setIsbn(read.nextInt());
       
       System.out.println("ingrese el titulo del libro");
       read.next();
       carga.setTitulo(read.nextLine());       
       System.out.println("ingrese el autor");
       carga.setAutor(read.nextLine());
       System.out.println("ingrese el numero de paginas");
       carga.setNumerodePagina(read.nextInt());
       
       
   }
}
