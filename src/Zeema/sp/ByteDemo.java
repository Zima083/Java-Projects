package Zeema.sp;
import java.io.*;
public class ByteDemo {
    public static void main(String[] args) throws Exception{
       char c[]={'a','b','x','d'};
        CharArrayReader cr = new CharArrayReader(c);
        int x;
        while ((x=cr.read())!=-1){
            System.out.println((char)x);
        }
    cr.close();
    }
}
