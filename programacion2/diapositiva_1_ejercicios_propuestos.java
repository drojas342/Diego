/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2;
import javax.swing.JOptionPane;

public class diapositiva_1_ejercicios_propuestos {

    public static void suma_numeros_pares() {
        int suma_pares = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                suma_pares += i;
            }
        }

        System.out.println("La suma de todos los numeros pares del 1 al 100 es de: " + suma_pares);
    }

    public static void factorial_numero() {
        int numero_dado = 11;
        int total_factorial = 1;
        for (int i = 1; i < numero_dado; i++) {
            total_factorial += total_factorial * i;
        }
        System.out.println("El factorial de " + numero_dado + " es: " + total_factorial);
    }

    public static boolean numeros_primos(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fibonacci() {
        int n = 10, t1 = 0, t2 = 1;
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public static void variables_operaciones() {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        System.out.println("El área del circulo es de: "+ Math.PI*(Math.pow(radio, 2)));
    }

    public static void condicionales() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        if (numero>0){
            System.out.println("El número "+numero+" es positivo");
        }else if (numero < 0){
            System.out.println("El número "+numero+" es negativo");
        }else{
            System.out.println("El número es 0");
        }
    }

    public static void bucles() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i+ " x "+j+ " = " + i*j );
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        suma_numeros_pares();
        factorial_numero();
        System.out.println("El número es primo?: " + numeros_primos(7));
        fibonacci();
        variables_operaciones();
        condicionales();
        bucles();
        
    }

}
