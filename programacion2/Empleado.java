package programacion2;

public class Empleado {

    public double calcularSalario(int tiempo, double valor) {
        return tiempo * valor;
    }

    public static void main(String[] args) {
        Empleado e = new EnpleadoHoras();
        Empleado ee = new EnpleadoFijo();
        
        System.out.println(e.calcularSalario(45, 3000));
        System.out.println(ee.calcularSalario(1, 2000000));
        
    }

    private static class EnpleadoHoras extends Empleado {

        public EnpleadoHoras() {

        }

        @Override
        public double calcularSalario(int horasTrabajadas, double valor) {
            return horasTrabajadas * valor;
        }

    }

    private static class EnpleadoFijo extends Empleado {

        public EnpleadoFijo() {

        }

        @Override
        public double calcularSalario(int mes, double valor) {
            return 1 * valor;
        }
    }

}
