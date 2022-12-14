package controlador;

import modelo.Biblioteca;
import modelo.Libro;
import modelo.LibroColeccion;
import vista.VentanaPrincipal;
import vista.DialogoLibroColeccion;
import vista.PanelEntrada;
import vista.PanelResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener 
{
    private VentanaPrincipal miVentanaPrincipal;
    private Biblioteca biblioteca;

    public Controlador(VentanaPrincipal miVentanaPrincipal, Biblioteca biblioteca) 
    {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.biblioteca = biblioteca;
        this.miVentanaPrincipal.miPanelOperacion.btCrearLibro.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperacion.btCrearColeccion.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperacion.btImprimir.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperacion.btBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperacion.btSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if (comando.equals("crearLibro")) 
        {
            String nombreLibro = PanelEntrada.getTfnombre();
            String nombreAutores = PanelEntrada.getTfautor();
            Integer anioEdicion = Integer.parseInt(PanelEntrada.getTfannoI());
            Boolean libroDeLujo = PanelEntrada.getRbLibroDeLujo();
            biblioteca.agregarLibro(new Libro(nombreLibro, nombreAutores, anioEdicion, libroDeLujo));
            PanelResultados.mostrarResultado("Se ha creado un nuevo libro!\n");
                
        } 
        else if (comando.equals("crearColeccion")) 
        {
            miVentanaPrincipal.crearDialogoLibroColeccion();
            miVentanaPrincipal.miDialogoLibroColeccion.agregarOyenteBoton(this);
        } 
        else if (comando.equals("crearLibroColeccion")) 
        {
                String nombreLibro = DialogoLibroColeccion.getTfNombreLibro();
                String nombreAutores = DialogoLibroColeccion.getTfNombreAutores();
                Integer anioEdicion = Integer.parseInt(DialogoLibroColeccion.getTfAnioEdicion());
                Boolean libroDeLujo = DialogoLibroColeccion.getRbLibroDeLujo();
                String nombreColeccion = DialogoLibroColeccion.getTfNombreColeccion();
                Integer numeroColeccion = Integer.parseInt(DialogoLibroColeccion.getTfNumeroColeccion());
                biblioteca.agregarLibro(new LibroColeccion(nombreLibro, nombreAutores, anioEdicion, libroDeLujo,
                nombreColeccion, numeroColeccion));
                PanelResultados.mostrarResultados("Se ha creado un nuevo libro de colecci??n!\n");
        } 
        else if (comando.equals("imprimirLibros")) 
        {
                biblioteca.imprimirLibros();
        } 
        else if (comando.equals("borrarTexto")) 
        {
                vista.PanelEntrada.borrar();
                this.miVentanaPrincipal.miPanelResultado.borrarTa();
        } 
        else if (comando.equals("cerrarVentana")) 
        {
                JOptionPane.showMessageDialog(null, "El programa se cerrar??...", "Biblioteca se??or P??rez",JOptionPane.WARNING_MESSAGE);
                System.exit(0);
        }
    }
}