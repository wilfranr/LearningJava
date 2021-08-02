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
    public final static String BTN_CREAR = "Crear Clientes";
    public final static String BTN_LISTAR = "Listar Clientes";

    //Se crean realciones o atributos
    private JButton btnSaldo;
    private JButton btnCargar;
    private JButton btnCrear;
    private JButton btnListar;
    private Interfaz interfaz;
    //Contructor
    public PanelOpciones(Interfaz inter) {
        super();
        setLayout(new GridLayout(1,4));
        setBorder(new TitledBorder("Opciones"));

        interfaz = inter;

        //Inicializar las relaciones o atributos
        btnSaldo = new JButton(BTN_SALDO);
        btnCargar = new JButton(BTN_CARGAR);
        btnCrear = new JButton(BTN_CREAR);
        btnListar = new JButton(BTN_LISTAR);

        //Modificar las propiedades
        btnSaldo.setActionCommand(BTN_SALDO);
        btnCargar.setActionCommand(BTN_CARGAR);
        btnCrear.setActionCommand(BTN_CREAR);
        btnListar.setActionCommand(BTN_LISTAR);

        btnSaldo.addActionListener(this);
        btnCargar.addActionListener(this);
        btnCrear.addActionListener(this);
        btnListar.addActionListener(this);

        //Agregar las relaciones o atributos
        add(btnSaldo);
        add(btnCargar);
        add(btnCrear);
        add(btnListar);
    }
    public void addClient() {
        String nombre = JOptionPane.showInputDialog(interfaz, "Digita el nombre del cliente: ");
        if (nombre!=null && !nombre.equals("")) {
            interfaz.addClient(nombre);
        }else if (nombre.equals("")) {
            JOptionPane.showMessageDialog(interfaz, "Revisa los datos");
        }
    }
    public void listarClientes() {
        JOptionPane.showMessageDialog(interfaz, interfaz.listarClientes());
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
        else if (e.getActionCommand().equals(BTN_CREAR)) {
            addClient();
        }
        else if (e.getActionCommand().equals(BTN_LISTAR)) {
            listarClientes();
        }
        
    }
    
}
