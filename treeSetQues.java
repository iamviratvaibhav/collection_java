import java.util.TreeSet;
public class treeSetQues {
    public static void main(String[] args)  {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        try {

            ts.addFirst(10);
            ts.add(30);
            ts.add(20);
            ts.add(50);

//            ts.add(50);
            ts.addLast(60);
            System.out.println(ts);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Unsupport exp:" + e);
        }
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(3);
        System.out.println(ts + "thsi is without error:");
    }
}
