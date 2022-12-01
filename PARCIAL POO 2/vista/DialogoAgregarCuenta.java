package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoAgregarCuenta extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreCuenta;
    private JTextField tfNombreCuenta;
    private JButton btAgregarCuenta;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarCuenta()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreCuenta = new JLabel("Cuenta: ");
        lbNombreCuenta.setBounds(10,50,140,20);
        this.add(lbNombreCuenta);
        
        tfNombreCuenta = new JTextField();
        tfNombreCuenta.setBounds(150,50,100, 25);
        this.add(tfNombreCuenta);

        btAgregarCuenta = new JButton("Agregar");
        btAgregarCuenta.setBounds(20,140,260,25);
        btAgregarCuenta.setActionCommand("agregar");
        this.add(btAgregarCuenta);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Cuenta");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreCuenta()
    {
        return tfNombreCuenta.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarCuenta.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarCuenta()
    {
        this.dispose();
    }
}
