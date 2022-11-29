package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btCrearLibro;
    public JButton btCrearColeccion;
    public JButton btImprimir;
    public JButton btBorrar;
    public JButton btSalir;

    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.CYAN);
        
        //Creación y adicion de los botones
        btCrearLibro = new JButton("Crear libro");
        btCrearLibro.setFont(new Font("Arial", Font.PLAIN, 14));
        btCrearLibro.setBounds(5,22,100,40);
        btCrearLibro.setActionCommand("crearLibro");
        this.add(btCrearLibro);

        btCrearColeccion = new JButton("Crear Coleccion");
        btCrearColeccion.setFont(new Font("Arial", Font.PLAIN, 14));
        btCrearColeccion.setBounds(110,22,100,40);
        btCrearColeccion.setActionCommand("crearColeccion");
        this.add(btCrearColeccion);

        btImprimir = new JButton("Imprimir");
        btImprimir.setFont(new Font("Arial", BOLD, 12));
        btImprimir.setBounds(215,22,100,40);
        btImprimir.setActionCommand("ImprimirLibros");
        this.add(btImprimir);
              
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(320,22,100,40);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);
        
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(425,22,100,40);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}