package backend.sp.in;
class Mythread implements Runnable{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"hello");
            i++;
        }
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        Mythread t= new Mythread();
  Thread th = new Thread(t);
  th.start();
   int i=1;
   while (true){
       System.out.println(i+"World");
   }
    }
}
