package modelo;

import java.util.ArrayList;

import vista.PanelResultados;

public class Banco
{
    // ATRIBUTOS
    private ArrayList<Banco> cuentasBanco;

    //METODO CONSTRUCTOR
    public Banco(ArrayList<Banco> cuentasBancos)
    {
        this.cuentasBanco = cuentasBancos;
    }
    
    public Banco()
    {
        this.cuentasBanco = new ArrayList<>();
    }

    public void setLibrosDeLaBiblioteca(ArrayList<Banco> cuentasBancos) 
    {
        this.cuentasBanco = cuentasBanco;
    }

    public ArrayList<Banco> getLibrosDeLaBiblioteca() 
    {
        return cuentasBanco;
    }

    public void agregarLibro(Banco banco)
    {
        cuentasBanco.add(banco);
    }

    public void imprimirBanco()
    {
        for(int i = 0; i < cuentasBanco.size(); i ++)
        {
            PanelResultados.mostrarResultado(cuentasBanco.get(i).toString());
        }
    }
}