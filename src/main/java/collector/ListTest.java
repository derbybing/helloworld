package collector;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        listJoinTest();
    }

    public static void listJoinTest(){

        Joiner joiner = Joiner.on(' ').skipNulls();

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("life");

        String join = joiner.join(list);

        System.out.println(join);

    }
}
