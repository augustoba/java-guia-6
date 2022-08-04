
package ejercicio5;

import static ejercicio5.MainEjercicio5.read;


public class servicioCuenta {
   

    public static void cargarDatos(Cuenta a){
        System.out.println("ingrese su numero de cuenta");
        a.setNumeroCuenta(read.nextInt());
        System.out.println("ingrese su Dni");
        a.setDni(read.nextLong());
        System.out.println("ingrese el saldo actual");
        a.setSaldo(read.nextDouble());
        
        
        
    }
    
    public static double ingresarSaldo(Cuenta a){
        
        double saldo;
        System.out.println("ingrese el saldo");
        
        saldo=read.nextDouble()+a.getSaldo();
        a.setSaldo(saldo);
                
        return saldo;
       
        
        
    }
    
    public static void retirarDinero(Cuenta a){
        
        double saldo,aux;
        
        System.out.println("ingrese la cantidad de dinero a retirar");
        aux=read.nextDouble();
        saldo=a.getSaldo();
        
        
        if (aux > saldo) {
            
             a.setSaldo(0);
        }else{
                        
            a.setSaldo(saldo-aux);
        }
            
    }
    
    public static void extraccionRApida(Cuenta a){
        double saldo, aux;
              
        System.out.println("ingrese la cantidad de dinero a retirar");
        aux=read.nextDouble();
               
        if (aux <= (a.getSaldo()*.2)) {
           
            saldo=a.getSaldo();
            a.setSaldo(saldo-aux);
          
            
        } else{
            
            System.out.println("su extraccion supera el 20% permitido, saldo: " + a.getSaldo());
        }
     }
    
    public static void  consultarSaldo(Cuenta a){
        
        System.out.println(a.getSaldo());
    }
    
    public static void  consultarDatos(Cuenta a){
        
        System.out.println(a.toString());
    }
    
    
            
        
    
       public  static void menu(Cuenta a){
            int opc;
            
            do {
            System.out.println("ingrese una opcion");
            System.out.println("1- crear cuenta ");
            System.out.println("2- ingresar dinero");
            System.out.println("3- retirar dinero");
            System.out.println("4- extraccion rapida");
            System.out.println("5- consultar saldo");
            System.out.println("6- consultar datos");
            System.out.println("7- salir");
            opc=read.nextInt();
        
    switch(opc){
        
        case 1:
        cargarDatos(a);
        break;
        case 2:
        ingresarSaldo(a);
        break;
        case 3:
        retirarDinero(a);
        break;
        case 4:
        extraccionRApida(a);
        break;
        case 5:
        consultarSaldo(a);
        break;
        case 6:
        consultarDatos(a);
        break;
        case 7:
        break;
        
        default:
        System.out.println("ingrese una opcion correcta");
    }
    }  while (opc != 7);
    
     
  
 }   
 
} 