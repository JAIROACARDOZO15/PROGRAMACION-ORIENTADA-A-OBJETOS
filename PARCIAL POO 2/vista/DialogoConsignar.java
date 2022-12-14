package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoConsignar extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbConsignar;
    private JTextField tfConsignar;
    private JButton btConsignar;
    private JLabel lbNombre;
    private JLabel lbCuenta;

    //----------------------
    // Metodos
    //----------------------
    public DialogoConsignar()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbConsignar = new JLabel("Consignar: ");
        lbConsignar.setBounds(10,50,140,20);
        this.add(lbConsignar);

        lbNombre = new JLabel();
        lbNombre.setBounds(150,30,100,25);
        this.add(lbNombre);

        lbCuenta = new JLabel("Cuenta: ");
        lbCuenta.setBounds(10,30,100,25);
        this.add(lbCuenta);

        tfConsignar = new JTextField();
        tfConsignar.setBounds(150,50,100, 25);
        this.add(tfConsignar);

        btConsignar = new JButton("COnsignar");
        btConsignar.setBounds(20,140,260,25);
        btConsignar.setActionCommand("consignar");
        this.add(btConsignar);

        //Caracteristicas de la ventana
        this.setTitle("Consignar");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getConsignar()
    {
        return tfConsignar.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btConsignar.addActionListener(pAL);
    }

    public void cerrarDialogoConsignar()
    {
        this.dispose();
    }

    public void mostrarResultado(String msj)
    {
        //taResultado.append(msj + "\n");
        lbCuenta.setText(msj);
    }
}