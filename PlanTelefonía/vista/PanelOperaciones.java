package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    public JButton btCalcular;
    public JButton btBorrar;
    public JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(10,20,90,20);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        //Crear y agregar boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(120,20,90,20);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(250,20,90,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);

        this.setLayout(null);
        this.setBackground(Color.white);
        this.setVisible(true);
        this.add(btCalcular);
        this.add(btBorrar);
        this.add(btSalir);
        
    }
}
