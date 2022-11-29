package ejecutable;

import controlador.Controlador;
import modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Test
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        new Controlador(miVentanaPrincipal, miBiblioteca);
    }
}