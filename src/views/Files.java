package views;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Files {


    public static void main(String[] args) {
        // try {
        //     OutputStream ous = new FileOutputStream("./data/data.properties");
        //     Properties prop = new Properties();
            
        //     prop.setProperty("nombre", "Yoseth");
        //     prop.setProperty("edad", "35");
            
        //     for (int i = 0; i <= 100; i++) {
        //         prop.setProperty(i+"", (i*3)+"");
        //     }

        //     prop.store(ous, null);

        //     System.out.println(prop);


        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
        try {
            InputStream ins = new FileInputStream("./data/data.properties");
            Properties prop = new Properties();
            prop.load(ins);

            System.out.println(prop.getProperty("58"));

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
