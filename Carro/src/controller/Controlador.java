package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Carro;
import view.PanelResultados;
import view.VentanaPrincipal;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Carro model;

    public Controlador(VentanaPrincipal pVenPrin, Carro pModel) {
        this.miVentanaPrincipal = pVenPrin;
        this.model = pModel;
        this.miVentanaPrincipal.miPanelOperaciones.agregarOyentesBotones(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("crear")) {
            try {
                String color = miVentanaPrincipal.miPanelEntradaDatos.getColor();
                int posX = Integer.parseInt(miVentanaPrincipal.miPanelEntradaDatos.getPosX());
                int poxY = Integer.parseInt(miVentanaPrincipal.miPanelEntradaDatos.getPosY());

                model = new Carro(color, posX, poxY);

                PanelResultados.mostrarResultado("Se ha creado un objeto Carro");
                PanelResultados.mostrarResultado("Su número de ruedas son " + Carro.getNumRuedas());
                PanelResultados.mostrarResultado("Su color actual es " + model.getColor());
                PanelResultados
                        .mostrarResultado("Su posición actual es (" + model.getPosX() + "," + model.getPosY() + ")");
                PanelResultados.mostrarResultado("Su velocidad actual es " + model.getVelocidad());
                miVentanaPrincipal.miPanelOperaciones.desactivarBotonCrear();
                miVentanaPrincipal.miPanelOperaciones.activarBotones();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (comando.equals("mover")) {
            miVentanaPrincipal.crearDialogoMover();
            this.miVentanaPrincipal.miDialogoMoverCarro.agregarOyentesBotones(this);
        }

        if (comando.equals("aceptar")) {
            int x = Integer.parseInt(miVentanaPrincipal.miDialogoMoverCarro.getPosX());
            int y = Integer.parseInt(miVentanaPrincipal.miDialogoMoverCarro.getPosY());
            model.mover(x, y);
            PanelResultados.mostrarResultado(
                    "\nTras mover el carro, su posición actual es (" + model.getPosX() + "," + model.getPosY() + ")");
            miVentanaPrincipal.miDialogoMoverCarro.cerrarDialogo();
        }

        if (comando.equals("acelerar")) {
            model.acelerar();
            PanelResultados.mostrarResultado("\nTras acelerar, su velocidad actual es " + model.getVelocidad());
        }

        if (comando.equals("frenar")) {
            model.frenar();
            PanelResultados.mostrarResultado("\nTras frenar, su velocidad actual es " + model.getVelocidad());
        }
    }
}
