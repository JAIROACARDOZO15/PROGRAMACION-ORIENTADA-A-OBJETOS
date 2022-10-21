package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoMoverCarro miDialogoMoverCarro;

    public VentanaPrincipal() {
        setLayout(null);

        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 380, 190);
        add(miPanelEntradaDatos);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 220, 380, 60);
        add(miPanelOperaciones);

        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10, 290, 380, 250);
        add(miPanelResultado);

        miDialogoMoverCarro = null;

        setTitle("Carro");
        setSize(400, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void crearDialogoMover() {
        miDialogoMoverCarro = new DialogoMoverCarro();
    }
}
