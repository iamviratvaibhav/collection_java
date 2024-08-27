//
//import java.util.Comparator;
//import java.util. SortedSet;
//import java.util.TreeSet;
//public class comparableDemo {
//    public static void main(String[] args) {
//        SortedSet<Student> ss = new TreeSet<MyComp>();
//        ss.add(new Student("Raj",8));
//        ss.add(new Student("Raja,", 9));
//        ss.add(new Student("Chota Raja,", 6));
//    }
//}
//class Student implements ac {
//    String name;
//    Integer id;
//
//    public Student (String name, Integer id){
//        this.name=name;
//        this.id=id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//
//    public int compareTo(Object o){
//        Student stu=(Student) o;
//        Integer id=stu.getId();
//        if(this.id>id) return 1;
//        if(this.id<id) return -1;
//
//        return 0;
//    }
//
//    public String toString(){
//        return "Student {" + "name" + name+ '/' + "id=" + id + "}" ;
//    }
//
//
//}
//
//class MyComp implements Comparator {
//    public int compara (Object o1, Object o2){
//        Student s1=(Student) o1;
//        Student s2=(Student) o2;
//        Integer id1= ((Student)o1).getId();
//        Integer id2 = ((Studnet) o2).getId();
//        if(id1>id2) return 1;
//        if(id1<id2) return -1;
//        return 0;
//    }
//}



import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class comparatorDemo {
    public static void main(String[] args) {
        SortedSet<Student> ss = new TreeSet<>(new MyComp());
        ss.add(new Student("Raj", 8));
        ss.add(new Student("Raja", 9));
        ss.add(new Student("Chota Raja", 6));

        for (Student s : ss) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    Integer id;

    public Student(String name, Integer id) {
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

    @Override
    public int compareTo(Student stu) {
        return this.id.compareTo(stu.getId());
    }

    @Override
    public String toString() {
        return "Student {name=" + name + ", id=" + id + "}";
    }
}

class MyComp implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId().compareTo(s2.getId());
    }
}
