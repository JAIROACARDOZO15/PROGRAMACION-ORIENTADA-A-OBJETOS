package modelo;

public class Coordenada
{
    private double x;
    private double y;

    public Coordenada()
    {

    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // Metodo sobre escrito de la Clase Object
    public String toString()
    {
        return "(" + x + " , " + y + ")";
    }

    public boolean equals(Object o)
    {
        Coordenada otra = (Coordenada)o;
        return (x==otra.x) && (y==otra.y);
    }
    
    public equals(distancia)
    {
        
    }
}