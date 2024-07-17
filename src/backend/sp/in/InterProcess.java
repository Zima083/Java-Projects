package backend.sp.in;
class Mydata{
    int value;
    boolean flag=true;
   synchronized public void setValue(int v) {
       while (flag!=true)
          try{ wait();} catch (Exception e){}
       value = v;
     flag=false; 
     notify();
   }

    synchronized public int getValue() {
        int x=0;
        while (flag!=false)
            try{ wait();} catch (Exception e){}
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    Mydata data;
    public Producer(Mydata d){
        data=d;
    }

    @Override
    public void run() {
        int count=1;
        while (true){
            data.setValue(count);
            System.out.println("Producer"+count);
       count++;
        }
    }
}
class Consumer extends Thread{
    Mydata data;
    public Consumer(Mydata d){
        data=d;
    }

    @Override
    public void run() {
        int value;
        while (true){
            value=data.getValue();
            System.out.println("Consumer:"+value);
        }
    }
}
public class InterProcess {
    public static void main(String[] args) {
        Mydata d =new Mydata();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }

}
