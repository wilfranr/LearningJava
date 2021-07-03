package views;
import javax.swing.JOptionPane;

import model.Wallet;

public class Vista {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet();
        Wallet wallet3 = new Wallet();
        
        JOptionPane.showMessageDialog(null, "---WALLET START---");
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Nequi, 2-Daviplata, 3-Efecty"));
        if (option == 1) {
            JOptionPane.showMessageDialog(null, wallet1.getSaldo());
            int option2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Saldo, 2-Retiro, 3-Ingreso"));

            if (option2 == 1) {
                JOptionPane.showMessageDialog(null, wallet1.getSaldo());
            }
            if (option2 == 2) {
                int retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad: "));
                JOptionPane.showMessageDialog(null, wallet1.takeMoney(retiro));
            }
            if (option2 == 3) {
                int ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad: "));
                JOptionPane.showMessageDialog(null, wallet1.saveMoney(ingreso));
            }
            JOptionPane.showConfirmDialog(null, "Aceptar");
        }




    }
}
