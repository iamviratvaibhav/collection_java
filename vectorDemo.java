import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=0; i<10; i++){
            v.addElement(i);

        }
        System.out.println("Vector capacity "+ v.capacity());
        v.addElement(90);
        System.out.println("Vector Capacity: "+v.capacity());
    }
}
