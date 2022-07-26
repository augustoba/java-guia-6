
package ejercicio3;

import static ejercicio3.MainEjercicio3.read;


public class servicioOperacion {

    public static void ingresarNumeros(Operacion a){
        System.out.println("ingrese numero 1");
        a.setNumero1(read.nextInt());
        System.out.println("ingrese numero 2");
        a.setNumero2(read.nextInt());
        
        
        
    }
    
    public static int restarNumeros(Operacion a){
       int resta;
        resta = a.getNumero1()-a.getNumero2();
        
        return resta;
        
    }
    
    public static int sumarNumeros(Operacion a){
       int suma;
        suma = a.getNumero1()+ a.getNumero2();
        
        return suma;
        
    }
    
    
    public static int multiplicarNumeros(Operacion a){
       int multiplicar;
        multiplicar = a.getNumero1()* a.getNumero2();
        
        return multiplicar;
        
    }
    
    public static double dividirNumeros(Operacion a){
        
       double dividir;
       
        dividir = a.getNumero1()/ a.getNumero2();
        
        return dividir;
        
    }
    
}
