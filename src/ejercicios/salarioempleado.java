
package ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class salarioempleado {
    
    public static void main(String[] args) {
      empleado empleado = new empleado ();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        double salariodevengado = 0;
        double  salariodescuento = 0;
        long Nit;
        double renta;
        String apellidos;
        String nombre;
        String direccion;
        String activo;
        String inactivo;
        Scanner teclado = new Scanner(System.in);
      
        
        System.out.println("ingrese el nombre de el empleado");
        nombre = teclado. nextLine();
            
          
        System.out.println("ingrese el apellido de el empleado");
        apellidos = teclado. nextLine();
        
        System.out.println("ingrese el nit ");
        Nit = teclado. nextLong();
          
        System.out.println("ingrese la direccion ");
        direccion = teclado. nextLine();
          
        System.out.println("ingrese el salario devengado  ");
        nombre = teclado. nextLine();
        
      
       
        
       empleado.setSalariodescuento(salariodescuento);
       empleado.setSalariodevengado(salariodevengado);
       empleado.setNombre(nombre);
       empleado.setApellidos(apellidos);
       empleado.setNit(Nit);
       empleado.setDireccion(direccion);
       
     
        
        
         System.out.println("nombre el empleado" +  empleado.getNombre());
         System.out.println("apellido del empleado" + empleado.getApellidos());
         System.out.println("el nit es" + empleado.getNit());
         System.out.println("la direccion es " + empleado.getDireccion());
         System.out.println("el descuento del salario devengado es " + empleado.getRenta());
         
        }
       
}
    
    
    
    

