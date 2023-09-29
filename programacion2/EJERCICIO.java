
package programacion2;
import  javax.swing.JOptionPane;
public class EJERCICIO {
    public static void main(String[] args) {
        boolean opcion= true;
        while (opcion) { 
            try {
                   int seleccion = Integer.parseInt(JOptionPane.showInputDialog(""            
                   +"MENÚ PRINCIPAL\n"
                   +"1. divicion\n"
                   +"2.salir\n"
                   +"Seleccione una iopcion\n"  ));     
             
                    switch (seleccion) {
                        case 1 : divicion();
                        case 2 : opcion = false;
                        default : mensaje("opción invalida");                  
                      }   
            } catch (NumberFormatException e) {
                mensaje("ingrese una opción valida");
            }
                    
        }
    }

    private static void divicion() {
        double divicion=0;
        try {
            double x=Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));
            double y=Integer.parseInt(JOptionPane.showInputDialog("ingrese otro número"));
            if(x==0 || y==0){
                mensaje("no debes ingresar un cero");
            }else{
            divicion=x/y;
            mensaje( "la divicion es "+ divicion);
            }
        } catch (NumberFormatException | NullPointerException e) {                          
            mensaje("ingrese un número");
        }catch (ArithmeticException e) {
            mensaje("no se puede dividir por 0");
        }
        
    }

    private static void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
}
