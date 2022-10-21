package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //-------------------------
    // Atributos
    //-------------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    
    //-------------------------
    // Métodos
    //-------------------------

    public VentanaPrincipal()
    {
         this.setLayout(null);

         miPanelEntradaDatos = new PanelEntradaDatos();
         miPanelEntradaDatos.setBounds(10,10,670,300);
         this.add(miPanelEntradaDatos);
 
         miPanelOperaciones = new PanelOperaciones();
         miPanelOperaciones.setBounds(10,210,465,60);
         this.add(miPanelOperaciones);
 
         miPanelResultados = new PanelResultados();
         miPanelResultados.setBounds(10,275,465,180);
         this.add(miPanelResultados);
 
         this.setTitle("VECTORES");
         this.setSize(705,690);

         this.setLocationRelativeTo(null);;
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setVisible(true);
    }
}
