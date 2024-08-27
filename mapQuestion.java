import java.util.HashMap;

public class mapQuestion {
    public static void main(String[] args) {
        int arr[]={10,20, 30, 20, 40};
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }
}
