package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------------
    // Atributos 
    //---------------------------
    public PanelEntrada miPanelEntrada;
    public PanelOperaciones miPanelOperacion;
    public PanelResultados miPanelResultado;
    public DialogoLibroColeccion miDialogoLibroColeccion;

    //---------------------------
    // Metodos
    //---------------------------

    // Metodo constructor
    public VentanaPrincipal()
    {
        //Definicion contenedor de la ventana
        this.setLayout(null);

        //Creación y adición de un panel tipo PanelEntradaDatos
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10,10,530,220);
        this.add(miPanelEntrada);

        //Creación y adición de un panel tipo PanelOperación
        miPanelOperacion = new PanelOperaciones();
        miPanelOperacion.setBounds(10,240,530,80);
        this.add(miPanelOperacion);
        

        //Creación y adición de un panel tipo PanelResultado
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,330,530,160);
        this.add(miPanelResultado);
        
        // Caracteristicas de la ventana
        this.setTitle("CasoBiblioteca");
        this.setSize(558,532);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
    public void crearDialogoLibroColeccion() 
    {
        miDialogoLibroColeccion = new DialogoLibroColeccion();
    }
}