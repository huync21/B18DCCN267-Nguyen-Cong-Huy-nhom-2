
package bai2;

import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        SinhVien s1=new SinhVien(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
        
        System.out.println("MSV: "+s1.getMaSinhVien()+"    Ten: "+s1.getTenSinhVien()+"   Lop: "+s1.lop+"   Khoa: "+s1.khoa);
        
        
    }
}
