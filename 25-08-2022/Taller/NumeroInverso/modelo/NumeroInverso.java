// dado dos numeros enteros diferentes devolver el mayor

package modelo;

import javax.swing.JOptionPane;

public class NumeroInverso
{
    public static void main(String[] args)
    {
        int x;
        int y;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de X"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de Y"));
        
        if (x > y)
        {
            JOptionPane.showMessageDialog(null, x +  " Es mayor que " + y);
        }

        else 
        {
            JOptionPane.showMessageDialog(null, y +  " Es mayor que " + x);
        }
    }

}