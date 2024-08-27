//import java.util.HashMap;
//import java.util.Map;
//import java.util.Iterator;
//public class mapDemo {
//    public static void main(String[] args) {
//        Iterator<Map.Entry<Integer, String>> integer=mapD.entrySet().iterator;
//        mapD.put(10,"Raja");
//        mapD.put(20, "Ram");
//        mapD.put(40, "Ravi");
//        mapD.put(30, "Hari");
//        System.out.println(mapD);
//        mapD.put(null, "null Value inserted");
//        mapD.put(11,"new Ram");
//        System.out.println(mapD);
//        Iterator<Map.Entry<Integer, String>> integer=mapD.entrySet().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
//}






import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class mapDemo {
    public static void main(String[] args) {
        // Declare and initialize the map
        Map<Integer, String> mapD = new HashMap<>();

        // Populate the map
        mapD.put(10, "Raja");
        mapD.put(20, "Ram");
        mapD.put(40, "Ravi");
        mapD.put(30, "Hari");
        System.out.println("Initial Map: " + mapD);

        // Adding null key and new value
        mapD.put(null, "null Value inserted");
        mapD.put(11, "new Ram");
        System.out.println("Updated Map: " + mapD);

        // Declare the iterator after the map is populated
        Iterator<Map.Entry<Integer, String>> integer = mapD.entrySet().iterator();

        // Iterate and print each entry in the map
        while (integer.hasNext()) {
            Map.Entry<Integer, String> entry = integer.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
