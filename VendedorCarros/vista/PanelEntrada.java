package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JLabel Lbtitulo;
    private JLabel lbLogo;
    private JLabel Lbnombre;
    private JComboBox cbEmpleados;

    
    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntrada()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("VENTA AUTOS NOMINA", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Arial",Font.BOLD,20));
        Lbtitulo.setForeground(Color.BLACK);
        Lbtitulo.setBounds(10,10,465,20);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        Lbnombre = new JLabel("VENDEDOR: ");
        Lbnombre.setFont(new Font("Arial",Font.BOLD,15));
        Lbnombre.setForeground(Color.BLACK);
        Lbnombre.setBounds(10,90,465,20);
        this.add(Lbnombre);

        //Crear y agregar combo lista Empleados
        cbEmpleados = new JComboBox();
        cbEmpleados.setBounds(100,90,150,20);
        this.add(cbEmpleados);

        lbLogo = new JLabel(new ImageIcon("carro.png"));
        lbLogo.setBounds(250, 30, 100, 160);
        this.add(lbLogo);

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
 
    }

    //Metodos de acceso a la información
    public String getnombre()
    {
        return (String) cbEmpleados.getSelectedItem();
    }

    public int getIndexnombre()
    {
        return cbEmpleados.getSelectedIndex();
    }

    public void setnombre(String emp)
    {
        cbEmpleados.addItem(emp);
    }
}    