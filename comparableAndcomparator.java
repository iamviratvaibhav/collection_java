import java.util.SortedSet;
import java.util.TreeSet;
class Studnet{
    String name;
    Integer id;

    public Studnet(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

public class comparableAndcomparator {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(60);
        sortedSet.add(50);
    //There here natural sorting occur ,and tree set  used comparable -> compareTo
        System.out.println(sortedSet);
    }
}