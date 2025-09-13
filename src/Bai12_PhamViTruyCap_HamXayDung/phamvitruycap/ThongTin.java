package Bai12_PhamViTruyCap_HamXayDung.phamvitruycap;

import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.Student;

//Tu khoa extends dai dien cho ke thua class
public class ThongTin extends Student {
    public static void main(String[] args){
        DemoPrivate demoPrivate = new DemoPrivate();
        System.out.println(demoPrivate.getName());
        demoPrivate.tinhlaisuat();


        DemoDefault demoDefault = new DemoDefault();
        System.out.println(demoDefault.age);


        DemoProtected demoProtected = new DemoProtected();
        demoProtected.getAddress();


        ThongTin thongTin = new ThongTin();
        thongTin.getphone();//Goi dc pham vi protected khi ke thua, neu bo ke thua se ko goi dc ham getphone()


        Student student = new Student();
        student.getage();


    }
}

