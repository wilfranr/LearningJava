import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "CALCULATOR");
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Type 1- for SUM, 2- for REST, 3- for MULTIPLICATION, 4- for DIVISION"));

        if (option == 1) {
            JOptionPane.showMessageDialog(null, "---SUM---");

            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a Number: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Type other number: "));
            int result = a+b;

            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }
        if (option == 2) {
            JOptionPane.showMessageDialog(null, "---REST---");

            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a Number: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Type other number: "));
            int result = a-b;

            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }

        if (option == 3) {
            JOptionPane.showMessageDialog(null, "---MULTIPLICATION---");

            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a Number: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Type other number: "));
            int result = a*b;

            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }

        if (option == 4) {
            JOptionPane.showMessageDialog(null, "---DIVISION---");

            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a Number: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Type other number: "));
            int result = a/b;

            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }

        else{
            JOptionPane.showMessageDialog(null, "Invalid Option");
        }


        
    }
    
}
