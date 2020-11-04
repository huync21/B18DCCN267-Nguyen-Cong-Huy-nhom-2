
package bai2;

import java.util.Scanner;


public class bai13 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        PhanSo p1=new PhanSo();
        p1.nhap();
        PhanSo p2=new PhanSo();
        p2.nhap();
        
        PhanSo.quyDong(p1, p2);
        
        System.out.print("Tong: "); p1.cong(p2).hien();
        System.out.print("Hieu: "); p1.tru(p2).hien();
        System.out.print("Tich: "); p1.nhan(p2).toiGian().hien();
        System.out.print("Thuong: ");p1.chia(p2).toiGian().hien();
        System.out.print("Toi gian phan so 1: ");p1.toiGian().hien();
        System.out.print("Toi gian phan so 2: ");p2.toiGian().hien();
        System.out.print("so sanh: ");
        if(p1.lonHon(p2)) System.out.println("Phan so 1 lon hon phan so 2");
        else if(p2.lonHon(p1)) System.out.println("Phan so 1 nho hon phan so 2");
        else System.out.println("2 phan so bang nhau");
    }
}
