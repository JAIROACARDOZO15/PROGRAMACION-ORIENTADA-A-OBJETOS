package ejecutable;

import java.util.Scanner;
import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3 , 5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        if (c1.equals(c2))
        {
            System.out.println("Las coordenadas son iguales");
        }
        else
        {
            System.out.println("Las coordenadas son diferentes");
        }
        try (Scanner Temp = new Scanner(System.in)) 
        {
            int x1;
            int x2;
            int y1;
            int y2;
            int x;
            int y;
            double Distancia_Resultado;

            System.out.print("Enter the values of first point coordinates : ");
            x1 = Temp.nextInt();
            y1 = Temp.nextInt();
            System.out.print("Enter the values of second point coordinates : ");
            x2 = Temp.nextInt();
            y2 = Temp.nextInt();

            // Implement pythagorean theorem
            x = x2-x1;
            y = y2-y1;
            Distancia_Resultado = Math.sqrt(x*x + y*y);

            System.out.println("Distance between the two points is : " + Distancia_Resultado);
        }
        
    }
}
