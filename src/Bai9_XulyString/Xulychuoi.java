package Bai9_XulyString;

public class Xulychuoi {
    public static void main(String[] args) {

        String str1 = "Hello world Earth, Test, Math, Physic, Test, Math";
        String str2 = "Manual Và Auto";


        //Cat chuoi
        System.out.println("Cắt chuỗi dạng 1: " + str1.substring(9));
        System.out.println("Cắt chuỗi dạng 2: " + str1.substring(0,20));

        //Ghép chuỗi
        System.out.println("========Ghép chuỗi===========");
        System.out.println("Ghép chuỗi: " + str1 + " " + str2);
        System.out.println("Ghép chuỗi: " + str1.concat(" " + str2));

        //tách chuỗi
        System.out.println("=============Tách chuỗi===============");
        System.out.println("Tách chuỗi: "+ str1.split("Math")[0]); //Lấy giá trị đầu tiên sau tách chuỗi
    }
}
