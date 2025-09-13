package Bai12_PhamViTruyCap_HamXayDung.phamvitruycap;

public class DemoPrivate {

    private String name = "Phonglv";

    private static void showinfo(){
        System.out.println("hello");
    }
    public String getName(){
        return name;
    }
    private int VAT = 10;
    private int tongtien = 1000000;

    public int tinhlaisuat(){
        return ((tongtien * VAT)/100)*6;
    }
}
