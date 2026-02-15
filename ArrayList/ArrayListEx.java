package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ab");
        list.add("cd");

        for (String s : list){
            list.add("ef");
        }
    }
}
