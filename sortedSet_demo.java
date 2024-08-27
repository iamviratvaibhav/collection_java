import org.w3c.dom.ls.LSOutput;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet_demo {
    public static void main(String[] args) {
        SortedSet<Integer>ss=new TreeSet<>() ;

    ss.add(10);
    ss.add(20);
    ss.add(12);
    ss.add(4);
        System.out.println("The answe is in sorted manner:"+ss);

    }
}



