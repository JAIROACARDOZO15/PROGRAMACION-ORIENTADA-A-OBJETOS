import javax.swing.JOptionPane;

package modelo;

// Obtener la suma de los primeros N números enteros positivos

public class SumaNumeros
{
    public static void main(String[] args) 
    {
        int n;
        int i = 1;
        int sum = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        while(i<= n)
        {
            sum = sum + i;
            i ++;
        }

        JOptionPane.showMessageDialog(null, + "La suma de los " + n + " es ");
    }
}