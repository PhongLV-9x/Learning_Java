package Bai11;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;

    public double getVat() {
        return vat;
    }

    public double getHocphi() {
        return hocphi;
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.getinfo();

        ThongTin tt1 = new ThongTin();
        tt1.getVat();
        tt1.getHocphi();
    }
}
