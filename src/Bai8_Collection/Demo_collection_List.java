package Bai8_Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo_collection_List {
    public static void main(String[] args) {
        List<Integer> listnumber = new ArrayList<>();
        listnumber.add(45);
        listnumber.add(67);
        listnumber.add(87);
        listnumber.add(12);
        listnumber.add(89);

        listnumber.remove(1);

        System.out.println("====Truy xuất số thứ tự không thông qua vị trí=====");
        for (int value : listnumber) {
            System.out.println(value);
        }
        System.out.println("====Truy xuất số thứ tự thông qua vị trí nhất định=====");
        System.out.println(listnumber.get(2));
    }
}
