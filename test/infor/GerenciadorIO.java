package infor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciadorIO {

    public static String getProperties(String nome) {
// Cria e le os valores padrao  
        Properties defaultProps = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream("./config/config.properties");
            defaultProps.load(in);
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GerenciadorIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String propriedade = defaultProps.getProperty(nome);
        return propriedade;
    }

    public static void getPropriedades(String properties, String Valor) {
        File file = new File("./config/config.properties");
        Properties properties1 = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            properties1.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties1.setProperty(properties, Valor);

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            properties1.store(outputStream, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
