package modelo;

import javax.swing.JOptionPane;

public class notas
{
    
    public static void main(String[] args) 
    {
        // Declaracion de variables y constante
        final int TOTAL_EST=12;
        double[] notas;
    
        // Inicializar array
        notas = new double[TOTAL_EST];
    
        // ingresar elementos de la array (notas)
        for(int i=0; i<notas.length; i++)
        {
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("digite la nota del estudiante " + (i+1)));
        }
    
        // calcular nota promedio del curso
        double suma = 0;
        double promedio =0;
        for(int i=0; i<notas.length; i++)
        {
            suma = suma + notas[i];
        }
        promedio = suma / TOTAL_EST;
        
        // Numeros de estudiantes por encima del promedio
        int cantEstudiantesEncimaPromedio = 0;
        for(int i=0; i<notas.length; i++)
        {
            if(notas[i]>promedio)
            {
                cantEstudiantesEncimaPromedio ++;
            }
        }

        // salida
        String salida = "notas =[";
        for(int i=0; i<notas.length; i++)
        {
            if (i != (TOTAL_EST - 1))
            {
                salida = salida + notas[i] + " , ";
            }
            else
            {
                salida = salida + notas[i];
            }
        };
        salida = salida + "]";
        salida = salida + "\nNota promedio curso = " + promedio;
        salida = salida + "\nEstudiantes por encima promedio = " + cantEstudiantesEncimaPromedio;
        System.out.println(salida);
    }    
}    