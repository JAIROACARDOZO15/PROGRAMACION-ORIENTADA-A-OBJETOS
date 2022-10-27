package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lblogo;
    private JLabel lbNumeroCelular;
    private JLabel lbOperador;
    private JLabel lbCantidadMinutos;
    private JLabel lbValorMinutos;
    public static JTextField tfNumeroCelular;
    public static JTextField tfOperador;
    public static JTextField tfCantidadMinutos;
    public static JTextField tfValorMinutos;


    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        lblogo = new JLabel(new ImageIcon("telefono.png"));
        lblogo.setBounds(130, 10, 220, 176);
        add(lblogo);

        //Crear y agregar etiqueta Numero celular
        lbNumeroCelular = new JLabel("Numero: ", JLabel.RIGHT);
        lbNumeroCelular.setBounds(0,10,100,20);
        this.add(lbNumeroCelular);

        tfNumeroCelular = new JTextField();
        tfNumeroCelular.setBounds(100,10,95,20);
        this.add(tfNumeroCelular);

        //Crear y agregar etiqueta operador
        lbOperador = new JLabel("Operador: ", JLabel.RIGHT);
        lbOperador.setBounds(0,30,100,20);
        this.add(lbOperador);

        tfOperador = new JTextField();
        tfOperador.setBounds(100,30,95,20);
        this.add(tfOperador);

        //Crear y agregar etiqueta Cantidad minutos
        lbCantidadMinutos = new JLabel("Minutos: ", JLabel.RIGHT);
        lbCantidadMinutos.setBounds(0,60,100,20);
        this.add(lbCantidadMinutos);

        tfCantidadMinutos = new JTextField();
        tfCantidadMinutos.setBounds(100,60,95,20);
        this.add(tfCantidadMinutos);

        //Crear y agregar etiqueta Valor Minutos
        lbValorMinutos = new JLabel("Valor: ", JLabel.RIGHT);
        lbValorMinutos.setBounds(0,90,100,20);
        this.add(lbValorMinutos);

        tfValorMinutos = new JTextField();
        tfValorMinutos.setBounds(100,90,95,20);
        this.add(tfValorMinutos);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public static String getTfNumeroCelular() 
    {
        return tfNumeroCelular.getText();
    }

    public static String getTfOperador() 
    {
        return tfOperador.getText();
    }

    public static String getTfCantidadMinutos() 
    {
        return tfCantidadMinutos.getText();
    }

    public static String getTfValorMinutos() 
    {
        return tfValorMinutos.getText();
    }


    public static void borrar() 
    {
        tfNumeroCelular.setText("");
        tfOperador.setText("");
        tfCantidadMinutos.setText("");
        tfValorMinutos.setText("");
    }
}
