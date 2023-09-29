
package programacion2;

import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.

public class practica{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.
        
        try { // Inicia un bloque try para manejar las excepciones.
            System.out.print("Ingrese un número entero positivo: "); // Solicita al usuario que ingrese un número.
            int numero = Integer.parseInt(scanner.nextLine()); // Lee la entrada del usuario y la convierte en un número entero.

            if (numero <= 0) { // Verifica si el número ingresado es menor o igual a cero.
                throw new IllegalArgumentException("Debe ingresar un número entero positivo."); // Si es menor o igual a cero, lanza una excepción personalizada con un mensaje de error.
            }

            System.out.println("Entrada válida. El número ingresado es: " + numero); // Si el número es válido, muestra un mensaje de éxito con el número ingresado.
        } catch (NumberFormatException e) { // Captura una posible excepción si el usuario no ingresó un número válido.
            System.out.println("Error: No ingresó un número válido,,,,,."); // Muestra un mensaje de error en caso de que la entrada no sea un número válido.
        } catch (IllegalArgumentException e) { // Captura una posible excepción personalizada si el número es menor o igual a cero.
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje de error personalizado.
        } finally { // El bloque finally se ejecutará siempre, se use o no excepción.
            scanner.close(); // Cierra el objeto Scanner para liberar recursos al final del programa.
        }
    }
}