package vista;

import java.awt.Component;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------------
    // Atributos 
    //---------------------------
    public PanelEntrada miPanelEntrada;
    public PanelOperaciones miPanelOperacion;
    public PanelResultados miPanelResultado;

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
        miPanelEntrada.setBounds(10,10,465,300);
        this.add(miPanelEntrada);

        //Creación y adición de un panel tipo PanelOperación
        miPanelOperacion = new PanelOperaciones();
        miPanelOperacion.setBounds(10,320,465,60);
        this.add(miPanelOperacion);
        

        //Creación y adición de un panel tipo PanelResultado
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,390,465,180);
        this.add(miPanelResultado);

        // Caracteristicas de la ventana
        this.setTitle("Empleados");
        this.setSize(500,620);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}