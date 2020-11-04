    
package bai2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;




public class bai15 {
    public static void main(String[] args) {
     
        //1
        ArrayList<SinhVienPTIT> list =new ArrayList<>();
        try (Scanner s=new Scanner(new File("InputOutputbai15\\SV.INP"));){
            while(s.hasNextLine()){
                int maSv=0;
                try{// doc vao ma sv
                    maSv=Integer.parseInt(s.nextLine());
                }
                catch(NumberFormatException e)
                {
                    System.out.println(e);
                }
                String ten=s.nextLine();
                String lop=s.nextLine();
                
                
                double dtb=0;
                try{// doc vao diem tb
                dtb=Double.parseDouble(s.nextLine());
                }
                catch(NumberFormatException e){
                    System.out.println(e);
                }
                
                // try catch de add sv vao array list
                try{
                    SinhVienPTIT sv=new SinhVienPTIT();
                    sv.setMaSV(maSv);
                    sv.setTen(ten);
                    sv.setLop(lop);
                    sv.setDtb(dtb);
                    list.add(sv);
                } catch (maSVException ex) {
                    System.out.println(ex);
                } catch (tenException ex) {
                    System.out.println(ex);
                } catch (lopException ex) {
                    System.out.println(ex);
                } catch (dtbException ex) {
                    System.out.println(ex);
                }
                
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //2
        System.out.println("=========================================");
        System.out.println("Danh sach cac sinh vien hop le: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //3
        Collections.sort(list, new Comparator<SinhVienPTIT>(){
            @Override
            public int compare(SinhVienPTIT o1, SinhVienPTIT o2) {
               if(o1.getDtb()< o2.getDtb()) return 1;
               else if(o1.getDtb() == o2.getDtb()) return 0;
               else return -1;
            }
            
        });
        
        try(PrintStream ps=new PrintStream(new File("InputOutputbai15\\SX.OUT"));) {
            
            for(int i=0;i<list.size();i++){
                ps.println(list.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //4 
        Collections.sort(list, new Comparator<SinhVienPTIT>(){
            @Override
            public int compare(SinhVienPTIT o1, SinhVienPTIT o2) {
                StringTokenizer st=new StringTokenizer(o1.getTen());
                StringTokenizer st1=new StringTokenizer(o2.getTen());
                String ten1=null;
                String ten2=null;
                while(st.hasMoreTokens()){
                    ten1=st.nextToken();
                }
                while(st1.hasMoreTokens()){
                    ten2=st1.nextToken();
                }
                
                return (ten1.compareTo(ten2));
            }
        
        });
        
        try(PrintStream ps =new PrintStream(new File("InputOutputbai15\\XEPLOAI.OUT"));) {
            
            ps.println("GIOI: ");
            for(int i=0;i<list.size();i++){
                double diem=list.get(i).getDtb();
                if(diem>8) ps.println(list.get(i)); 
            }
            
            ps.println("Kha: ");
            for(int i=0;i<list.size();i++){
                double diem=list.get(i).getDtb();
                if(diem>=7 && diem<=8) ps.println(list.get(i)); 
            }
            
           ps.println("trung binh: ");
            for(int i=0;i<list.size();i++){
                double diem=list.get(i).getDtb();
                if(diem>=5 && diem<7) ps.println(list.get(i)); 
            }
            
            ps.println("Yeu: ");
            for(int i=0;i<list.size();i++){
                double diem=list.get(i).getDtb();
                if(diem<5) ps.println(list.get(i)); 
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        
    }
}
