package modelo;

public class Operacion
{
    //Atributos
    protected double x;
    protected double y;
    protected double resultados;

    //Constructor
    public Operacion(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.resultados = 0;
    }

    //Metodos
    public double mostrarResultado()
    {
        return this.resultados;
    } 
}
