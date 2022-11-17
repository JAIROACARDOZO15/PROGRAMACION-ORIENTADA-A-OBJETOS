package Caso2Herencia.modelo;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;

    public Rectangulo()
    {
        super();
    }

    public void calcularAreaPerimetro(double base , double altura)
    {
        area = base * altura;
        perimetro = base*2 + altura*2;
    }
}
