package controlador;

import modelo.Empresa;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empresa model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empresa pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperacion.btCalcular.addActionListener(this);
        this.venPrin.miPanelOperacion.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperacion.btSalir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("calcular"))
        {   
            this.model.setnombre(this.venPrin.miPanelEntrada.getTfnombre());
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntrada.getTfhoras()));
            this.model.setannoI(Integer.parseInt(this.venPrin.miPanelEntrada.getTfannoI()));
            this.model.setedad(Integer.parseInt(this.venPrin.miPanelEntrada.getTfedad()));
            this.model.setValor(Integer.parseInt(this.venPrin.miPanelEntrada.getTfvalor()));
            this.model.setHoras(Integer.parseInt(this.venPrin.miPanelEntrada.getTfhoras()));
            this.model.pFechaIngreso();
            this.model.pEdad();
            this.model.hallarSalario();
            this.venPrin.miPanelResultado.mostrarResultado(this.model.getannoIn(), this.model.getedad(), this.model.getSalario(), this.model.getHoras(), this.model.getnombre());
            
        }
        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los valores se borraran ","Empleado", JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntrada.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara ","Empleado", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }    
}

