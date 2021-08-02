package views;

import javax.swing.JFrame;

import controller.Controlador;

import java.awt.BorderLayout;

public class Interfaz extends JFrame{

    private PanelOpciones panelOpciones;
    private Controlador controlador;

    public Interfaz () {
        super();
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Wallet");
        setLayout(new BorderLayout());

        controlador = new Controlador();

        PanelOpciones panel = new PanelOpciones(this);

        add(panel, BorderLayout.SOUTH);


    }
    public void addClient(String nombre) {
        controlador.addClient(nombre);
    }
    public String listarClientes() {
        return controlador.listarClientes();
    }
    public static void main(String[] args) {
        Interfaz vistaPrincipal = new Interfaz();
        vistaPrincipal.setVisible(true);
    }
    
    
}

