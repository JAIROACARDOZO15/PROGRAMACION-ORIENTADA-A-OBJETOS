package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JLabel Lbtitulo;
    private JLabel Lbnombre;
    private JLabel Lbautor;
    private JLabel LbannoI;
    private JLabel lbLibroDeLujo;
    private static javax.swing.JTextField tfnombre;
    private static javax.swing.JTextField tfautor;
    private static javax.swing.JTextField tfannoI;
    private static ButtonGroup bgEsLibroDeLujo;
    private static JRadioButton rbEsLibroDeLujo;
    private JRadioButton rbNoEsLibroDeLujo;

    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntrada()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.CYAN);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("BIBLIOTECA", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Arial",Font.BOLD,20));
        Lbtitulo.setForeground(Color.BLACK);
        Lbtitulo.setBounds(0,10,558,30);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        Lbnombre = new JLabel("NOMBRE");
        Lbnombre.setFont(new Font("Arial",Font.BOLD,10));
        Lbnombre.setForeground(Color.BLACK);
        Lbnombre.setBounds(230,55,480,30);
        this.add(Lbnombre);

        tfnombre = new JTextField();
        tfnombre.setFont(new Font("Arial", Font.PLAIN, 18));
        tfnombre.setForeground(Color.BLACK);
        tfnombre.setBounds(330,55,190,30);
        this.add(tfnombre);

        //Crear y agregar etiqueta al titulo
        Lbautor = new JLabel("AUTOR ");
        Lbautor.setFont(new Font("Arial",Font.BOLD,10));
        Lbautor.setForeground(Color.BLACK);
        Lbautor.setBounds(230,95,480,30);
        this.add(Lbautor);

        tfautor = new JTextField();
        tfautor.setFont(new Font("Arial", Font.PLAIN, 18));
        tfautor.setForeground(Color.BLACK);
        tfautor.setBounds(330,95,190,30);
        this.add(tfautor);

        //Crear y agregar etiqueta al titulo
        lbLibroDeLujo = new JLabel("Edición de lujo =");
        lbLibroDeLujo.setFont(new Font("Arial",Font.BOLD,10));
        lbLibroDeLujo.setForeground(Color.BLACK);
        lbLibroDeLujo.setBounds(230,175,480,30);
        this.add(lbLibroDeLujo);

        //Crear y agregar etiqueta al titulo
        LbannoI = new JLabel("AÑO ");
        LbannoI.setFont(new Font("Arial",Font.BOLD,10));
        LbannoI.setForeground(Color.BLACK);
        LbannoI.setBounds(230,135,480,30);
        this.add(LbannoI);

        tfannoI = new JTextField();
        tfannoI.setFont(new Font("Arial", Font.PLAIN, 18));
        tfannoI.setForeground(Color.BLACK);
        tfannoI.setBounds(330,135,190,30);
        this.add(tfannoI);

        bgEsLibroDeLujo = new ButtonGroup();

        rbEsLibroDeLujo = new JRadioButton("SI");
        rbEsLibroDeLujo.setFont(new Font("serif", Font.PLAIN, 18));
        rbEsLibroDeLujo.setBounds(390,175,50,30);
        bgEsLibroDeLujo.add(rbEsLibroDeLujo);
        this.add(rbEsLibroDeLujo);

        rbNoEsLibroDeLujo = new JRadioButton("NO");
        rbNoEsLibroDeLujo.setFont(new Font("Serif", Font.PLAIN, 18));
        rbNoEsLibroDeLujo.setBounds(450,175,60,30);
        bgEsLibroDeLujo.add(rbNoEsLibroDeLujo);
        this.add(rbNoEsLibroDeLujo);

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
 
    }

    //Metodos de acceso a la información
    public static String getTfnombre()
    {
        return tfnombre.getText();
    }

    public static String getTfautor()
    {
        return tfautor.getText();
    }

    public static String getTfannoI()
    {
        return tfannoI.getText();
    }

    public static boolean getRbLibroDeLujo()
    {
        if (rbEsLibroDeLujo.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Metodo para borrar las cajas de texto
    public static void borrar()
    {
        tfnombre.setText("");
        tfautor.setText("");
        tfannoI.setText("");
        bgEsLibroDeLujo.clearSelection();
        PanelResultados.taResultado.setText("");
    }
}

