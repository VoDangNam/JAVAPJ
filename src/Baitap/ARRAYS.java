
package Baitap;


public class ARRAYS {
    
    
    public static void main(String[] args) {
        int [] numbers= new int [10];// 10 phan tu kieu int (kieu1)
        int [] abc ={1,2,3,4,5};//kieu 2 gan luon gia tri
        System.out.println(abc[0]);//in gia tri chi dich danh
        /*for(int i=0;i<=4;i++)
        {
            System.out.println("x ["+i+"] = "+abc[i]);
        }
       */
      //for each
      
     /* for(int i:abc)
      {
          System.out.println("x ["+i+"] = "+abc[i]);
      }*/
     for(int i=0;i<abc.length;i++)//han che viec tran mang
     {
          System.out.println("x ["+i+"] = "+abc[i]);
     }
      
      
    }
}

