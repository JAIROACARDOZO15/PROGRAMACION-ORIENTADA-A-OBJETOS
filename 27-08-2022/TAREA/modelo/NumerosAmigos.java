// Dados dos números, diga si son amigos. Dos números son amigos si la suma de los divisores de uno de ellos es igual al otro
package modelo;

import javax.swing.JOptionPane;

public class NumerosAmigos
{
    public static void main(String[] args) 
    {
        int n1 = 0;
        int n2 = 0;
        int sD1 = 0;
        int sD2 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo número: "));

        for (int divisores = 1; divisores <= (n1 + 1); divisores++) 
        {
            if (n1 % divisores == 0) 
            {
                sD1 += divisores;
            }
        }

        for (int divisores = 1; divisores <= (n2 + 1); divisores++) 
        {
            if (n2 % divisores == 0) 
            {
                sD2 += divisores;
            }
        }

        if (sD1 == sD2) 
        {
            JOptionPane.showMessageDialog(null, "Los números " + n1 + " y " + n2 + " SÍ son amigos");
        } else 
        {
            JOptionPane.showMessageDialog(null, "Los números " + n1 + " y " + n2 + " NO son amigos");
        }
        System.exit(0);
    }
}
