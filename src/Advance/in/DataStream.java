package Advance.in;
import java.io.*;
class Student1 {
    int rollno;
    String name;
    String dept;
    float average;
}
public class DataStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("C:/Users/zimaj/Desktop/Java/Student1.txt");
        DataInputStream dos = new DataInputStream(fis);

        Student s = new Student();
        s.rollno=dos.readInt();
        s.name=dos.readUTF();
        s.dept=dos.readUTF();
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
        dos.close();
        fis.close();

    }
}
