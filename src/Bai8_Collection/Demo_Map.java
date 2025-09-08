package Bai8_Collection;

import java.util.HashMap;
import java.util.Map;

public class Demo_Map {
    public static void main(String[] args) {
//Khai báo kiểu data Map
        Map<String, String> map = new HashMap<>();
//Thêm giá trị  key =value
        map.put("name", "Phonglv");
        map.put("age", "25");
        map.put("Add", "HAN");
        //Truy xuất giá trị thông qua key
        map.get(1);

        System.out.println(map.get("age"));
        //In ra giá trị
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
