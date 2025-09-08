package Bai3_bienJava;

public class Sinhvien {
   public static String Ho = "Le";
   public String Dem;
   public Sinhvien (String Dem ){
       this.Dem = Dem;
   }

    public void showStudent() {
        System.out.println("Đệm: " + Dem);
    }
    public static void main(String[] args) {
        String Ten = "Phong";
        Sinhvien sv = new Sinhvien("Van");
        System.out.println("Họ: " + Ho);
        sv.showStudent();
        System.out.println("Tên: " + Ten);
        System.out.println("Tuổi: " + Thongtin.Tuoi);
    }
}
