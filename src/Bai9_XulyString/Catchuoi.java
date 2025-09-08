package Bai9_XulyString;

public class Catchuoi {
    public static void main(String[] args) {
        String str1 = "Hello world Earth, Test, Math, Physic, Test, Math";

        //Tìm vị trí Math đầu tiên
        int index = str1.indexOf("Math");

        //Cắt chuỗi thành 2 phần
        String p1 = str1.substring(0,index + "Math".length());
        String p2 = str1.substring(index + "Math".length() + 2); // +2 để bỏ dấu ", "

        System.out.println(p1);
        System.out.println(p2);

    }
}
