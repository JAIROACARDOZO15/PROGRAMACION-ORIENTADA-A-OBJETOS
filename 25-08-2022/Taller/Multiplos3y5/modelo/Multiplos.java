package modelo;
// Determinar si un numero es multiplo de 3 y 5

import javax.swing.JOptionPane;

public class Multiplos
{
    public static void main(String[] args) 
    {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        if (x % 3 == 0 && x % 5 == 0)
        {
            JOptionPane.showMessageDialog(null, x +  " Es multiplo de 3 y 5 ");
        }

        else 
        {
            JOptionPane.showMessageDialog(null, x +  " No es multiplo de 3 y 5 ");
        }
    }
}