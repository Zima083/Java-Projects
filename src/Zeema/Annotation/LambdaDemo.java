package Zeema.sp.Annotation;
@FunctionalInterface
interface Mylambda{
    public int display(String str,String str1);
}

public class LambdaDemo {
    public LambdaDemo(String s){
        System.out.println(toString().toUpperCase());
    }
    public static void main(String[] args) {
    Mylambda ml =String::compareTo;
        System.out.println(ml.display("jkl","fubk"));
    }
}
