package Back.sp.in;
import java.util.*;
public class Collections {
    public static void main(String[] args) {
        LinkedList<Integer> alist = new LinkedList<>();
        LinkedList<Integer> alist2 = new LinkedList<>(List.of(50,60,70,80,90));
        alist.add(10);
        alist.add(0,55);
      alist.addAll(1,alist2);
        alist.add(5,70);
     alist.set(6,100);

     alist.forEach(n->show(n));
    }
    static void show(int n){
        System.out.println(n);
    }
}
