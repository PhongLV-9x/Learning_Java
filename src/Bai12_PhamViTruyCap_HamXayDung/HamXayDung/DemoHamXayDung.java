package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

import java.sql.SQLOutput;

public class DemoHamXayDung {
//Khai bao gia tri
    public String name;
    public int age;


    //Khai bao ham xay dung
    public DemoHamXayDung(){
        System.out.println("Demo ham xay dung thoi nhe");

        //Khoi tao gia tri
        name = "Java for test";
        age = 18;
    }

    public void showinfo(){
        System.out.println("Ten la" + name);
        System.out.println("Tuoi la" + age);

    }

    public static void main(String[] args) {
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        demoHamXayDung.showinfo();
    }
}
