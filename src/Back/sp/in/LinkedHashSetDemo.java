package Back.sp.in;

import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(10);
      set.add("A");
      set.add("F");
      set.add("C");
      set.add("K");
      set.add("E");
    Iterator<String> itr = set.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
    }
}
