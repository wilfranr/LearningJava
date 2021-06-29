import javax.swing.JOptionPane;

public class Major {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a Number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Type other Number: "));

        if (a>=b) {
            
            if (a==b) {
                JOptionPane.showMessageDialog(null, "Los números son iguales.");
            }else{
                JOptionPane.showMessageDialog(null, "The number major is: "+a);

            }
        }   
        else {
            JOptionPane.showMessageDialog(null, "The number major is: "+b);
        }


    }
    
}
