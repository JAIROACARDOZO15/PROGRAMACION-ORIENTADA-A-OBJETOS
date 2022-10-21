// Dado un número, determinar la cantidad de dígitos que contiene
package modelo;

import javax.swing.JOptionPane;

public class CantidadDigitos 
{
    public static void main(String[] args) 
    {
        String n;
        n = JOptionPane.showInputDialog("Ingrese un número: ");
        int d = 0;
        char[] numeroLista = n.toCharArray();

        for (int i = 0; i < numeroLista.length; i++) 
        {
            d++;
        }

        JOptionPane.showMessageDialog(null, "El número " + n + " tiene " + d + " digitos");
        System.exit(0);
    }
}