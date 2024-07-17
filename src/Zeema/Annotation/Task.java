package Zeema.sp.Annotation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Task {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:/Work Eclispe/AdvanceOOP/src/Zeema/sp/Annotation/Source1.txt");
        FileInputStream fis1 = new FileInputStream("D:/Work Eclispe/AdvanceOOP/src/Zeema/sp/Annotation/Source2.txt");

        FileOutputStream fos = new FileOutputStream("D:/Work Eclispe/AdvanceOOP/src/Zeema/sp/Annotation/Destination.txt");
        SequenceInputStream sis = new SequenceInputStream(fis,fis1);

        int b;
        while ((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close();
        fis.close();
        fis1.close();
        fos.close();
    }
}
