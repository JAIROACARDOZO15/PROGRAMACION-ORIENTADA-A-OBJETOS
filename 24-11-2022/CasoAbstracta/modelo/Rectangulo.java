package modelo;

public class Rectangulo extends FiguraGeometrica
{
    private int base;
    private int altura;
    
    public Rectangulo(int b, int a)
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
        return (base*altura);
    }
}
