package Bai6_Vong_Lap;

import java.lang.reflect.Array;

public class VongLapFOR_CaiTien {
    public static void main(String[] args) {

        int number[] = {5, 7, 20, 10, 9};
        String name[] = {"Phong", "Kiên", "Nam", "Trung"};

        for (int i : number){
            if(i == 10) {
                System.out.println("Tồn tại i là 10");
            } else {
                System.out.println("Không tồn tại số 30");
            }

        }
        for (String ten : name){
            if (ten.equals("Nam")){
                System.out.println("Nam is here");
            }
        }
    }
}
