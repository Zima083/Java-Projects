package Frontend.sp.in;
import java.io.FileInputStream;
import java.util.*;
import java.io.FileOutputStream;
import java.util.Properties;
public class PropertyDemo {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
       /* p.setProperty("Brand","Dell");
        p.setProperty("Color","Red");
        p.setProperty("OS","Window10");
        p.setProperty("Model","Latitude");
        //p.store(new FileOutputStream("C:/Users/zimaj/Desktop/Java/MyData.txt"),"Laptop");
        p.storeToXML(new FileOutputStream("C:/Users/zimaj/Desktop/Java/MyData.xml"),"Laptop");
*/
        p.loadFromXML(new FileInputStream("C:/Users/zimaj/Desktop/Java/MyData.xml"));
        System.out.println(p);
    }
}
