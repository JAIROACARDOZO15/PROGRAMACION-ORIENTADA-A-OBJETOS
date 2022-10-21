package ejecutable;

import vista.VentanaPrincipal;
import controlador.Controlador;
import modelo.Empresa;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empresa miEmpresa = new Empresa();
        Controlador miControlador = new Controlador(miVentana, miEmpresa);

    }    
}