package Bai11;

public class SinhVien {
    String name;
    int age;
    String address;
    String phone;

    public void getinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
        return;
    }

    public void getName(){
        return;
    }

    public static void main(String[] args) {
        //Khai bao doi tuong thuoc lop student
        SinhVien sv1 = new SinhVien();
        sv1.getinfo();
        sv1.getName();
        System.out.println(sv1);

//        //Cach khai bao Annonymous
//        new SinhVien().getinfo();
//        new SinhVien().getName();
//        new SinhVien(); //Khởi tạo giá trị cho class Student (nếu có hàm xây dựng)
    }
}
