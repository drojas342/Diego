
package programacion2;

public class diapositiva_1_ejercicio_circulo {
   double radio;

    public diapositiva_1_ejercicio_circulo() {
        this.radio = 1.0;
    }

    public diapositiva_1_ejercicio_circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*(Math.pow(radio, 2));
    }
    
    public double circuferencia(){
        return Math.PI*radio*2;
    }
   
    public static void main(String[] args) {
        diapositiva_1_ejercicio_circulo circulo=new diapositiva_1_ejercicio_circulo();
        System.out.println("Radio: "+circulo.getRadio());
        System.out.println("Area: "+circulo.area()+", Circuferencia: "+circulo.circuferencia());
        circulo.setRadio(2);
        System.out.println("Radio: "+circulo.getRadio());
        System.out.println("Area: "+circulo.area()+", Circuferencia: "+circulo.circuferencia());
    }
}
