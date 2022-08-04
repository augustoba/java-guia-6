
package ejercicio6;

import static ejercicio6.MainEjercicio6.read;

public class servicioCafetera {
    
    
    public static void cargarCafetera(Cafetera a){
        System.out.println("ingresar la capacidad maxima de la cafetera");
        a.setCapacidadMaxima(read.nextInt());
        System.out.println("ingrese la cantidad actual de cafe");
        a.setCantidadActual(read.nextInt());
        
    }
    
    
    public static void llenarCafetera(Cafetera a){
        System.out.println("la cafetera se esta llenando..........");
        
        a.setCantidadActual(a.getCapacidadMaxima());
        System.out.println("......");
        System.out.println("............");
        System.out.println("................");
        System.out.println("cafetera llena!!!!");
    }

    public static void servirTaza(Cafetera a){
        
        int taza;
        
        System.out.println("ingrese el tamaño de la taza");
        taza=read.nextInt();
        
        if (taza < a.getCantidadActual()  )   {
            
           a.setCantidadActual(a.getCantidadActual()-taza);
            
        }else {
            
             System.out.println("la taza tiene el total de : " + a.getCantidadActual());
             a.setCantidadActual(0);
           
        }
    } 
    
    
    public static void vaciarCafetera(Cafetera a){
        System.out.println("vaciando cafetera....");
        a.setCantidadActual(0);
        System.out.println("......");
        System.out.println("............");
        System.out.println("................");
        System.out.println("cafetera vacia!!!");
    }
    
    public static void agregarCafe(Cafetera a){
        System.out.println(" ingrese la cantidad de cafe");
        a.setCantidadActual(read.nextInt());
    }
    
    public static void desplegarMenu(Cafetera a){
        int opc;
        
        
        do {
            
            System.out.println("ingrese una opcion...");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            opc=read.nextInt();
            
            switch(opc){
                
                case 1:
                    llenarCafetera(a);
                    break;
                    
                case 2:
                    servirTaza(a);
                    break;
                    
                    
                 case 3:
                     vaciarCafetera(a);
                    break;  
                    
                    
                 case 4:
                     agregarCafe(a);
                    break; 
               
                 default :
                     System.out.println("ingrese una opcion correcta");
            }
            
            
            
        } while (true);
        
        
    }
    
    
}
