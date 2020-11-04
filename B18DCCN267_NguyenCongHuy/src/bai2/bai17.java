
package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class bai17 {
    
    public static void main(String[] args) {
        ArrayList<Sach> list=new ArrayList<>();
        Scanner s=null;
        try {
             s=new Scanner(new File("InputOutputBai17\\SACH.INP"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
          }
        
        while(s.hasNextLine()){
            int maSach=Integer.parseInt(s.nextLine());
            String ten=s.nextLine();
            String nhom=s.nextLine();
            double gia=Double.parseDouble(s.nextLine());
            try {
                Sach sach=new Sach();
                sach.setMaSach(maSach);
                sach.setTenSach(ten);
                sach.setChuyenNganh(nhom);
                sach.setGiaBan(gia);
                
                list.add(sach);
            } catch (maSachExeption ex) {
                System.out.println(ex);
            } catch (tenSachExeption ex) {
                System.out.println(ex);
            } catch (chuyenNganhExeption ex) {
                System.out.println(ex);
            } catch (giaBanExeption ex) {
                System.out.println(ex);
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            
            
        }
        
        //2 
        System.out.println("======================");
        System.out.println("Sach hop le:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //3 
        Collections.sort(list,new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                if(o1.getGiaBan()<o2.getGiaBan()) return 1;
                else if(o1.getGiaBan()==o2.getGiaBan()) return 0;
                else return -1;
            }
            
        });
        
        try(PrintStream ps=new PrintStream(new File("InputOutputBai17\\SX.OUT"));) {
            
             for(int i=0;i<list.size();i++){
                ps.println(list.get(i));
        }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //4
        Collections.sort(list, new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
               return o1.getTenSach().compareTo(o2.getTenSach());
            }
            
        });
        
        try(PrintStream ps=new PrintStream(new File("InputOutputBai17\\CN.OUT"));) {
            
            ps.println("-------------------------------------");
            ps.println("Giáo khoa");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getChuyenNganh().equals("Giáo khoa")){
                    ps.println(list.get(i));
                }
            }
            
             ps.println("-------------------------------------");
            ps.println("Văn học");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getChuyenNganh().equals("Văn học")){
                    ps.println(list.get(i));
                }
            }
            
             ps.println("-------------------------------------");
            ps.println("Kỹ thuật");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getChuyenNganh().equals("Kỹ thuật")){
                    ps.println(list.get(i));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
       
    }
}
