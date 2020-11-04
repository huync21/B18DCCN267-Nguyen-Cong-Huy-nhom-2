
package bai2;

import java.util.Scanner;

public class PhanSo {
    private int ts;
    private int ms;

    public PhanSo() {
        ts=0;
        ms=1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }
    
    private static int UCLN(int a,int b){
        while(a!=b){
            if(a>b)a=a-b;
            else b=b-a;
        }
        return a;
    }
    
    private static int BCNN(int a,int b){
        return a*b/UCLN(a,b);
    }
    
    static void quyDong(PhanSo p1,PhanSo p2){
        int temp=BCNN(p1.ms,p2.ms);
        p1.ts=p1.ts*(temp/p1.ms);
        p2.ts=p2.ts*(temp/p2.ms);
        p1.ms=temp;
        p2.ms=temp;
    }
    
    public void quyDong(PhanSo p){
        int temp=BCNN(ms,p.ms);
       
        ts=ts*(temp/ms);
        p.ts=p.ts*(temp/p.ms);
        ms=temp;
        p.ms=temp;
    }
    
    public PhanSo cong (PhanSo sp2){
        quyDong(sp2);
        PhanSo p=new PhanSo(ts+sp2.ts,ms);
        return p;
    }
    
    public PhanSo tru(PhanSo sp2){
        quyDong(sp2);
        PhanSo p=new PhanSo(ts-sp2.ts,ms);
        return p;
    }
    
    public PhanSo nhan(PhanSo sp2){
        PhanSo p=new PhanSo(ts*sp2.ts,ms*sp2.ms);
        return p;
    }
    
    public PhanSo chia(PhanSo sp2){
        PhanSo p=new PhanSo(ts,ms);
        return p.nhan(sp2.nghichDao());
    }
    
    public PhanSo nghichDao(){
        PhanSo p=new PhanSo(ms,ts);
        return p;
    }
    
    public PhanSo doiDau(){
        PhanSo p=new PhanSo(ts*-1,ms);
        return p;
    }
    
    public PhanSo toiGian(){
        PhanSo p=new PhanSo(ts/UCLN(ts,ms),ms/UCLN(ts,ms));
        return p;
    }
    
    public boolean bangNhau(PhanSo ps2){
        quyDong(ps2);
        return ts==ps2.ts;
    }
    
    public boolean lonHon(PhanSo ps2){
        quyDong(ps2);
        return ts>ps2.ts;
    }
    
    public boolean nhoHon(PhanSo ps2){
        quyDong(ps2);
        return ts<ps2.ts;
    }
    
    public void hien(){
        System.out.println(ts+"/"+ms);
    }
    
    public void nhap(){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Nhap phan so dang ts/ms: ");
        
        String tuSo;
        String mauSo;
        while(true){
            String n=s.next();
            if(n.matches("[0-9]*[/][0-9]*")){
                tuSo=n.substring(0,n.indexOf("/"));
                mauSo=n.substring(n.indexOf("/")+1);
                int a=Integer.parseInt(tuSo);
                int b=Integer.parseInt(mauSo);
                if(b!=0){ ts=a; ms=b; break;}
                else System.out.println("Nhap lai mau so khac 0");
            }else System.out.println("Nhap lai cho dung dang ts/ms");
        }
    }
}
