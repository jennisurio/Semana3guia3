
package clase.objetos;
import java.util.Scanner;

public class transaccionesbancarias {
    public static void main(String[] args) {
       cuentabancaria cuenta = new cuentabancaria();
        Scanner leer = new Scanner(System.in);
        
        String duicliente, nombrecliente;
        long telefonocliente = 0;
        double abono, retiro;
        
        System.out.println("ingrese los datos que se le solicitan acontinuacion");
        System.out.println("nombre del propietario");
        duicliente=leer.nextLine();
        
        System.out.println("numero de DUI");
        nombrecliente=leer.nextLine();
        
        System.out.println("telefono");
        telefonocliente =leer.nextLong();
      
        
        cliente propietario = new cliente(duicliente, nombrecliente, telefonocliente);
        cuenta.propietariocuenta = propietario;
        
        System.out.println("ingrsar la cantidad a abonar");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("ingrsar la cantidad a retirar");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");        
        System.out.println("su saldo de la cuenta es " + cuenta.saldocuenta);
        
        System.out.println("datos del proietrario: \n" + cuenta.datosproietariocuenta());
        }
     
    }
    

