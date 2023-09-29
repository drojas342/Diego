package programacion2;

public class diapositiva_1_ejercicio_producto {

    String nombre;
    double precio;
    int cantidad;

    public diapositiva_1_ejercicio_producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.cantidad = 0;
    }

    public diapositiva_1_ejercicio_producto(String n, double p, int c) {
        nombre = n;
        precio = p;
        cantidad = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    public static void main(String[] args) {
        diapositiva_1_ejercicio_producto e = new diapositiva_1_ejercicio_producto();

        System.out.println("" + e.toString());
        e.setCantidad(50);

        System.out.println(e.getNombre());
        System.out.println(e.getPrecio());
        System.out.println(e.getCantidad());

        System.out.println("" + e.toString());
    }
}
