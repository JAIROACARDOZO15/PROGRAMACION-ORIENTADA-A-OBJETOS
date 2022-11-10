package ejecutable;

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
    }
}
