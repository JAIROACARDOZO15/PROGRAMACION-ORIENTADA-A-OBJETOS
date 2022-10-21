// El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado

package model;

import javax.swing.JOptionPane;

public class PrecioProducto 
{
    public static void main(String[] args) 
    {
        int pT;
        int pC;
        int g = 0;

        pC = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));

        if (pC < 3000) 
        {
            g = (int) (pC * 0.15);
        } else if (pC <= 6000 && pC >= 3000) 
        {
            g = 500;
        } else if (pC > 6000) 
        {
            g = (int) (pC * 0.25);
        }

        pT = pC + g;
        JOptionPane.showMessageDialog(null,
                "La ganancia del producto es " + g + " y el precio total es " + pT);
        System.exit(0);
    }
}