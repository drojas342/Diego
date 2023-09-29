
package programacion2;

public class diapositiva_1_ejercicio_estudiante {
    String nombre;
    int edad;
    double promedio;

    public diapositiva_1_ejercicio_estudiante() {
        this.nombre="Desconocido";
        this.edad=0;
        this.promedio=0.0;
    }

    public diapositiva_1_ejercicio_estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public diapositiva_1_ejercicio_estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public static void main(String[] args) {
        diapositiva_1_ejercicio_estudiante estudiante_00=new diapositiva_1_ejercicio_estudiante();
        
        System.out.println("Nombre: "+estudiante_00.getNombre()+", Edad: "+estudiante_00.getEdad()+", Promedio: "+estudiante_00.getPromedio());
        estudiante_00.setNombre("Diego");
        estudiante_00.setEdad(20);
        estudiante_00.setPromedio(5.0);
        System.out.println("Nombre: "+estudiante_00.getNombre()+", Edad: "+estudiante_00.getEdad()+", Promedio: "+estudiante_00.getPromedio());
    }
}
