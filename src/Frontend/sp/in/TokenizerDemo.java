package Frontend.sp.in;
import java.util.*;
import java.io.*;

public class TokenizerDemo {
    public static void main(String[] args) throws Exception{
FileInputStream fis= new FileInputStream("C:/Users/zimaj/Desktop/Java/Student1.txt");
byte b[]=new byte[fis.available()];
        fis.read(b);
String data=new String(b);
//String data = "name=Vijay;address=delhi;country=india;dept=cse";
  StringTokenizer tz = new StringTokenizer(data, "=");
  String s;
  while (tz.hasMoreTokens()){
      s = tz.nextToken();
      System.out.println(s);
  }
    }
}
