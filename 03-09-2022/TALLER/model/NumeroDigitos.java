package model;

import javax.swing.JOptionPane;

public class NumeroDigitos 
{
    public static void main(String[] args) 
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if (n >= 0 && n <= 9) 
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " tiene un sólo dígito");
        } else if (n >= 9 && n <= 99) 
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " tiene dos dígitos");
        } else if (n >= 100 && n <= 999) 
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " tiene tres dígitos");
        } else if (n >= 1000) 
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " tiene más de 3 dígitos");
        }

        System.exit(0);
    }
}
