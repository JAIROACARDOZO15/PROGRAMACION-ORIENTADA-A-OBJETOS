package modelo;

public class Circulo extends FiguraGeometrica 
{
    //Atributos
    private int radio;

    //Metodos
    //Constructor
    public Circulo(int r)
    {
        radio = r;
    }
    public void setRadio(int r)
    {

    }
    //Metodo abstracto, sobreescrito
    public double calcularArea()
    {
        return Math.PI*Math.pow(radio, 2);
    }
}   
