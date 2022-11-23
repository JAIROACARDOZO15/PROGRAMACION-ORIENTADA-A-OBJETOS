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
    public JButton btCalcular;
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
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btCalcular = new JButton("Calcular");
        btCalcular.setFont(new Font("Arial", BOLD, 12));
        btCalcular.setBounds(10,20,90,20);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);
        
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(200,20,90,20);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(295,20,80,20);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}