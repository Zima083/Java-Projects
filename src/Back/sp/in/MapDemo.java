package Back.sp.in;
import java.util.*;
import java.util.Map.*;
public class MapDemo {
    public static void main(String[] args) {
   LinkedHashMap<Integer,String> lm=new LinkedHashMap<>(5,.75f,true);
   lm.put(33,"A");
   lm.put(8,"B");
   lm.put(3,"as");
   lm.put(4,"S");
   lm.put(5,"j");
   lm.put(6,"h");
   String s =lm.get(2);
   s= lm.get(1);
   s=lm.get(3);
        lm.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
