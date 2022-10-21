package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JLabel Lbtitulo;
    private JLabel lbLogo;
    private JLabel Lbnombre;
    private JLabel Lbedad;
    private JLabel LbannoI;
    private JLabel Lbhoras;
    private JLabel Lbvalor;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfedad;
    private javax.swing.JTextField tfannoI;
    private javax.swing.JTextField tfhoras;
    private javax.swing.JTextField tfvalor;



    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntrada()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.GREEN);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("INFORMACION", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Arial",Font.BOLD,20));
        Lbtitulo.setForeground(Color.BLACK);
        Lbtitulo.setBounds(10,10,465,20);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        Lbnombre = new JLabel("NOMBRE");
        Lbnombre.setFont(new Font("Arial",Font.BOLD,10));
        Lbnombre.setForeground(Color.BLACK);
        Lbnombre.setBounds(10,50,465,20);
        this.add(Lbnombre);

        tfnombre = new JTextField();
        tfnombre.setFont(new Font("Arial", Font.PLAIN, 18));
        tfnombre.setForeground(Color.BLACK);
        tfnombre.setBounds(100, 50, 80, 20);
        this.add(tfnombre);

        //Crear y agregar etiqueta al titulo
        Lbedad = new JLabel("EDAD ");
        Lbedad.setFont(new Font("Arial",Font.BOLD,10));
        Lbedad.setForeground(Color.BLACK);
        Lbedad.setBounds(10,100,465,20);
        this.add(Lbedad);

        tfedad = new JTextField();
        tfedad.setFont(new Font("Arial", Font.PLAIN, 18));
        tfedad.setForeground(Color.BLACK);
        tfedad.setBounds(100, 100, 80, 20);
        this.add(tfedad);

        //Crear y agregar etiqueta al titulo
        LbannoI = new JLabel("AÑO INGRESO");
        LbannoI.setFont(new Font("Arial",Font.BOLD,10));
        LbannoI.setForeground(Color.BLACK);
        LbannoI.setBounds(10,150,465,20);
        this.add(LbannoI);

        tfannoI = new JTextField();
        tfannoI.setFont(new Font("Arial", Font.PLAIN, 18));
        tfannoI.setForeground(Color.BLACK);
        tfannoI.setBounds(100, 150, 80, 20);
        this.add(tfannoI);

        //Crear y agregar etiqueta al titulo
        Lbhoras = new JLabel("HORAS TRABAJO");
        Lbhoras.setFont(new Font("Arial",Font.BOLD,10));
        Lbhoras.setForeground(Color.BLACK);
        Lbhoras.setBounds(10,200,465,20);
        this.add(Lbhoras);

        tfhoras = new JTextField();
        tfhoras.setFont(new Font("Arial", Font.PLAIN, 18));
        tfhoras.setForeground(Color.BLACK);
        tfhoras.setBounds(100, 200, 80, 20);
        this.add(tfhoras);

         //Crear y agregar etiqueta al titulo
         Lbvalor = new JLabel("VALOR HORAS");
         Lbvalor.setFont(new Font("Arial",Font.BOLD,10));
         Lbvalor.setForeground(Color.BLACK);
         Lbvalor.setBounds(10,250,465,20);
         this.add(Lbvalor);
 
         tfvalor = new JTextField();
         tfvalor.setFont(new Font("Arial", Font.PLAIN, 18));
         tfvalor.setForeground(Color.BLACK);
         tfvalor.setBounds(100, 250, 80, 20);
         this.add(tfvalor);

        lbLogo = new JLabel(new ImageIcon("imagen.png"));
        lbLogo.setBounds(250, 30, 205, 160);
        this.add(lbLogo);

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
 
    }

    //Metodos de acceso a la información
    public String getTfnombre()
    {
        return tfnombre.getText();
    }

    public String getTfedad()
    {
        return tfedad.getText();
    }

    public String getTfannoI()
    {
        return tfannoI.getText();
    }

    public String getTfhoras()
    {
        return tfhoras.getText();
    }

    public String getTfvalor()
    {
        return tfvalor.getText();
    }

    //Metodo para borrar las cajas de texto
    public void borrar()
    {
        tfnombre.setText("");
        tfedad.setText("");
        tfannoI.setText("");
        tfhoras.setText("");
        tfvalor.setText("");
    }
}

