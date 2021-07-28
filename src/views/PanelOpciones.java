package views;
import model.Wallet;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel implements ActionListener {

    public final static String BTN_SALDO = "Consultar saldo";
    public final static String BTN_CARGAR = "Cargar saldo";

    //Se crean realciones o atributos
    private JButton btnSaldo;
    private JButton btnCargar;
    private Interfaz interfaz;
    //Contructor
    public PanelOpciones(Interfaz inter) {
        super();
        setLayout(new GridLayout(1,2));
        setBorder(new TitledBorder("Opciones"));

        interfaz = inter;

        //Inicializar las relaciones o atributos
        btnSaldo = new JButton(BTN_SALDO);
        btnCargar = new JButton(BTN_CARGAR);

        //Modificar las propiedades
        btnSaldo.setActionCommand(BTN_SALDO);
        btnCargar.setActionCommand(BTN_CARGAR);

        btnSaldo.addActionListener(this);
        btnCargar.addActionListener(this);

        //Agregar las relaciones o atributos
        add(btnSaldo);
        add(btnCargar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Wallet wallet1 = new Wallet();
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals(BTN_SALDO)) {
            //System.out.println("Estás viendo el saldo");
            JOptionPane.showMessageDialog(this, wallet1.getSaldo());

        }
        else if (e.getActionCommand().equals(BTN_CARGAR)) {
            //System.out.println("Ingresar dinero");
            System.out.println(wallet1.saveMoney(200000));
            wallet1.saveMoney(Integer.parseInt(JOptionPane.showInputDialog(interfaz, "Ingrese la cantidad a depositar: ")));
            JOptionPane.showMessageDialog(interfaz, "su nuevo saldo es: $"+wallet1.getSaldo());
        }
        
    }
    
}
