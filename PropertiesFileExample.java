import java.io.*;
import java.util.Properties;
public class PropertiesFileExample
{
    public static void main(String args[]) throws IOException
    {
        try {
        Properties props = new Properties();

        //Set Properties
        props.setProperty("db.user","Rajat");
        props.setProperty("db.password","secret");

        //save to a file
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos,"Database Configuration");
        System.out.println("Info has been stored in file");
        fos.close();

        // Now load file
        Properties loadProps = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProps.load(fis);
        System.out.println("File has been loaded");
        fis.close();

        // Print loaded values
        System.out.println("User: "+loadProps.getProperty("db.user"));
        System.out.println("Password: "+loadProps.getProperty("db.password"));
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}