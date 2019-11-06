
package masacorporal;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        Dato dato = new Dato();
        
        System.out.println("Ingrese su nombre: ");
        dato.setNombre(s.nextLine());
        System.out.println("Ingrese su apellido paterno: ");
        dato.setApaterno(s.nextLine());
        System.out.println("Ingrese su apellido materno: ");
        dato.setAmaterno(s.nextLine());
        System.out.println("Ingrese su edad: ");
        dato.setEdad(s.nextInt());
        System.out.println("Ingrese su peso: ");
        dato.setPeso(s.nextInt());
        System.out.println("Ingrese su estatura: ");
        dato.setAltura(s.nextInt());
        
        dato.mostrarDatos();
        
    }
    
}
