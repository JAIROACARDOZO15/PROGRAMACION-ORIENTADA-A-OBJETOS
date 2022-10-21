// Calcular el gasto de agua de una vivienda dado el numero de m3 de agua gastados, siendo el sistema de coboro el 
//siguiente:
//-La cuota fija mensual es de $10000
//-Los primeros 50m3 son gratis
//-Entre 50 y 200m3 se cobra el m3 a $2000
//-A partir de 200 m3 se cobra el m3 a $3000

package modelo;

import javax.swing.JOptionPane;

public class GastoAguaVivienda 
{
    public static void main(String[] args) 
    {
        int agua;
        
        agua = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los m3 utilizados: "));

        if (agua <= 50)
        {
            JOptionPane.showMessageDialog(null, agua + " Su valor a pagar es " + "$" + 10000);
        }

        else if (agua >50 && agua <=200)
        {
            JOptionPane.showMessageDialog(null, " Su valor a pagar es " + "$" + (10000 + (agua - 50) * 2000));
        }

        else if (agua > 200)
        {
            JOptionPane.showMessageDialog(null, " Su valor a pagar es " + "$" + (10000 + (agua - 50) * 3000));
        }

        else 
        {
            JOptionPane.showMessageDialog(null, " Verificar datos");
        }
    }
}

