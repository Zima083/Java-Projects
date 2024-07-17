package Advance.in;
import java.io.*;
class Student {
    int rollno;
    String name;
    String dept;
}
public class File {
    public static void main(String[] args) throws Exception {
    FileInputStream fos = new FileInputStream("C:/Users/zimaj/Desktop/Java/Student.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fos));
    Student s = new Student();
    s.rollno=Integer.parseInt(br.readLine());
    s.dept= br.readLine();
    s.name= br.readLine();
        System.out.println("rollno"+s.rollno);
        System.out.println("Name"+s.name);
        System.out.println("dept"+s.dept);
    }
}
