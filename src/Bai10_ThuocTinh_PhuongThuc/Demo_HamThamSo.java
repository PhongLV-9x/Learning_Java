package Bai10_ThuocTinh_PhuongThuc;

public class Demo_HamThamSo {
    //Khai bao ham co 2 tham so voi kieu du lieu tuong ung
    public static int tong2songuyen(int num1, int num2) {
        return num1 + num2;
    }

    public static void showinfo(String name, int age, String add) {
        System.out.println("Ho va Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + add);

    }

    public static float TinhS(float cr, float cd){
        return cr * cd;
    }

    public static void main(String[] args) {
//        System.out.println("Tong 2 so nguyen la: " + tong2songuyen(100, 200));

//        showinfo("Anh", 16, "HAN");
//        showinfo("Ngoc", 16, "HUI");
//        showinfo("Tran", 16, "DAD ");
        System.out.println("Dien tich HCN la: " + TinhS(9,10.44f) + "cm");
    }
}

