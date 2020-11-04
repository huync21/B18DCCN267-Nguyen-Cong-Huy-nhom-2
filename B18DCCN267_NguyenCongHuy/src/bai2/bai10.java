
package bai2;

import java.util.Scanner;


public class bai10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhập số đối tượng điểm MyPoint: ");
        int n=s.nextInt();
        MyPoint m[]=new MyPoint[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập tọa độ của đối tượng điểm thứ "+(i+1));
            m[i]=new MyPoint(s.nextDouble(), s.nextDouble());
        }
        
        double max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               double h=MyPoint.distance(m[i],m[j]);
               if(h>max){
                   max=h;
               }
            }
        }
        
        
        System.out.println("Tọa độ 2 điểm mà khoảng cách là max :");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               double h=MyPoint.distance(m[i],m[j]);
               if(h==max){
                   System.out.println("tọa độ điểm đầu: x1="+m[i].getX()+", y1="+m[i].getY());
                   System.out.println("tọa độ điểm cuối: x2="+m[j].getX()+", y2="+m[j].getY());
                   break;
               }
               
            }
        }
        System.out.println("Khoảng cách max là "+max);
    }
}
