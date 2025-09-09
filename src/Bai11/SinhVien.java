package Bai11;

public class SinhVien {
    String name;
    int age;
    String address;
    String phone;

    public String getinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
        return getinfo();
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        //Khai bao doi tuong thuoc lop student
        SinhVien sv1 = new SinhVien();
        sv1.getinfo();
        sv1.getName();

        //Cach khai bao Annonymous
        new SinhVien().getinfo();
        new SinhVien().getName();
        new SinhVien(); //Khởi tạo giá trị cho class Student (nếu có hàm xây dựng)
    }
}
