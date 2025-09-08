package Bai8_Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo_Collections {
    public static void main(String[] args) {
        //Set
        //Khai báo kiểu set với loại hashSet
        //Không có sắp xếp được
        Set<String> stringSet = new HashSet<>();
        stringSet.add(String.valueOf(1230));
        stringSet.add("123");
        stringSet.add("1230");//Hiểu giá trị bị trùng sau cùng

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("1230"));
        stringSet.clear();


        for (String value : stringSet) {
            System.out.println(value);
        }
        Set<String> treeSet  = new TreeSet<>();
        treeSet.add("123");
        treeSet.add("124");
        treeSet.add("ABC");
        treeSet.add("BKHGHJAG");
        treeSet.add("ABA");
        treeSet.stream().sorted().sorted();

        System.out.println("======treeSet======");
        for (String value : treeSet);
        System.out.println("value");
    }
}
