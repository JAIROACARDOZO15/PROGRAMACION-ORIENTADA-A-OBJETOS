package modelo;

public abstract class FiguraGeometrica
{
    //Metodo Abstarcto
    public abstract double calcularArea();

    public String toSgtring()
    {
        return "Area = " + calcularArea();
    }
}