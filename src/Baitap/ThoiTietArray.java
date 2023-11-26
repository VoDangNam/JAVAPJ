
package Baitap;

 import java.util.Scanner;
public class ThoiTietArray {
    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in) ;
        System.out.print("Nhap vao so nagy muon nhap:");
        int day = keyboard.nextInt();
        float [] arg = new float [day];
        //float[] x = new float[n];
        float tong=0;
        for(int i=0;i<
                day;i++)
        {
            System.out.print("Nhap vao do c nagy thu "+i+" : ");
            float c= keyboard.nextInt();
            arg[i]=c;
            tong+=c;
        }
        for(int i=0;i<day;i++)
        {
            System.out.println( arg[i]);
        }
        float avrg = tong/day;
        System.out.println("Trung binh niet do : "+(float) Math.round(avrg*10)/10);
    }
}
