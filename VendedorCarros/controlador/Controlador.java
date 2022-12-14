package controlador;

import modelo.Carro;
import modelo.Empleado;
import modelo.Empresa;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Empresa empresa;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empresa pEmpresa)
    {
        this.venPrin = pVenPrin;
        this.empresa = pEmpresa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Se ha creado un objeto EmpresaAutomotriz...");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("agregarVendedor"))
        {
            venPrin.crearDialogoAgregarEmpleado();
            this.venPrin.miDialogoAgregarEmpleado.agregarOyenteBoton(this);
        }

        //Agregar vendedor
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarEmpleado.getNombreVendedor();
            empresa.agregarEmpleado(new Empleado(nombre));
            venPrin.miPanelEntradaDatos.setnombre(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado un nuevo empleado: " + nombre);
            venPrin.miDialogoAgregarEmpleado.cerrarDialogoAgregarVendedor();
        }

        //Abrir ventana Vender un carro
        if(comando.equals("venderCarro"))
        {
            venPrin.crearDialogoVenderCarro();
            this.venPrin.miDialogoVenderCarro.agregarOyenteBoton(this);
        }

        //Vender carro
        if(comando.equals("vender"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexnombre();

            double precio = Double.parseDouble(venPrin.miDialogoVenderCarro.getPrecioCarro());

            Empleado emp = empresa.getEmpleado(indexVendedor);
            emp.venderCarro(new Carro(precio));
            venPrin.miPanelResultados.mostrarResultado("El empleado: " + emp.getNombre() + " ha vendido un carro");
            venPrin.miDialogoVenderCarro.cerrarDialogoVenderCarro();
        }

        //Calcular el sueldo de un vendedor
        if(comando.equals("calcularSueldo"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexnombre();
            Empleado emple = empresa.getEmpleado(indexVendedor);
            emple.calcularSueldo();
            venPrin.miPanelResultados.mostrarResultado("El sueldo del empleado: " + emple.getNombre() + " es " + emple.getSueldo());
        }

        //Liquidar nomina total empresa
        if(comando.equals("liquidarNomina"))
        {
            double valorNomina = empresa.calcularNomina();
            venPrin.miPanelResultados.mostrarResultado("El valor total de la n??mina es." + valorNomina);
        }


        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}