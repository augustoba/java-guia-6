
package ejercicio9;

public class servicioMatematica {
    
    public static void  cargarValores(Matematica a){
        
        a.setNum1(Math.random()* 10 + 1);
        a.setNum2(Math.random()* 10 + 1);
    }

    
    public static void devolverMayor(Matematica a){
        if (a.getNum1()> a.getNum2()) {
            
            System.out.println("el numero mayor es : " + a.getNum1());
            
        }else{
            System.out.println("el numero mayor es : " + a.getNum2());
        }
            
    }
    
    
    public static void calcularPotencia(Matematica a){
        double numero1,numero2;
        numero1= Math.round(a.getNum1());  
        numero2= Math.round(a.getNum2());
        
        if (a.getNum1() > a.getNum2()) {        
        System.out.println("la potencia es " + Math.pow(numero1,numero2));
        }else {
            System.out.println("la potencia es " + Math.pow(numero2,numero1));
        }
        
        
         
    }
    
    
    public static void calcularRaiz(Matematica a){
        int numero1,numero2;
        numero1= (int) Math.abs(a.getNum1());
        numero2= (int) Math.abs(a.getNum2());
        
        if (numero1 > numero2) {   
            
            int aux = (int) Math.sqrt(a.getNum1());
            System.out.println("la raiz cuadrada es:" + aux);
        }else {
            
            int aux = (int) Math.sqrt(a.getNum2());
            System.out.println("la raiz cuadrada es " + aux);
        }
        
        
         
    }
    
}
