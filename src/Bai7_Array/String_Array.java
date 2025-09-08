package Bai7_Array;

public class String_Array {
    public static void main(String[] args) {

        String svArray[] = new String[3];

        svArray[0] = "Linh";
        svArray[1] = "Nam";
        svArray[2] = "Truong";

        //Truy suất thủ công từng vị trí
        //System.out.println(svArray[0]);
        //System.out.println(svArray[2]);

        System.out.println("Độ dài mảng: " + svArray.length);

        //Vòng lặp for đơn giản
        //for (int a = 0; a < svArray.length; a += 1) {
            //System.out.println(svArray[a]);

         //copy mảng 1->2, mảng 2 phải có độ dài lon hon hoặc bang mang 1
        String hvArray[] = new String[5];
        for (int i = 0; i < svArray.length; i++){
            hvArray[i] = svArray[i];
        }
        //in mang copy
        for(int i = 0; i < hvArray.length; i++){
            System.out.println(hvArray[i]);
        }
    }
}