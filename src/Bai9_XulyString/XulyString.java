package Bai9_XulyString;

import java.util.Locale;

public class XulyString {
    public static void main(String[] args) {
String name = "Phong hehe";
        System.out.println("Phong hehe".toUpperCase());
        System.out.println(name.replace(" ","_"));
        //Ghép chuỗi
        String fullname = "Họ và tên: " + name;
        System.out.println(fullname);
    }
}
