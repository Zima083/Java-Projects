package Zeema.sp;
enum Dept{
    CS,IT,Civial,ECE;
    private Dept(){
        System.out.println(this.name());
    }
}
public class Wrapper {
    public static void main(String[] args) {
   Dept d = Dept.CS;

   switch (d){
       case CS :
           System.out.println("Head: John \nBlock: A");
        break;
       case IT:
           System.out.println("Head: John Smith \nblock: B");
   break;
       case ECE:
           System.out.println("Head: Ali \nblock: C");
       break;
       case Civial:
           System.out.println("Head: JDavrh \nblock: D");
break;
   }
    }
}
