package ejecutable;

import controlador.Controlador;
import modelo.Telefonía;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        Telefonía miTelefonía = new Telefonía();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miTelefonía);
    }
}