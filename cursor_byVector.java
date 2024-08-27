//import java.util.ArrayList;
//import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.Vector;
//public class cursor_byVector {
//    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        Enumeration<Integer> ele=Vector.elements();
//        while(ele.hasMoreElements()){
//            Integer integer = ele.nextElement();
//            System.out.println(integer);
//        }
//    }
//}




import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class cursor_byVector {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);

        // Create a Vector and add all elements from the ArrayList to it
        Vector<Integer> vector = new Vector<>(list);

        // Get the Enumeration from the Vector
        Enumeration<Integer> ele = vector.elements();

        // Iterate over the elements using Enumeration
        while (ele.hasMoreElements()) {
            Integer integer = ele.nextElement();
            System.out.println(integer);
        }
    }
}

