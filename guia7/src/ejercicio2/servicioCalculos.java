
package ejercicio2;

import static ejercicio2.MainEjercicio2.read;

public class servicioCalculos {
    
    
    public static void crearCircunferencia(Circunferencia a){
        
        System.out.println("ingrese el radio");
        a.setRadio(read.nextDouble());
              
        
    }
    
    public static double area(Circunferencia a){
        
        double area = Math.PI*a.getRadio();
        
        return area;
     }
    
    public static double perimetro(Circunferencia a){
        
        double perimetro = 2*Math.PI*a.getRadio();
        
        return perimetro;
     }
    
    public  static void total(Circunferencia a){
        System.out.println("el area es: " + area(a));
        System.out.println("el perimetro es: " + perimetro(a) );
        System.out.println(a.toString());
}
      
    
}
