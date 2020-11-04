
package bai2;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bai16 {
    public static void main(String[] args) {
       //1
        ArrayList<MatHang> list=new ArrayList<>();
        Scanner s=null;
        try {
            s=new Scanner(new File("InputOutputBai16\\MH.INP"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        while(s.hasNextLine()){
            
            int maHang=0;
            try{
            maHang=Integer.parseInt(s.nextLine());
            }
            catch(NumberFormatException e)
            {
                System.out.println("ma hang phai la so");
            }
                
            String ten=s.nextLine();
            String nhom=s.nextLine();
            double gia=0;
            try{
            gia=Double.parseDouble(s.nextLine());
            }
            catch(NumberFormatException e)
            {
                  System.out.println("gia phai la so thuc");
            }
            
            
            try {
                    MatHang mh=new MatHang();
                    mh.setMaHang(maHang);
                    mh.setTen(ten);
                    mh.setNhom(nhom);
                    mh.setGiaBan(gia);
                    list.add(mh);
                } catch (maHangException ex) {
                    System.out.println(ex);
                } catch (tenException ex) {
                    System.out.println(ex);
                } catch (nhomException ex) {
                    System.out.println(ex);
                }   catch (giaBanException ex) {
                    System.out.println(ex);
                }
                    catch(Exception ex){
                    System.out.println(ex);
                }
            }
            
            
            
        
        //2 
        System.out.println("============================");
        System.out.println("mat hang hop le:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //3
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getGiaBan()<o2.getGiaBan()) return 1;
                else if(o1.getGiaBan()== o2.getGiaBan()) return 0;
                else return -1;
            }
            
        });
        
        try {
            PrintStream ps=new PrintStream(new File("InputOutputBai16\\SX.OUT"));
            for(int i=0;i<list.size();i++){
            ps.println(list.get(i));
        }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //4 
        Collections.sort(list, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
            
        });
        
        try {
            PrintStream ps=new PrintStream(new File("InputOutputBai16\\NHOM.OUT"));
            ps.println("NHOM HANG TIEU DUNG: ");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhom().equals("hàng tiêu dùng")){
                    ps.println(list.get(i));
                }
            }
            
            ps.println("------------------------------");
            ps.println("NHOM HANG THOI TRANG: ");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhom().equals("hàng thời trang")){
                    ps.println(list.get(i));
                }
            }
            
            ps.println("------------------------------");
            ps.println("NHOM HANG DIEN TU - DIEN LANH: ");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhom().equals("điện tử - điện lạnh")){
                    ps.println(list.get(i));
                }
            }
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}
