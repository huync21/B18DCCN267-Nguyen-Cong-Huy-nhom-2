
package bai2;

import java.util.Scanner;


public class bai12 {
    public static void main(String[] args) {
        System.out.println("Menu: ");
        System.out.println("1. Tính tổng và hiệu hai ma trận");
        System.out.println("2. Tính tích hai ma trận");
        System.out.println("3. Tìm chuyển vị của một ma trận");
        System.out.println("4. Kết thúc chương trình");
        
        
        Scanner s=new Scanner(System.in);
        
       int n;
        while(true){
            System.out.println("");
            System.out.println("----------------------------");
          
            System.out.println("chon muc: ");
            n=s.nextInt();
            switch(n){
                case 1: 
                    System.out.println("nhap so hang so cot ma tran 1: ");
                    Matrix m1=new Matrix(s.nextInt(),s.nextInt());
                    System.out.println("Nhap lan luot cac phan tu cua ma tran:");
                    m1.input();
                    System.out.println("nhap so hang so cot ma tran 2: ");
                    Matrix m2=new Matrix(s.nextInt(),s.nextInt());
                    System.out.println("Nhap lan luot cac phan tu cua ma tran:");
                    m2.input();
                    System.out.println("Tong hai ma tran: ");
                    m1.add(m2).print();
                    System.out.println("Hieu hai ma tran: ");
                    m1.sub(m2).print();
                    break;
                    
                case 2:
                    System.out.println("nhap so hang so cot ma tran 1: ");
                    Matrix x1=new Matrix(s.nextInt(),s.nextInt());
                    System.out.println("Nhap lan luot cac phan tu cua ma tran:");
                    x1.input();
                    System.out.println("nhap so hang so cot ma tran 2: ");
                    Matrix x2=new Matrix(s.nextInt(),s.nextInt());
                    System.out.println("Nhap lan luot cac phan tu cua ma tran:");
                    x2.input();
                    System.out.println("Tích 2 ma tran: ");
                    x1.mul(x2).print();
                    break;
                
                case 3:
                    System.out.println("nhap so hang so cot ma tran 1: ");
                    Matrix z1=new Matrix(s.nextInt(),s.nextInt());
                    System.out.println("Nhap lan luot cac phan tu cua ma tran:");
                    z1.input();
                    
                    System.out.println("Ma tran chuyen vi: ");
                    z1.neg().print(); 
                    break;
                
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);
                    break;
                    
            }
        }
    }
}