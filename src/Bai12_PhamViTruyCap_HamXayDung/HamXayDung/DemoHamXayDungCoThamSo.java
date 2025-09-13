package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {
//Khai bao gia tri
    public String name;
    public int age;


    //Khai bao ham xay dung
    public DemoHamXayDungCoThamSo(String name,int age){
        System.out.println("Demo ham xay dung thoi nhe");

       //Khoi tao gia tri
       this.name = name;
       this.age = age;
    }

    public void showinfo(){
        System.out.println("Ten la " + name);
        System.out.println("Tuoi la " + age);

    }

    public static void main(String[] args) {
        DemoHamXayDungCoThamSo demoHamXayDung1 = new DemoHamXayDungCoThamSo("nam",28);
        DemoHamXayDungCoThamSo demoHamXayDung2 = new DemoHamXayDungCoThamSo("Linh",20);
        demoHamXayDung1.showinfo();
        demoHamXayDung2.showinfo();
    }
}
