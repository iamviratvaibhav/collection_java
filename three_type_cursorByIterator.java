import java.util.ArrayList;
import java.util.Iterator;

public class three_type_cursorByIterator{
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(120);
        list.add(30);
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}