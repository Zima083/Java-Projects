package backend.sp.in;
import java.io.*;
import java.util.*;
public class ThrowThrowsDemo {
 static FileInputStream fi;
 static void Divide()  throws Exception{
  fi=new FileInputStream("C:\\Users\\zimaj\\Desktop\\Java\\Code.txt");
  Scanner sc = new Scanner(System.in);
  int a= sc.nextInt();
  int b= sc.nextInt();
  int c= sc.nextInt();
     System.out.println(a/b);
     fi.close();
 }
    public static void main(String[] args) throws Exception{
  Divide();
    }
}
