package Caso2Herencia.modelo;

public class Circulo extends Figura
{
    private double radio;
   
    public Circulo()
    {
        super();
    }

    public void calcularRadio(double radio)
    {
        perimetro = 2*Math.PI*radio;
        area = Math.PI*(radio*radio);
    }
}