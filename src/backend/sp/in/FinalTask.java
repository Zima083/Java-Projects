package backend.sp.in;
class WhiteBoard{
String text;
int noofstudents=0;
int count=0;
public void attendence(){
    noofstudents++;
}
synchronized public void write(String t){
    System.out.println("teacher is writing.."+t);
    while (count!=0)
        try {
            wait();
        }
    catch (Exception e){}
    text=t;
    count=noofstudents;
    notify();
}
  synchronized   public String read(){
        while (count==0)
            try {
                wait();
            }
            catch (Exception e){}
        String t=text;
        count--;
        if (count==0)
        notify();
        return t;
    }
}
class Teacher extends Thread {
    WhiteBoard wt;
    String notes[]={"Java is language","it is oops","it is platform independent"};
    public Teacher(WhiteBoard w){
        wt=w;
    }

    @Override
    public void run() {
        for (int i=0;i<notes.length;i++){
            wt.write(notes[i]);
        }
    }
}
class Student extends Thread{
    String name;
    WhiteBoard wb;
    public Student(String n,WhiteBoard w){
        name=n;
        wb=w;
    }

    @Override
    public void run() {
        String text;
        wb.attendence();
        do {
            text=wb.read();
            System.out.println(name+"Reading"+text);
            System.out.flush();
        }while (!text.equals("end"));
    }
}
public class FinalTask {
    public static void main(String[] args) {
WhiteBoard w = new WhiteBoard();
Teacher t = new Teacher(w);
Student s1= new Student("1,John",w);
        Student s2= new Student("2,ALi",w);
        Student s3= new Student("3,John",w);
        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
