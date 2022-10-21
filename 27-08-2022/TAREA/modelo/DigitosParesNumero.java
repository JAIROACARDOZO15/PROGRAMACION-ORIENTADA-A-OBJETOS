// Dado un número, determinar la cantidad de dígitos pares que contiene
package modelo;

import javax.swing.JOptionPane;

public class DigitosParesNumero 
{
    public static void main(String[] args) 
    {
        String n;
        n = JOptionPane.showInputDialog("Ingrese un número: ");
        int d = 0;
        char[] numeroLista = n.toCharArray();

        for (int i = 0; i < numeroLista.length; i++) 
        {
            if (i % 2 == 0) {
                d++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número " + n + " tiene " + d + " digitos pares");
        System.exit(0);
    }
}