package modelo;

public class CuentaAhorros 
{
    // ATRIBUTOS
    private Integer Saldo;

    public CuentaAhorros(Integer Saldo)
    {
        this.Saldo = Saldo;
    }
    
    public CuentaAhorros()
    {
        this.Saldo = 0;
    }

    public Integer getSaldo() 
    {
        return Saldo;
    }

    public String toString()
    {
        return "\nSu saldo es: " + Saldo;
    }
}
