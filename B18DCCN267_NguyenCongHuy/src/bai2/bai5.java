
package bai2;

import java.util.Scanner;


public class bai5 {
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n=s.nextInt();
        StackOfIntegers st=new StackOfIntegers(n);
        st.displayThuaSoNguyenToNguoc(n, st);
    }
}
