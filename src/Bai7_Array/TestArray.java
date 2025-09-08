package Bai7_Array;

public class TestArray {
    public static void main(String[] args) {
        int number[] =  new int [10];
        //Gan gia tri qua vong lap
        for(int i = 0; i < number.length; i++) {
            number[i] = i+1;
        }
        number[6] = 200;
        //duyet bang for cai tien
        for(int temp :number) {
            System.out.println(temp);
        }
        String emailList[] = new String[4];
        emailList[0] = "hehe@aits.vn";

        //Khai baso vaf gasn gias trij cho marng truc tiep (nac danh)
        String emailList2 [] = {"haha","ahah","ajaj","ajaja","asd"};

        System.out.println(emailList2[2]);
    }
}
