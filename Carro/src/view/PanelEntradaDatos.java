package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel 
{
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbColor;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfColor;
    private JTextField tfPosX;
    private JTextField tfPosY;

    public PanelEntradaDatos() {
        setLayout(null);
        setBackground(Color.WHITE);

        iImagen = new ImageIcon(getClass().getResource("/imgs/carro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10, 10, 220, 176);
        add(lbImagen);

        lbColor = new JLabel("Color = ");
        lbColor.setBounds(230, 10, 60, 20);
        add(lbColor);

        lbPosX = new JLabel("PosX = ");
        lbPosX.setBounds(230, 40, 60, 20);
        add(lbPosX);

        lbPosY = new JLabel("PosY = ");
        lbPosY.setBounds(230, 70, 60, 20);
        add(lbPosY);

        tfColor = new JTextField("Azul");
        tfColor.setBounds(300, 10, 60, 20);
        add(tfColor);

        tfPosX = new JTextField("10");
        tfPosX.setBounds(300, 40, 60, 20);
        add(tfPosX);

        tfPosY = new JTextField("10");
        tfPosY.setBounds(300, 70, 60, 20);
        add(tfPosY);

        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public String getColor() {
        return tfColor.getText();
    }

    public String getPosX() {
        return tfPosX.getText();
    }

    public String getPosY() {
        return tfPosY.getText();
    }

    public void borrar() {
        tfColor.setText("");
        tfPosX.setText("");
        tfPosY.setText("");
    }
}
