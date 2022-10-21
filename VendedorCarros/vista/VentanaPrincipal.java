package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntrada miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoAgregarEmpleado miDialogoAgregarEmpleado = null;
    public DialogoVenderCarro miDialogoVenderCarro = null;
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntrada();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,120);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,380,190);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Empresa Automotriz");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Crear Dialogo AgregarVendedor
    public void crearDialogoAgregarEmpleado()
    {
        miDialogoAgregarEmpleado = new DialogoAgregarEmpleado();
    }

    //Crear Dialogo VenderCarro
    public void crearDialogoVenderCarro()
    {
        miDialogoVenderCarro = new DialogoVenderCarro();
    }
}