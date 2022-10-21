// Calcular la suma y el promedio de los números pares menores o iguales que un número k leído al comienzo
package model;

import javax.swing.JOptionPane;

public class SumaYPromedio 
{
    public static void main(String[] args) 
    {
        int k = 0;
        int c = 0;
        int s = 0;
        int p = 0;

        k = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));

        while (0 < k) 
        {
            if (c == 0) 
            {
                if (k % 2 != 0)
                {
                    s += k;
                    k -= 1;
                    s += k;
                    c += 2;
                } else 
                {
                    s += k;
                    k -= 2;
                    c++;
                }
            } else 
            {
                s += k;
                k = k - 2;
                c++;
            }
        }
        p = s / c;
        JOptionPane.showMessageDialog(null,
                "La suma de los números pares menores o iguales que " + k + " es: " + s
                        + "\nEl promedio es: " + p);
        System.exit(0);
    }
}
