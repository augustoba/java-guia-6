
package ejercicio8;

import static ejercicio8.MainEjercicio8.read;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class servicioCadena {
    
    public  static void ingresarDatos(Cadena a){
        String frase ;
        System.out.println("ingrese la frase ");
        frase=read.nextLine();
        a.setFrase(frase);
        a.setLongitud(frase.length());
        System.out.println(a.getLongitud());
        
        
    }

    public static void mostrarVocales(Cadena a){
        int tamaniofrase,contador;
        String frase;
                
       tamaniofrase= a.getFrase().length();
       contador=0;
        int cont = 0;
	for (int i = 0; i < a.getLongitud() ; i++) {
	    if (a.getFrase().substring(i, i + 1).toLowerCase().equals("a") || 
	        a.getFrase().substring(i, i + 1).toLowerCase().equals("e") || 
		a.getFrase().substring(i, i + 1).toLowerCase().equals("i") || 
		a.getFrase().substring(i, i + 1).toLowerCase().equals("o") ||
		a.getFrase().substring(i, i + 1).toLowerCase().equals("u")) {
		cont++;
	    }
	}
	System.out.println("La cantidad de vocales es: " + cont);
    }
    
   public static void invertirFrase(Cadena a){
       String frase2;
       
       StringBuilder invertir = new StringBuilder(a.getFrase());
	frase2 = invertir.reverse().toString();
	System.out.println("La frase invertida es: " + frase2);
}
   
   public static void vecesRepetido(Cadena a){
       String letra;
       int contador=0;
       
       System.out.println("ingrese una letra");
       letra=read.nextLine();
       
       for (int i = 0; i < a.getLongitud(); i++) {
           if ( a.getFrase().substring(i, i + 1).toLowerCase().equals(letra.toLowerCase())) {
               contador++;
               
           }
           
           
       }
       
       System.out.println("la letra esta repetida : " + contador);
       
   }
   
   public static void compararLongitud(Cadena a){
       String frase2;
       
       System.out.println("ingrese una frase");
       frase2=read.nextLine();
       
       System.out.println("la frase 1 tiene una longitd de: " + a.getLongitud()+ " -La frase 2 tiene una longitud de: " + frase2.length());
       
               
       
   }
   
   public static void unirFrases(Cadena a){
       String frase2;
       System.out.println("ingrese una frase");
       frase2=read.nextLine();
       a.setFrase(a.getFrase()+ " " + frase2);
       System.out.println(a.getFrase());
   }
   
   public static void reemplazar(Cadena a){
       String letra,frase2;
       System.out.println("ingrese una letra");
       letra=read.nextLine();
       frase2=a.getFrase().replaceAll("a", letra);
       System.out.println(frase2);
   }
   
   public static void contiene(Cadena a){
       String letra;
       
       System.out.println("ingrese una letra");
       letra=read.nextLine();
       boolean contiene = a.getFrase().contains(letra);
           
        System.out.println(contiene); 
       
       
       
   }
}
