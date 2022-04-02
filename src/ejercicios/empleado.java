/*
 Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario Con Descuento, Bandera de Empleado Activo o 
Inactivo)
Métodos:
a) Crear un método para calcular el Salario con Descuento que es Salario Devengado –
b) Descuento del 10% de Renta
c) Crear un método para Imprimir el Nombre Completo del Contribuyente
d) Imprimir Todos los Atributos
e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas
 */
package ejercicios;


public class empleado {
    private long Nit;
    private String apellidos;
    private String nombre;
    private String direccion;
    private double salariodevengado;
    private double salariodescuento;
    private double renta;


    public empleado(long Nit, String apellidos, String nombre, String direccion, double salariodevengado, double salariodescuento) {
        this.Nit = Nit;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salariodevengado = salariodevengado;
        this.salariodescuento = salariodescuento;
        
    }

    public empleado() {
    }


    

    public long getNit() {
        return Nit;
    }

    public void setNit(long Nit) {
        this.Nit = Nit;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalariodevengado() {
        return salariodevengado;
    }

    public void setSalariodevengado(double salariodevengado) {
        this.salariodevengado = salariodevengado;
    }

 
    public double getSalariodescuento() {
        return salariodescuento;
    }
    

    public void setSalariodescuento(double salriodescuento) {         
        this.salariodescuento = salariodescuento;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    
   
    }
      
 



    
         
    
        
  

  
    

   
    

