package Frontend.sp.in;

class MyArray<T> {
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
    public class GenericDemo {
        static <E> void show(E... list){
           for (E x : list) {
               System.out.println(x);
           }
        }
        public static void main(String[] args) {
            show("a", "b", "c");
           show(1, 2, 3);
        }
    }


