/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2;

public class estudiante extends persona{

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNota3(Double nota3) {
        super.setNota3(nota3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getNota3() {
        return super.getNota3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNota2(Double nota2) {
        super.setNota2(nota2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getNota2() {
        return super.getNota2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNota1(Double nota1) {
        super.setNota1(nota1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getNota1() {
        return super.getNota1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public static double promediar(double n1, double n2, double n3){
        return (n1+n2+n3)/3;
    }
}
