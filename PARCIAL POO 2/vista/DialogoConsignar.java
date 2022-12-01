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
    private JLabel lbPrecioCarro;
    private JTextField tfPrecioCarro;
    private JButton btVenderCarro;
    private JLabel lbNombre;
    private JLabel lbEmpleado;

    //----------------------
    // Metodos
    //----------------------
    public DialogoConsignar()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbPrecioCarro = new JLabel("Precio Carro: ");
        lbPrecioCarro.setBounds(10,50,140,20);
        this.add(lbPrecioCarro);

        lbNombre = new JLabel();
        lbNombre.setBounds(150,30,100,25);
        this.add(lbNombre);

        lbEmpleado = new JLabel("Empleado: ");
        lbEmpleado.setBounds(10,30,100,25);
        this.add(lbEmpleado);

        tfPrecioCarro = new JTextField();
        tfPrecioCarro.setBounds(150,50,100, 25);
        this.add(tfPrecioCarro);

        btVenderCarro = new JButton("Vender");
        btVenderCarro.setBounds(20,140,260,25);
        btVenderCarro.setActionCommand("vender");
        this.add(btVenderCarro);

        //Caracteristicas de la ventana
        this.setTitle("Vender Carro");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getPrecioCarro()
    {
        return tfPrecioCarro.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btVenderCarro.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }

    public void mostrarResultado(String msj)
    {
        //taResultado.append(msj + "\n");
        lbNombre.setText(msj);
    }
}
