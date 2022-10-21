// Dados 3 numeros devolver los numeros en orden ascendentes
package modelo;

import javax.swing.JOptionPane;

public class NumAscendente 
{   
    public static void main(String[] args)
    {
    int x;
    int y;
    int z;

    // Input
    
    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un carácter: "));
    y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un carácter: "));
    z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un carácter: "));
    
    // Processing

    if (x < y && x < z && y < z){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + x + y + z);
    }
    if (x < z && x < y && z < y){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + x + z + y);
    }
    if (y < x && y < z && x < z){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + y + x + z);    
    }
    if (y < z && y < x && z < x){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + y + z + x);
    }
    if (z < y && z <  x && y < x){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + z + y + x);
    }
    if (z < x && z < y && x < y){
        JOptionPane.showMessageDialog(null, "El orden de manera ascendente es: " + z + x + y);
    }
    System.exit(0);
    }
}