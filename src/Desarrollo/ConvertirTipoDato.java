
package Desarrollo;


class ConvertirTipoDato {
     public static void main(String[] args) {
         ConvertirTipoDato polimorfismo = new ConvertirTipoDato();
         System.out.println("Valor int a String: " + polimorfismo.convertirAString(10));
         System.out.println("Valor double a String: " + polimorfismo.convertirAString(10.0));
         System.out.println("Valor float a String: " + polimorfismo.convertirAString(10.12));
     }
     
     public String convertirAString(int valorInt){ //Convertir de int a String
         String conversion = String.valueOf(valorInt);
         return conversion;
     }
     public String convertirAString(double valorDouble){ //Convertir de double a String
         String conversion = String.valueOf(valorDouble);
         return conversion;
     }
     public String convertirAString(float valorFloat){ //Convertir de float a String
         String conversion =String.valueOf(valorFloat);
         return conversion;
     }
}
    

