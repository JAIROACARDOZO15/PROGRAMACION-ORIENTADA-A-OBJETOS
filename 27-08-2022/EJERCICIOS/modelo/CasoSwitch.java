import javax.swing.JOptionPane;

package modelo;
public class CasoSwitch
{
    public static void main(String[] args) 
    {
        // Declaración de variables
        int n;
        String rta = "";
        
        // input
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el digito"));

        // processing
        switch(n)
        {
            case 0:
                rta="CERO";
                break;
            case 1:
                rta="UNO";
                break;
            case 2:
                rta="DOS";
                break;
            case 3:
                rta="TRES";
                break;
            case 4:
                rta="CUATRO";
                break;
            case 5:
                rta="CINCO";
                break;
            case 6:
                rta="SEIS";
                break;
            case 7:
                rta="SIETE";
                break;
            case 8:
                rta="OCHO";
                break;
            case 9:
                rta="NUEVE";
                break;
            default:
                rta= "NO ES UN DIGITO";
                break;


        }
        
        // output
        JOptionPane.showMessageDialog(null,rta);

        // end
        System.exit(0);
    }
}
