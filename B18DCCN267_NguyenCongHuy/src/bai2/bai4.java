
package bai2;

import java.util.Scanner;


public class bai4 {
    static boolean checkNguyenTo(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n=s.nextInt();
        int countNguyenTo=0;
        
        StackOfIntegers st=new StackOfIntegers(n);
        
        for(int i=2;i<n;i++){
            if(checkNguyenTo(i))
                st.push(i);
        }
        
        
       
        while(st.getSize()>0){
            System.out.println(st.pop());
        }
        
        
        
    }
}
