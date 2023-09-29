/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2;

import javax.swing.JOptionPane;

/**
 *
 * @author rojas
 */
public class sep1 {

    public static void ejercicio1() {
        String nombre = JOptionPane.showInputDialog("Ingrese un nombre");
        nombre += " " + JOptionPane.showInputDialog("Ingrese un apellido");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));

        String nombre1 = JOptionPane.showInputDialog("Ingrese un nombre");
        nombre1 += " " + JOptionPane.showInputDialog("Ingrese un apellido");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad"));

        if (edad1 > edad) {
            JOptionPane.showMessageDialog(null, "el mayor es " + nombre1);
        } else {
            JOptionPane.showMessageDialog(null, "el mayor es " + nombre);
        }

        if (nombre.equals(nombre1)) {
            System.out.println("Son iguales");
        }
    }

    public static void ejercicio2() {

        String a = "Hola";
        String b = "oola";

        if (a == b) {// No recomendado
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        if (a.equals(b)) { //Recomendado de hacer 
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
    
    public static void ejercicio3(){
        String cadena="Hola, mundo!";
        System.out.println(cadena.length());
        
        System.out.println(cadena.replace("mundo", "amigo"));
        
        String[] partes = cadena.split(" ");
        
        String mayusuculas= cadena.toUpperCase();//Pasar letras a mayuscula
        String minusculas=cadena.toLowerCase();//Pasar a minusculas 
    }
    
    public static void ejercicio4(){
        String nombre = "Juan";
        int edad = 30;
        
        System.out.println(String.format("Hola, %s, Tienes %d años", nombre, edad));
    }
    
    public static void main(String[] args) {
        ejercicio4();
    }

}
