
package bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;



public class bai2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao so sinh vien: ");
        int n=s.nextInt();
        s.nextLine();
        SinhVien sinhVienArray[]=new SinhVien[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Nhap lan luot ma sinh vien, ho ten, lop, khoa cua sinh vien "+i);
            sinhVienArray[i]=new SinhVien(s.nextLine(),s.nextLine(),s.nextLine(), s.nextLine());
            
        }
        
        
        
        System.out.println("a.In ra danh sach: ");
        for(int j=0;j<n;j++){
            System.out.println("MSV: "+sinhVienArray[j].getMaSinhVien()+"    Ten: "+sinhVienArray[j].getTenSinhVien()+"   Lop: "+sinhVienArray[j].lop+"   Khoa: "+sinhVienArray[j].khoa);
        }
        
        
        
        System.out.println("b.In ra danh sach theo thu tu sap xep ten: ");
        String tenSinhVien[]=new String[n];// mang ten sinh vien de ti nua lay ra sort
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(sinhVienArray[i].getTenSinhVien());
            while(st.countTokens()>1){
                st.nextToken();
            }
            tenSinhVien[i]=st.nextToken();// lay token ten rieng ra
        }
        Arrays.sort(tenSinhVien);// sort mảng các token tên riêng
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                StringTokenizer st=new StringTokenizer(sinhVienArray[j].getTenSinhVien());
                while(st.countTokens()>1){
                    st.nextToken();
                }
                String temp=st.nextToken();
                if(tenSinhVien[i].equals(temp)){
                    System.out.println("MSV: "+sinhVienArray[j].getMaSinhVien()+"    Ten: "+sinhVienArray[j].getTenSinhVien()+"   Lop: "+sinhVienArray[j].lop+"   Khoa: "+sinhVienArray[j].khoa);
                }
            }
        }
        
        
        
        System.out.println("c.In danh sach sinh vien theo lop: ");
        System.out.println("Nhap lop can in ra danh sach sinh vien: ");
        String lop=s.next();
        for(int i=0;i<n;i++){
            if(sinhVienArray[i].lop.equals(lop)){
                 System.out.println("MSV: "+sinhVienArray[i].getMaSinhVien()+"    Ten: "+sinhVienArray[i].getTenSinhVien()+"   Lop: "+sinhVienArray[i].lop+"   Khoa: "+sinhVienArray[i].khoa);
            }
        }
    }
}
