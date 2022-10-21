// Calcular e imprimir el doble de un número X

package model;

import javax.swing.JOptionPane;

public class DobleNumero 
{
    public static void main(String[] args) 
    {
        int n;
        int d;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        d = (n * 2);
        JOptionPane.showMessageDialog(null, "El doble de " + n + " es " + d, "Doble Número",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
