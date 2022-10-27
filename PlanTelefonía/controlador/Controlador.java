package controlador;

import modelo.Telefonía;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener 
{
        private VentanaPrincipal miVentanaPrincipal;
        private Telefonía modelo;

        public Controlador(VentanaPrincipal miVentanaPrincipal, Telefonía modelo) 
        {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.modelo = modelo;
                this.miVentanaPrincipal.miPanelOperaciones.btCalcular.addActionListener(this);
                this.miVentanaPrincipal.miPanelOperaciones.btBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelOperaciones.btSalir.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) 
        {
            String comando = ae.getActionCommand();

            if (comando.equals("calcular")) 
            {
                try {
                        this.modelo.setNumeroCelular(vista.PanelEntradaDatos.getTfNumeroCelular());
                        this.modelo.setOperador(vista.PanelEntradaDatos.getTfOperador());
                        this.modelo.setCantidadMinutos(Integer.parseInt(vista.PanelEntradaDatos.getTfCantidadMinutos()));
                        this.modelo.setValorMinutos(Double.parseDouble(vista.PanelEntradaDatos.getTfValorMinutos()));
                        this.modelo.calcularCostoTotal();
                            if (this.modelo.getOperador().equals("Movilujo")) 
                            {
                                this.miVentanaPrincipal.miPanelResultados.mostrarResultados(this.modelo.toString() + "\nCantidad de descuento: 50%");
                            } 
                            else 
                            {
                            this.miVentanaPrincipal.miPanelResultados.mostrarResultados(this.modelo.toString() + "\nCantidad de descuento: 0%");
                            }
                    } 
                    catch (Exception ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!",
                                                "Suma 3 Enteros", JOptionPane.ERROR_MESSAGE);
                        vista.PanelEntradaDatos.borrar();
                    }
            } 
            else if (comando.equals("borrar")) 
            {
                vista.PanelEntradaDatos.borrar();
                this.miVentanaPrincipal.miPanelResultados.borrarTa();
            } 
            else if (comando.equals("salir")) 
            {
                JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Suma 3 Enteros",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        }
}