package view;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    // ----------------------
    // Atributos
    // ----------------------
    public JButton btnCrear;
    public JButton btnMover;
    public JButton btnAcelerar;
    public JButton btnFrenar;

    // ----------------------
    // Metodos
    // ----------------------

    // Constructor
    public PanelOperaciones() {
        // Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);

        // Creación y adicion de los botones
        btnCrear = new JButton("Crear");
        btnCrear.setFont(new Font("Arial", BOLD, 12));
        btnCrear.setBounds(10, 20, 90, 20);
        add(btnCrear);
        btnCrear.setActionCommand("crear");

        btnMover = new JButton("Mover");
        btnMover.setFont(new Font("Arial", BOLD, 12));
        btnMover.setBounds(105, 20, 90, 20);
        add(btnMover);
        btnMover.setActionCommand("mover");
        btnMover.setEnabled(false);

        btnAcelerar = new JButton("Acelerar");
        btnAcelerar.setFont(new Font("Arial", BOLD, 12));
        btnAcelerar.setBounds(200, 20, 90, 20);
        add(btnAcelerar);
        btnAcelerar.setActionCommand("acelerar");
        btnAcelerar.setEnabled(false);

        btnFrenar = new JButton("Frenar");
        btnFrenar.setFont(new Font("Arial", BOLD, 12));
        btnFrenar.setBounds(295, 20, 80, 20);
        add(btnFrenar);
        btnFrenar.setActionCommand("frenar");
        btnFrenar.setEnabled(false);

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL) {
        btnCrear.addActionListener(pAL);
        btnMover.addActionListener(pAL);
        btnAcelerar.addActionListener(pAL);
        btnFrenar.addActionListener(pAL);
    }

    public void desactivarBotonCrear() {
        btnCrear.setEnabled(false);
    }

    public void activarBotones() {
        btnMover.setEnabled(true);
        btnAcelerar.setEnabled(true);
        btnFrenar.setEnabled(true);
    }
}
