
package Desarrollo;

public class cuentabancaria {
    private long numCuenta;
    private double cargoCuenta;
    private double abonoCuenta;
    private double saldoCuenta;
    private char estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return cargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.cargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public char getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setSaldoCuenta() {//Se elimina el atributo double saldoCuenta
    //Se escribe la formulka siguiente para el clalculo del saldo
    this.saldoCuenta = saldoCuenta + this.abonoCuenta - this.cargoCuenta;
        this.estadoCuenta = estadoCuenta;
    }
    
    
}
    

