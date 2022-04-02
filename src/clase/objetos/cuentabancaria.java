
package clase.objetos;

public class cuentabancaria {
    long numerodecuenta;
    cliente propietariocuenta;
    double saldocuenta;
   
   

    
    public void abonar (double cantidad){
         saldocuenta += cantidad;
         
    }
    
    public void retirar (double cantidad){
        if (cantidad > saldocuenta){
           System.out.println("saldo insuficiente");
        }
        saldocuenta -= cantidad;
    }
      public String datospropietariocuenta(){
          String informacion = "";
          informacion += "DUI:" + proietariocuenta.duicliente + "\n";
          informacion += "nombre:" + proietariocuenta.nombrecliente + "\n";
          informacion += "teléfono:" + proietariocuenta.telefonocliente + "\n";
          return informacion;
        
      }

    
    }

    
