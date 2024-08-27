//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//
//public class list_iterator {
//    public static void main(String[] args) {
//    ArrayList<Integer> al = new ArrayList<>();
//    al.add(10);
//    al.add(40);
//    al.add(30);
//    Iterator<Integer> it =al.iterator();
//        ListIterator<Integer>listIterator=al.listIterator();
////        while(listIterator.hasNext()){
//        while(listIterator.hasPrevious()){
////            System.out.println(listIterator.next());
//            System.out.println(listIterator.previous());
//        }
//    }
//}


import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(30);

        ListIterator<Integer> listIterator = al.listIterator();

        // Moving forward through the list
        System.out.println("Forward iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Moving backward through the list
        System.out.println("Backward iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
