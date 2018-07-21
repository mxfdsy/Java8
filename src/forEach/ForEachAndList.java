package forEach;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小武 on 2018/7/16.
 */
public class ForEachAndList {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //lambda
        //Output : A,B,C,D,E
        items.forEach(item->System.out.println(item));
    }
}
