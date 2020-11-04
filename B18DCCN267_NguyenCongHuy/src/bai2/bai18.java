
package bai2;

import bai2.MonHoc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class bai18 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        ArrayList<MonHoc> list=new ArrayList<>();
        Scanner s=null;
        try {
             s=new Scanner(new File("InputOutputBai18\\MH.INP"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        while(s.hasNextLine()){
            int maMon=Integer.parseInt(s.nextLine());
            String ten=s.nextLine();
            String nhom=s.nextLine();
            int soTinChi=Integer.parseInt(s.nextLine());
            try {
                MonHoc m=new MonHoc();
                
                m.setMaMon(maMon);
                m.setTenMon(ten);
                m.setNhomMon(nhom);
                m.setSoTinchi(soTinChi);
                list.add(m);
            } catch (maMonException ex) {
                System.out.println(ex);
            } catch (tenMonException ex) {
                System.out.println(ex);
            } catch (nhomMonException ex) {
                System.out.println(ex);
            } catch (soTinChiException ex) {
                System.out.println(ex);
            }
            catch(Exception e){
                
            }
        }
        
        //2
        System.out.println("============================");
        System.out.println("mon hoc hop le: ");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //3
        Collections.sort(list, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1,MonHoc o2) {
               if(o1.getSoTinchi()<o2.getSoTinchi()) return 1;
               else if(o1.getSoTinchi()==o2.getSoTinchi()) return 0;
               else return -1;
            }
            
        });
        
        try (PrintStream ps=new PrintStream(new File("InputOutputBai18\\SX.OUT"));){
            
            for(int i=0;i<list.size();i++){
            ps.println(list.get(i));
        }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        //4
        Collections.sort(list, new Comparator<>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
               return o1.getTenMon().compareTo(o2.getTenMon());
               
            }
            
        });
        
        try (PrintStream ps=new PrintStream(new File("InputOutputBai18\\NHOM.OUT"));){
            
            ps.println("----------------------------------");
            ps.println("Co ban:");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhomMon().equalsIgnoreCase("Cơ bản"))
                ps.println(list.get(i));
            }
            
             ps.println("----------------------------------");
            ps.println("CO so nganh:");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhomMon().equalsIgnoreCase("cơ sở ngành"))
                ps.println(list.get(i));
            }
             ps.println("----------------------------------");
            ps.println("Chuyen nganh:");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhomMon().equalsIgnoreCase("chuyên ngành"))
                ps.println(list.get(i));
            }
             ps.println("----------------------------------");
            ps.println("Ky nang mem:");
            for(int i=0;i<list.size();i++){
                if(list.get(i).getNhomMon().equalsIgnoreCase("kỹ năng mềm"))
                ps.println(list.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}
