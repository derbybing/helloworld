package collector;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapTest {


    public static void main(String[] args) {

       //mapIter()
    }

    public void mapIter(){
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();

            Integer key = next.getKey();
            //Integer value = next.getValue();

            if(key == 1){
                iterator.remove();
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }
}
