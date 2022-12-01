package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoAgregarCuenta miDialogoAgregarCuenta = null;
    public DialogoConsignar miDialogoVenderCarro = null;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,370,130);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,150,370,120);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,280,370,190);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("BANCO");
        this.setSize(400,530);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Crear Dialogo AgregarVendedor
    public void crearDialogoAgregarCuenta()
    {
        miDialogoAgregarCuenta = new DialogoAgregarCuenta();
    }

    //Crear Dialogo VenderCarro
    public void crearDialogoVenderCarro()
    {
        miDialogoVenderCarro = new DialogoConsignar();
    }
}
