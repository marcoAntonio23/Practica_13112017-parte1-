
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Persona;
import ec.edu.ister.modelo.TipoMetodos;
import static ec.edu.ister.modelo.TipoMetodos.*;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;


public class Aplicacion {
    public static void main(String[] args) {
        //System.out.println(metodoStatic3(8));
        //showMessageDialog(null,pow(2,3));
        //TipoMetodos tp= new TipoMetodos();
        //tp.Suma(6,7);
        Persona p = new Persona();
        p.setCedula("123456786");
        showMessageDialog(null, p.getCedula());
        
    }
}
