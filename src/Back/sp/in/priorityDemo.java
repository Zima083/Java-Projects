package Back.sp.in;
import java.util.*;
class MyCom implements Comparator<Integer>
{
    @Override
    public int compare(Integer o,Integer o1) {
        if (o<o1) return 1;
        if (o>o1) return -1;
        return 0;
    }
}
public class priorityDemo {
    public static void main(String[] args) {
    PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
    p.add(20);
    p.add(10);
    p.add(30);
    p.add(5);
    p.add(15);
    p.add(3);
    System.out.println(p.peek());
    p.forEach((n)->System.out.println(n));
    p.poll();
        System.out.println("After Deletion");
        p.forEach((n)->System.out.println(n));
    }
}
