package modelo;

public class CuentaCorriente 
{
    protected Integer Saldo;
    protected Integer Interes;

    public CuentaCorriente(Integer Saldo, Integer Interes)
    {
        this.Saldo = Saldo;
        this.Interes = Interes;
    }
    
    public CuentaCorriente()
    {
        this.Saldo = 0;
        this.Interes = 0;
    }

    public Integer getInteres() 
    {
        return Interes;
    }
    
    public Integer getSaldo() 
    {
        return Saldo;
    }

    public String toString()
    {
        return "\nSu saldo es: " + Saldo + "\nSus intereses son del: " + Interes;
    }
}
