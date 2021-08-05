package test;

import model.Client;
import model.User;

public class Test {
    public static void main(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
        

    }
    public void escenarioClient() {
        Client cliente1 = new Client("Yoseth");
        //boolean test1 = assertEquals("Yoseth", cliente1.getNombre());
        boolean test2 = assertNotNull(cliente1.getWallet());
        
        
        
        
        
        //System.out.println( (test1)? "Pasó la prueba de nombre":"Error, el nombre no coincide");
        System.out.println((test2)? "Pasó la prueba de Wallet":"Error, no existe la wallet");
        
    }
    
    /* Recibe 2 enteros y verficar si la billetera inicia en 0, recibe expected y received */


    // public boolean assertEquals(int expected, int 0) {
    //     if (expected.equals(0)) {
    //         return true;
    //     }
    //     return false;
    // }
    public boolean assertNotNull(Object objecto) {
        if (objecto != null) {
            return true;
        }
        return false;
    }
    
}
