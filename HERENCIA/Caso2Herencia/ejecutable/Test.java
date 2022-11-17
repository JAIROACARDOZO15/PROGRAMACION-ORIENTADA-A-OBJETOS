package Caso2Herencia.ejecutable;

import javax.swing.JOptionPane;

import Caso2Herencia.modelo.Circulo;
import Caso2Herencia.modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA BASE : "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA ALTURA: "));

        Rectangulo mirRectangulo = new Rectangulo();
        mirRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null, "EL AREA DEL RECTANGULO ES " + mirRectangulo.mostrarArea() + " Y SU PERIMETRO ES " + mirRectangulo.mostrarPerimetro());

        double radio = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR DEL RADIO : "));

        Circulo miCirculo = new Circulo();
        miCirculo.calcularRadio(radio);
        JOptionPane.showMessageDialog(null, "EL AREA DEL CIRCULO ES " + miCirculo.mostrarArea() + " Y SU PERIMETRO ES " + miCirculo.mostrarPerimetro());
    }
}