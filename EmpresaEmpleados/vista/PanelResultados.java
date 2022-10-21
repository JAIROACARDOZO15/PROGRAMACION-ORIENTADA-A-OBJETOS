package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
    //---------------------------
    // Atributos 
    //---------------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelResultados()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Creacion y edicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,447,150);
        this.add(spResultado);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
        
    }
    //Borrar
    public void borrar()
    {
        taResultado.setText("");
    }
    
    //Mostrar resultado
    public void mostrarResultado(int annoI , int edad, int salario, int horasTrabajo, String nombre)
    {

        taResultado.append("\nEl nombre del empleado es " + nombre + "\n Trabajo " + horasTrabajo + " horas este mes " );
        taResultado.append("\nEl empleado nacio el año " + edad);
        taResultado.append("\nEl empleado lleva " + annoI + " en la empresa");
        taResultado.append("\nEl salario del usuario es " + salario);
        
    }
}   