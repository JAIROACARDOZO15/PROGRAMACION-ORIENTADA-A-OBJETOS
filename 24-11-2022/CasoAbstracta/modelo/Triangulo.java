package modelo;

public class Triangulo extends FiguraGeometrica
{
    private int base;
    private int altura;
    
    public Triangulo(int b, int a)
    {
        base = b;
        altura = a;
    }
    public void setBase(int b)
    {
        this.base = b;
    }

    public double calcularArea()
    {
        return (base*altura)/2;
    }    
}
