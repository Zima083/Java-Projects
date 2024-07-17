package Zeema.sp;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample {
    public static void main(String[] args) throws Exception
    {
            try (FileInputStream fis = new FileInputStream("C:/Users/zimaj/Desktop/Java/test.txt")) {
            int x ;
                while ((x= fis.read())!=-1){
                    System.out.println((char)x);
            }
            }
    }
}
