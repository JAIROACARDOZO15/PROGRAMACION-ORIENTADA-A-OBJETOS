package modelo;

public class Resta extends Operacion
{
    // Constructor
    public Resta(double x, double y)
    {
        super(x,y);
    }

    //Metodos
    public void Restar()
    {
        resultados = x - y;
    }    
}
