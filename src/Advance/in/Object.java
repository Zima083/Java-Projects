package Advance.in;
import java.io.*;
class Stuck implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data =10;
    public  transient int t;

    public Stuck(){

    }
    public Stuck(int r,String n,float a,String d){
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        data=500;
        t=500;
    }

    @Override
    public String toString() {
        return "\nStudent Deatils\n"+
                "\nRoll no"+rollno+
                "\nName"+name+
                "\nAverage"+avg+
                "\nDept"+dept+
                "\ndata"+data+
                "\nTransient "+t+"\n";
    }
}
public class Object {
   /* public static void main(String[] args) throws Exception{
FileOutputStream fos = new FileOutputStream("C:/Users/zimaj/Desktop/Java/Student2.txt");
   ObjectOutputStream oos = new ObjectOutputStream(fos);
   Stuck s = new Stuck(12,"Allena",34.55f,"AI");
     oos.writeObject(s);
    fos.close();
    oos.close();
    }*/
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/zimaj/Desktop/Java/Student2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Stuck s = (Stuck)ois.readObject();
        System.out.println(s);
        fis.close();
        ois.close();
    }
}
