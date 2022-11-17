package ejecutable;

import javax.swing.JOptionPane;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;

public class Test 
{
    //Metodo Principal
    public static void main(String[] args) 
    {
        //Entrada de Datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL VALOR DE X"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL VALOR DE X"));
        
        //Creacion de un objeto suma
        Suma miSuma = new Suma(x, y);
        miSuma.Sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " en " + miSuma.mostrarResultado());
        
        //Creacion de un objeto resta
        Resta miResta = new Resta(x, y);
        miResta.Restar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " en " + miResta.mostrarResultado());
        
        //Creacion de un objeto multiplicar
        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.Multiplicar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " en " + miMultiplicacion.mostrarResultado());

        //Creacion de un objeto dividir
        Division mDivision = new Division(x, y);
        mDivision.Dividir();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " en " + mDivision.mostrarResultado());
        
        System.exit(0);
    }
}
