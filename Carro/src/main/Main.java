package main;

import model.Carro;
import controller.Controlador;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Carro miCarro = null;
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miCarro);

        /*
         * Carro[] misCarros = new Carro[2]
         * misCarros[0] = carro1;
         * misCarros[1] = carro2;
         */
    }
}
