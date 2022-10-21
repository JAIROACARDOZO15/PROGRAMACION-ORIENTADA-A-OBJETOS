// Dado un numero entero de un digito (0 al 9), devolver el numero en letras (usar switch-case)

package modelo;

import javax.swing.JOptionPane;

public class EnteroDigito 
{
    public static void main(String[] args) 
    {
        int numero;
        String numeroTexto = null;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        switch (numero) 
        {
            case 0:
                numeroTexto = "cero";
                break;
            case 1:
                numeroTexto = "uno";
                break;
            case 2:
                numeroTexto = "dos";
                break;
            case 3:
                numeroTexto = "tres";
                break;
            case 4:
                numeroTexto = "cuatro";
                break;
            case 5:
                numeroTexto = "cinco";
                break;
            case 6:
                numeroTexto = "seis";
                break;
            case 7:
                numeroTexto = "siete";
                break;
            case 8:
                numeroTexto = "ocho";
                break;
            case 9:
                numeroTexto = "nueve";
                break;
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " se lee como: " + numeroTexto);
        System.exit(0);
    }
}