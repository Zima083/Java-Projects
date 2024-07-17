package backend.sp.in;
import java.lang.Thread;
class SThread extends Thread {
    public SThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++ +"My Thread");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws Exception{
        SThread s = new SThread("My thread 1");

        s.start();
        int count = 1;
        while (true) {
            System.out.println(count++ +"in");
            Thread.yield();
        }

    }
}
