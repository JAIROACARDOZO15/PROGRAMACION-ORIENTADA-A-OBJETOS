package modelo;

import javax.swing.JOptionPane;

public class notas2 
{
    public static void main(String[] args)
    {
        // Declaracion de variables y constante
        final int TOTAL_EST=3;
        final int TOTAL_MAT=4;
        double[][] notas;
    
        // Inicializar array
        notas = new double[TOTAL_EST][TOTAL_MAT];
    
        // ingresar elementos de la array (notas)
        for(int i=0; i<notas.length; i++)
        {
            for(int j=0; j<notas[0].length; j++)
            {
                notas[i][j]=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del estudiante " + (i+1) + " en la materia" + (j+1)));
            }
            
        }

        // calcular nota promedio del curso
        double suma = 0;
        double promedio =0;
        for(int i=0; i<notas.length; i++)
        {
            for(int j=0; j<notas[0].length; j++)
            {
                suma = suma + notas[i][j];
            }
            
        }
        promedio = suma / (TOTAL_EST*TOTAL_MAT);

        //salida
        System.out.println("nota promedio del curso: " + promedio);
    }
}
