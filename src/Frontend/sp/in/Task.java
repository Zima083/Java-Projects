package Frontend.sp.in;
import java.io.*;
interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
class NeoGen<T extends Comparable<T>> implements MinMax<T> {
    T[] nums;

    NeoGen(T[] o) {
        nums = o;
    }

    @Override
    public T max() {
        T v = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i].compareTo(v) > 0)
                v = nums[i];
            return v;
        }
        public T min () {
            T v = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i].compareTo(v) < 0)
                    v = nums[i];
                return v;
        }
}
    public class Task {
        public static void main(String[] args) throws Exception {
            Integer inums[] = {1, 2, 3, 4, 5, 6};
            Character chr[]= {'a','b','c','d'};
            NeoGen<Integer> iob = new NeoGen<Integer>(inums);
            NeoGen<Character> cob = new NeoGen<Character>(chr);
            System.out.println("max value in inums:"+iob.max());
            System.out.println("min value in inums:"+iob.min());

            System.out.println("max value in inums:"+cob.max());
            System.out.println("min value in inums:"+cob.min());
        }
    }

