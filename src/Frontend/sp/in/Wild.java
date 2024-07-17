package Frontend.sp.in;
class MyArray1<T> {
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T x) {
        A[length++] = x;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}
public class Wild {
    static void fun(MyArray1<?> obj){//Anytpe it works
   obj.display();
    }
    public static void main(String[] args) {
    MyArray1<String> obj = new MyArray1<>();
    obj.append("Hi");
    obj.append("Bye");

    MyArray1<Integer> obj2 = new MyArray1<>();
    obj2.append(10);
    obj2.append(20);

    fun(obj);
    fun(obj2);
    }
}
