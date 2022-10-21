// Dado un caracter determinar si es una vocal
package modelo;

import javax.swing.JOptionPane;

public class Vocal 
{
    public static void main(String[] args) 
    {
        char c;

        c = (JOptionPane.showInputDialog(" Ingrese un caracter ")) . charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            JOptionPane.showMessageDialog(null, c +  " Es vocal ");
        }
    }
}

