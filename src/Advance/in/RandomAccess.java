package Advance.in;
import java.io.*;
public class RandomAccess {
    public static void main(String[] args) throws Exception{
        RandomAccessFile fi =new RandomAccessFile("C:/Users/zimaj/Desktop/Java/Data.txt","rw");
        //byte b[]={a,b,c,d,'e',f,g,h,i,j};
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());
        fi.write('d');
        System.out.println((char) fi.read());
        fi.skipBytes(3);
        fi.seek(3);
        System.out.println((char) fi.read());
        System.out.println(fi.getFilePointer());

    }
}
