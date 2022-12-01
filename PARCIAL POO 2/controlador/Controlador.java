package controlador;

import modelo.Banco;
import vista.VentanaPrincipal;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener 
{
    private VentanaPrincipal miVentanaPrincipal;
    private Banco banco;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Banco banco) 
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.banco = banco;
        this.miVentanaPrincipal.miPanelOperaciones.btAgregarCuenta.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btConsignar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btRetirar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btSaldo.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btIntereses.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btSalir.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {   
        if (comando.equals("borrarTexto")) 
        {
                vista.PanelEntradaDatos.borrar();
                this.miVentanaPrincipal.miPanelResultados.borrar();
        } 
        else if (comando.equals("cerrarVentana")) 
        {
                JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Biblioteca señor Pérez",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
        }
    }
}