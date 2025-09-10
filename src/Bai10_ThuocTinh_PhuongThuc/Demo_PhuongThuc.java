package Bai10_ThuocTinh_PhuongThuc;

public class Demo_PhuongThuc {
    //Khai bao ham khong tra ve gia tri
    public void displayinfo() {
        System.out.println("Hello anh em");
        System.out.println("Dia chi cua em o: " + getAddress());
    }

    //Khai bao ham co tra ve gia tri loai String

    public String getAddress() {
        return "HAN";
    }

    public static String getName() {
        return "ABCGD";

    }

    public static float chieuDai() {
        return 13.5f;
    }

    public static int chieuRong() {
        return 10;
    }

    public static float tinhS(){
        return chieuDai() * chieuRong();
    }

    public static float tinhCV() {
        return (chieuDai() + chieuRong()) * 2;
    }

    public static void main(String[] args) {

        //Cach goi lai de su dung ham/phuong thuc
        Demo_PhuongThuc demo = new Demo_PhuongThuc();
        demo.displayinfo();//Vi ham nay khong co tu khoa static nen can thong qua doi duong class

        //Cach 2
        getName();// ham nay co tu khoa static

        System.out.println(tinhCV());
        System.out.println(tinhS());


    }
}
