
package programacion2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        
        ArrayList<estudiante> aprobados = new ArrayList<estudiante>();
        ArrayList<estudiante> reprobados = new ArrayList<estudiante>();
        
        for (int i = 0; i < 1; i++) {
            
            estudiante student = new estudiante();
            estudiante.nombre=JOptionPane.showInputDialog("Ingrese nombre");
            estudiante.nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingese nota1"));
            estudiante.nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingese nota1"));
            estudiante.nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingese nota1"));
            
            if (estudiante.promediar(estudiante.nota1, estudiante.nota2, estudiante.nota3) < 3) {
                reprobados.add(student);    
            }else{
                aprobados.add(student);
            }  
        }
        System.out.println("Aprobados");
        for (estudiante estudent : aprobados) {
            System.out.println(estudent.nombre);
        }
        System.out.println("Reprobados");
        for (estudiante estudent : reprobados) {
            System.out.println(estudent.nombre);
        }
        
    }
}
