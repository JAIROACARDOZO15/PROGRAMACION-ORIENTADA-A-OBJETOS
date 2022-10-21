package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
    //-------------------------
    // Atributos
    //-------------------------
    private JLabel Lbtitulo;
    private JLabel LbA;
    private JLabel LbB;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf20;

    //-------------------------
    // Métodos
    //-------------------------
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.BLUE);

        //Crear y agregar etiqueta al titulo
        Lbtitulo = new JLabel("VECTORES", JLabel.CENTER);
        Lbtitulo.setFont(new Font("Arial",Font.BOLD,20));
        Lbtitulo.setForeground(Color.WHITE);
        Lbtitulo.setBounds(10,10,465,20);
        this.add(Lbtitulo);

        //Crear y agregar etiqueta al titulo
        LbA = new JLabel("V.A");
        LbA.setFont(new Font("Arial",Font.BOLD,20));
        LbA.setForeground(Color.WHITE);
        LbA.setBounds(60,90,465,20);
        this.add(LbA);

        tf1 = new JTextField();
        tf1.setFont(new Font("Arial", Font.PLAIN, 18));
        tf1.setForeground(Color.WHITE);
        tf1.setBounds(100, 79, 50, 50);
        this.add(tf1);

        tf2 = new JTextField();
        tf2.setFont(new Font("Arial", Font.PLAIN, 18));
        tf2.setForeground(Color.WHITE);
        tf2.setBounds(155, 79, 50, 50);
        this.add(tf2);

        tf3 = new JTextField();
        tf3.setFont(new Font("Arial", Font.PLAIN, 18));
        tf3.setForeground(Color.WHITE);
        tf3.setBounds(210, 79, 50, 50);
        this.add(tf3);

        tf4 = new JTextField();
        tf4.setFont(new Font("Arial", Font.PLAIN, 18));
        tf4.setForeground(Color.WHITE);
        tf4.setBounds(265, 79, 50, 50);
        this.add(tf4);

        tf5 = new JTextField();
        tf5.setFont(new Font("Arial", Font.PLAIN, 18));
        tf5.setForeground(Color.WHITE);
        tf5.setBounds(320, 79, 50, 50);
        this.add(tf5);

        tf6 = new JTextField();
        tf6.setFont(new Font("Arial", Font.PLAIN, 18));
        tf6.setForeground(Color.WHITE);
        tf6.setBounds(375, 79, 50, 50);
        this.add(tf6);

        tf7 = new JTextField();
        tf7.setFont(new Font("Arial", Font.PLAIN, 18));
        tf7.setForeground(Color.WHITE);
        tf7.setBounds(430, 79, 50, 50);
        this.add(tf7);

        tf8 = new JTextField();
        tf8.setFont(new Font("Arial", Font.PLAIN, 18));
        tf8.setForeground(Color.WHITE);
        tf8.setBounds(485, 79, 50, 50);
        this.add(tf8);

        tf9 = new JTextField();
        tf9.setFont(new Font("Arial", Font.PLAIN, 18));
        tf9.setForeground(Color.WHITE);
        tf9.setBounds(540, 79, 50, 50);
        this.add(tf9);

        tf10 = new JTextField();
        tf10.setFont(new Font("Arial", Font.PLAIN, 18));
        tf10.setForeground(Color.WHITE);
        tf10.setBounds(595, 79, 50, 50);
        this.add(tf10);

        //Crear y agregar etiqueta al titulo
        LbB = new JLabel("V.B");
        LbB.setFont(new Font("Arial",Font.BOLD,20));
        LbB.setForeground(Color.WHITE);
        LbB.setBounds(60,165,465,20);
        this.add(LbB);

        tf11 = new JTextField();
        tf11.setFont(new Font("Arial", Font.PLAIN, 18));
        tf11.setForeground(Color.WHITE);
        tf11.setBounds(100, 150, 50, 50);
        this.add(tf11);

        tf12 = new JTextField();
        tf12.setFont(new Font("Arial", Font.PLAIN, 18));
        tf12.setForeground(Color.WHITE);
        tf12.setBounds(155, 150, 50, 50);
        this.add(tf12);

        tf13 = new JTextField();
        tf13.setFont(new Font("Arial", Font.PLAIN, 18));
        tf13.setForeground(Color.WHITE);
        tf13.setBounds(210, 150, 50, 50);
        this.add(tf13);

        tf14 = new JTextField();
        tf14.setFont(new Font("Arial", Font.PLAIN, 18));
        tf14.setForeground(Color.WHITE);
        tf14.setBounds(265, 150, 50, 50);
        this.add(tf14);

        tf15 = new JTextField();
        tf15.setFont(new Font("Arial", Font.PLAIN, 18));
        tf15.setForeground(Color.WHITE);
        tf15.setBounds(320, 150, 50, 50);
        this.add(tf15);

        tf16 = new JTextField();
        tf16.setFont(new Font("Arial", Font.PLAIN, 18));
        tf16.setForeground(Color.WHITE);
        tf16.setBounds(375, 150, 50, 50);
        this.add(tf16);

        tf17 = new JTextField();
        tf17.setFont(new Font("Arial", Font.PLAIN, 18));
        tf17.setForeground(Color.WHITE);
        tf17.setBounds(430, 150, 50, 50);
        this.add(tf17);

        tf18 = new JTextField();
        tf18.setFont(new Font("Arial", Font.PLAIN, 18));
        tf18.setForeground(Color.WHITE);
        tf18.setBounds(485, 150, 50, 50);
        this.add(tf18);

        tf19 = new JTextField();
        tf19.setFont(new Font("Arial", Font.PLAIN, 18));
        tf19.setForeground(Color.WHITE);
        tf19.setBounds(540, 150, 50, 50);
        this.add(tf19);

        tf20 = new JTextField();
        tf20.setFont(new Font("Arial", Font.PLAIN, 18));
        tf20.setForeground(Color.WHITE);
        tf20.setBounds(595, 150, 50, 50);
        this.add(tf20);

        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
    }

    public String getTf1()
    {
        return tf1.getText();
    }

    public String getTf2()
    {
        return tf2.getText();
    }

    public String getTf3()
    {
        return tf3.getText();
    }

    public String getTf4()
    {
        return tf4.getText();
    }

    public String getTf5()
    {
        return tf5.getText();
    }

    public String getTf6()
    {
        return tf6.getText();
    }

    public String getTf7()
    {
        return tf7.getText();
    }

    public String getTf8()
    {
        return tf8.getText();
    }

    public String getTf9()
    {
        return tf9.getText();
    }

    public String getTf10()
    {
        return tf10.getText();
    }

    public String getTf11()
    {
        return tf11.getText();
    }

    public String getTf12()
    {
        return tf12.getText();
    }

    public String getTf13()
    {
        return tf13.getText();
    }

    public String getTf14()
    {
        return tf14.getText();
    }

    public String getTf15()
    {
        return tf15.getText();
    }

    public String getTf16()
    {
        return tf16.getText();
    }

    public String getTf17()
    {
        return tf17.getText();
    }

    public String getTf18()
    {
        return tf18.getText();
    }

    public String getTf19()
    {
        return tf19.getText();
    }

    public String getTf20()
    {
        return tf20.getText();
    }


    public void borrar()
    {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            tf8.setText("");
            tf9.setText("");
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
            tf13.setText("");
            tf14.setText("");
            tf15.setText("");
            tf16.setText("");
            tf17.setText("");
            tf18.setText("");
            tf19.setText("");
            tf20.setText("");
    }
}
