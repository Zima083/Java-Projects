package backend.sp.in;
class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}
public class ExceptionDemo {
   static void fun() {
       try {
           throw new LowBalanceException();
       }
       catch (LowBalanceException e){
           System.out.println(e);
       }
   }
   static void fun2(){ 
       fun();
   }
   static void fun3(){
       fun2();
   }
    public static void main(String[] args) {
      fun3();
    }
}
