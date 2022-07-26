
package ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class servicioRectangulo {
    
static Scanner read = new Scanner(System.in);

    public  static  void pedirDatos(Rectangulo a){
    System.out.println("ingrese base del rectangulo");
    a.setBase(read.nextInt());
    System.out.println("ingrese altura del rectangulo");
    a.setAltura(read.nextInt());
        
    
    
}

    public static void crearRectangulo(Rectangulo a){
               
        for (int i = 0; i < a.getAltura(); i++) {
	    for (int j = 0; j < a.getBase(); j++) {
		if(i == 0 || j == 0 || j == a.getBase() - 1 || i == a.getAltura() - 1) {
		    System.out.print(" *  ");
		} else {
		    System.out.print("    ");
		}
	    }
	    System.out.println();
	}
    }
    
    public static double mostrarSuperficie (Rectangulo a){
        double superficie;
        superficie= a.getAltura()*a.getBase();
        return  superficie;
        
    }
}
