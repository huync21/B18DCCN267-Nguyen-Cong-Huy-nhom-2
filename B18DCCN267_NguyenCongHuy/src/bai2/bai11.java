
package bai2;

import java.util.Scanner;

class TamGiac{
    double a;
    double b;
    double c;
    private double A=Math.pow(a, 2);
    private double B=Math.pow(b, 2);
    private double C=Math.pow(c, 2);
    
    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean checkTamGiac(){
        return a+b>c;
    }
    
    public boolean checkTamGiacVuong(){
        return ((A==B+C) || (B==A+C) || (C==A+B));
    }
    
    public boolean checkTamGiacCan(){
        return (a==b || b==c || a==b);
    }
    
    public boolean checkTamGiacVuongCan(){
        return(checkTamGiacCan() && checkTamGiacVuong());
        
    }
    
    public boolean checkTamGiacDeu(){
        return (a==b && a==c && b==c);
    }
}

public class bai11 {
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao lan luot toa do 3 diem: ");
        System.out.println("diem thu nhat: ");
        MyPoint m1=new MyPoint(s.nextDouble(),s.nextDouble());
        System.out.println("diem thu hai: ");
        MyPoint m2=new MyPoint(s.nextDouble(),s.nextDouble());
        System.out.println("diem thu ba: ");
        MyPoint m3=new MyPoint(s.nextDouble(),s.nextDouble());
    
        TamGiac t=new TamGiac(m1.distance(m2), m2.distance(m3), m3.distance(m1));
        
        System.out.println("Tam giac ? "+t.checkTamGiac());
        if(t.checkTamGiac()){
            System.out.println("Tam giac vuong ? "+t.checkTamGiacVuong());
            System.out.println("Tam giac can ? "+t.checkTamGiacCan());
            System.out.println("Tam giac vuong can ? "+t.checkTamGiacVuongCan());
            System.out.println("Tam giac deu ? "+t.checkTamGiacDeu());
        }
        
    }
    
}
