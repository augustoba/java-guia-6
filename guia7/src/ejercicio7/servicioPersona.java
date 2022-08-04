
package ejercicio7;

import static ejercicio7.MainEjercicio7.read;

public class servicioPersona {

    
    public static void crearPersona(Persona a){
        String sexo;
        System.out.println("ingrese su nombre");
        a.setNombre(read.nextLine());
        System.out.println("ingrese su edad");
        a.setEdad(read.nextInt());
        
        System.out.println("ingrese su sexo H para hombre, F para mujer, O para otro.");
        sexo=read.next();
        
        if ((sexo.toLowerCase() == "h") || (sexo.toLowerCase() == "m")||(sexo.toLowerCase() == "o")) {
            a.setSexo(sexo);
            
        }else{
            System.out.println("ingrese una opcion correcta"); 
        }
        
        
    }
    
    public static double calcularIMC(Persona p) {

        double imc;

        imc = p.getPeso() / (p.getAltura() * p.getAltura());

        if (imc < 20) {
            System.out.println("Esta por debajo del peso ideal");

            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("Esta en su peso ideal");

            return 0;
        } else {
            System.out.println("Esta con sobrepeso");

            return 1;
        }

    }
    
    public static boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }
}
