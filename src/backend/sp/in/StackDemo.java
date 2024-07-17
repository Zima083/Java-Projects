package backend.sp.in;
class StackOverflow extends Exception{
    @Override
    public String toString() {
        return "Stack is full you must delete the item";
    }
}
class StackUnderflow extends Exception{
    @Override
    public String toString() {
        return "Stack is Empty! Add the values to it";
    }
}
class stack{
    private int top=-1;
    private int size;
    private int S[];
    public stack(int sz){
        size=sz;
        S=new int[sz];
    }
    public void push(int x) throws StackOverflow{
      if(top==size-1)
          throw new StackOverflow(); //Must tell the user about the exception error.
      top++;
      S[top]=x;
    }
    public int pop() throws StackUnderflow{
        int x=-1;
  if (top==-1)
      throw new StackUnderflow();
  x=S[top];
  top--;
  return x;
    }
}
public class StackDemo {
    public static void main(String[] args) {
        stack sc = new stack(5);
        try {
            sc.push(14);
            sc.push(12);
            sc.push(14);
            sc.push(12);
            sc.push(14);

        } catch (StackOverflow s) {
           System.out.println(s);
        }
    }
}