package Back.sp.in;
import java.util.*;
public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
    dq.offerLast(10);
    dq.offerLast(20);
    dq.offerLast(30);
    dq.offerLast(40);//from left to right insert the values
    dq.pollFirst();//implementing the queue
     /*dq.offerFirst(1);
     dq.offerFirst(2);
     dq.offerFirst(3);
     dq.offerFirst(4);*/
        dq.forEach((x)->System.out.println(x));
    }
}
