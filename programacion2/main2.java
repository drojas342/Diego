
package programacion2;

public class main2 {
    public static void main(String[] args) {
        diapositiva_1_ejercicio_producto e=new diapositiva_1_ejercicio_producto();

        System.out.println(""+e.toString());
        e.setCantidad(50);
        
        System.out.println(e.getNombre());
        System.out.println(e.getPrecio());
        System.out.println(e.getCantidad());
        
        System.out.println(""+e.toString()); 
    }
 
}
