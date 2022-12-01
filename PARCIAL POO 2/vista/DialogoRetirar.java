package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoRetirar extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbRetirar;
    private JTextField tfRetirar;
    private JButton btRetirar;
    private JLabel lbNombre;
    private JLabel lbCuenta;
    private JLabel lbConsignar;

    //----------------------
    // Metodos
    //----------------------
    public DialogoRetirar()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbRetirar = new JLabel("Retirar: ");
        lbRetirar.setBounds(10,50,140,20);
        this.add(lbRetirar);

        lbNombre = new JLabel();
        lbNombre.setBounds(150,30,100,25);
        this.add(lbNombre);

        lbConsignar = new JLabel("Consignar: ");
        lbConsignar.setBounds(10,30,100,25);
        this.add(lbConsignar);

        lbCuenta = new JLabel("Cuenta: ");
        lbCuenta.setBounds(10,30,100,25);
        this.add(lbCuenta);

        tfRetirar = new JTextField();
        tfRetirar.setBounds(150,50,100, 25);
        this.add(tfRetirar);

        btRetirar = new JButton("Retirar");
        btRetirar.setBounds(20,140,260,25);
        btRetirar.setActionCommand("retirar");
        this.add(btRetirar);

        //Caracteristicas de la ventana
        this.setTitle("Retirar");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getRetirar()
    {
        return tfRetirar.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btRetirar.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }

    public void mostrarResultado(String msj)
    {
        //taResultado.append(msj + "\n");
        lbCuenta.setText(msj);
        lbConsignar.setText(msj);
    }
}