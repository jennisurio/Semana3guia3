
package ejercicios;


public class articulo {

double precioArticulo;
    double precioArticuloconIva;
    double precioArticuloSinIva;
    double porcentIva;
    double valorIva;
    

    

    public double getPorcentIva() {
        return porcentIva;
    }

    public void setPorcentIva(double porcentIva) {
        this.porcentIva = 0.13;
    }

    public double getPrecioArticuloconIva() {
        return precioArticuloconIva;
    }

    public void setPrecioArticuloconIva(double precioArticuloSinIva) {
        this.precioArticuloconIva = precioArticuloSinIva;
    }

    public double getPrecioArticuloSinIva() {
        return precioArticuloSinIva;
    }

    public void setPrecioArticuloSinIva() {
        this.precioArticuloSinIva = this.precioArticuloconIva - this.precioArticulo;
    }
    
    public double getValorIva() {
        return precioArticulo;
    }
    public void setValorIva() {
        this.precioArticulo = precioArticuloconIva * 0.13;
    }
}