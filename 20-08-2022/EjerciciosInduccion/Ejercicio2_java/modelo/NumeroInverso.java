//dado un numero de 5 digitos devolver el numero en orden inverso

package modelo;
import javax.swing.JOptionPane;

public class NumeroInverso 
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String numero;
        numero = JOptionPane.showInputDialog("Digite el numero de 5 cifras");

        StringBuffer sbr = new StringBuffer(numero);
        
        sbr.reverse();
        
        JOptionPane.showMessageDialog(null, "El reves del numero " + numero + " es " + sbr, "NumeroInverso", JOptionPane.PLAIN_MESSAGE);    
        System.exit(0);
    }
}