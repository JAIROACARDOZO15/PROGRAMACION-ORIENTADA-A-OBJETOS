package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbCuenta;
    public JComboBox cbCuenta;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.CYAN);

        //Crear y agregar etiqueta empleados
        lbCuenta = new JLabel("Empleados: ", JLabel.RIGHT);
        lbCuenta.setBounds(0,50,100,20);
        this.add(lbCuenta);

        //Crear y agregar combo lista Empleados
        cbCuenta = new JComboBox();
        cbCuenta.setBounds(100,50,260,20);
        this.add(cbCuenta);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getCuenta()
    {
        return (String) cbCuenta.getSelectedItem();
    }

    public int getIndexCuenta()
    {
        return cbCuenta.getSelectedIndex();
    }

    public void setCuenta(String emp)
    {
        cbCuenta.addItem(emp);
    }

    public static void borrar() {
    }
}