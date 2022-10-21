package modelo;

import javax.xml.stream.util.EventReaderDelegate;

public class Empresa
{
    private static final int SALARIOMIN = 1000000; 
    private static final int AUXTRANSPORTE = 117172; 
    private int edad;
    private int annoI;
    private String nombre;
    private int horasTrabajo;
    private int valorHora;
    private int salario;
    
    public static int getSalarioMin()
    {
        return SALARIOMIN;
    }
    public void setedad(int pAnnoN)
    {
        this.edad = pAnnoN;
    }
    public void setannoI(int pAnnoI)
    {
        this.annoI = pAnnoI;
    }
    public void setnombre(String pNombre)
    {
        this.nombre= pNombre;
    }
    public String getnombre()
    {
        return nombre;
    }
    public void setValor(int pValor)
    {
        this.valorHora = pValor;
    }
    public int getValor()
    {
        return valorHora;
    }
    public void setHoras(int pHoras)
    {
        this.horasTrabajo = pHoras;
    }
    public int getHoras()
    {
        return horasTrabajo;
    }
    public void pFechaIngreso()
    {
        int fI = 0;
        fI = 2022 - annoI;
        annoI = fI;
    }
    public void pEdad ()
    {
        int fN = 0;
        fN = 2022 - edad;
        edad = fN;
    }
    public int getannoI()
    {
        return annoI;
    }
    public int geteda()
    {
        return edad;
    }
    public void hallarSalario()
    {
        int z = horasTrabajo * valorHora;

        if (z <2*SALARIOMIN)
        {
            salario = z + AUXTRANSPORTE;
        }
        else
        {
            salario = z;
        }
    }
    public int getSalario()
    {
        return salario;
    }
    public int getannoIn() {
        return 0;
    }
    public int getedad() {
        return 0;
    }

}
