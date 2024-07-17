package backend.sp.in;

class ATM{
    synchronized public void checkBalance(String name){
        System.out.print(name+"Checking");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {};
        System.out.println("Balance");
    }
  synchronized  public void withdraw(int amount, String name){
        System.out.print(name+"Withdrawing");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {};
      System.out.println(amount);
    }

}
class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public Customer(String n,int amt,ATM a) {
      name=n;
      amount=amt;
      atm=a;
    }
    public void useATM(){
        atm.checkBalance(name);
       atm.withdraw(amount,name);
    }

    @Override
    public void run() {
        useATM();
    }
}
public class StudentChall {
    public static void main(String[] args) {
 ATM t = new ATM();
Customer cs = new Customer("zima",456,t);
        Customer c2 = new Customer("Ali",123,t);
cs.start();
c2.start();
    }
}
