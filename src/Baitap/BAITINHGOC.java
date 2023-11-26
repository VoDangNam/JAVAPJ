package Baitap;
  import java.util.Scanner;
public class BAITINHGOC {
     public static  int hamGoc(float x,float y)
     {
         if(x>=0&&y>=0)
         {
             return 1;
         }
         else if(x<0&&y>=0)
         {
             return 2;
         }
         else if(x<0&&y<0)
         {
             return 3;
         }
         else if(x>=0&&y<0)
         {
             return 4;
         }
         return 0;
     }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Nhap vao x");
        float x= keyboard.nextFloat();
        System.out.println("Nhap vao y");
        float y= keyboard.nextFloat();
        System.out.println("Ket qua la : "+ hamGoc(x,y));
    }
}
