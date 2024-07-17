package Frontend.sp.in;
import java.io.*;
import java.util.*;
class Customer implements Serializable {
    String custid;
    String name;
    String phoneno;
    static int count =1;
    public Customer (){

    }
    public Customer( String n, String ph) {
        custid = "C"+count;
        count++;
        name = n;
        phoneno = ph;
    }
    public String toString(){
        return "\nCustomer Detail\n"+
               "\nCust-id"+custid+
                "\nName "+ name +
                "\nPhone " + phoneno+"\n";
    }
}
public class CustomerTest {
   /* public static void main(String[] args) throws Exception{
        Customer list[]={new Customer("Smith","1223456"),new Customer("John","65432"),new Customer("Ali","34789")};
        FileOutputStream fos=new FileOutputStream("Customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(list.length);//How many objects are they in array.
        for (Customer c:list){oos.writeObject(c);}
        oos.close();
        fos.close();
    }*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length=ois.readInt();
        Customer list[] = new Customer[length];
        for(int i=0;i<length;i++){
            list[i]=(Customer)ois.readObject();
        }
        System.out.println("Enter name of Customer");
        String name=sc.nextLine();
        for(int i=0;i<length;i++){
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
        }
        ois.close();
        fis.close();
    }
}
