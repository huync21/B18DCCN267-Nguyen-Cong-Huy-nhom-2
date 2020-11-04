
package bai2;

import java.util.Scanner;

class nhapSaiDangSoPhuc extends Exception{
    @Override
    public String toString(){
        return "nhập lại cho đúng dạng số phức đi";
    }
}

public class SoPhuc {
    private float a;
    private float b;

    public SoPhuc() {
        this.a=0;
        this.b=0;
    }
    
    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc cong(SoPhuc sp2){
        SoPhuc kq=new SoPhuc();
        kq.a=this.a+sp2.a;
        kq.b=this.b+sp2.b;
        return kq;
    }
    
    public SoPhuc tru(SoPhuc sp2){
        SoPhuc kq=new SoPhuc();
        kq.a=this.a-sp2.a;
        kq.b=this.b-sp2.b;
        return kq;
    }
    
    public SoPhuc nhan(SoPhuc sp2){
        SoPhuc kq=new SoPhuc();
        kq.a=(this.a)*sp2.a-(this.b)*sp2.b;
        kq.b=(this.a)*sp2.b+(sp2.a)*this.b;
        return kq;
    }    
    
    public SoPhuc chia(SoPhuc sp2){
        SoPhuc kq=new SoPhuc();
        kq.a=(this.a*sp2.a+this.b*sp2.b)/((float)(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2)));
        kq.b=(this.b*sp2.a-sp2.b*this.a)/((float)(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2)));
        return kq;
    }
    
    public SoPhuc nghichDao(){
        SoPhuc so1=new SoPhuc(1,0);
        SoPhuc thisPhuc=new SoPhuc(a,b);
        return so1.chia(so1);
    }
    
    public boolean bangNhau(SoPhuc sp2){
        return this.a== sp2.a && this.b == sp2.b;
    }
    
    public boolean lonHon(SoPhuc sp2){
        float module1=(float)Math.sqrt(Math.pow(this.a, 2)+Math.pow(this.b, 2));
        float module2=(float)Math.sqrt(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2));
        return module1>module2;
    }
    
    public boolean nhoHon(SoPhuc sp2){
        float module1=(float)Math.sqrt(Math.pow(this.a, 2)+Math.pow(this.b, 2));
        float module2=(float)Math.sqrt(Math.pow(sp2.a, 2)+Math.pow(sp2.b, 2));
        return module1<module2;
    }
    
    public void hien(){
        if(a!=0){
            if(b>0)
                System.out.println(a+" + "+"j"+b);
            if(b<0)
                System.out.println(a+" - "+"j"+b*-1);
            if(b==0)
                System.out.println(a);
        }else {
            if(b>0) System.out.println("j"+b);
            if(b<0) System.out.println("-j"+b*-1);
        }
                
            
    }
    
    public void nhap() throws nhapSaiDangSoPhuc{
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(str.matches("\\s*\\d+[.]?\\d*\\s*[+]\\s*j\\d+[.]?\\d*\\s*")){
            str=str.trim().replaceAll("\\s+","");
            this.a=Float.parseFloat(str.substring(0, str.indexOf("+")));
            this.b=Float.parseFloat(str.substring(str.indexOf("j")+1));
        }
        else throw new nhapSaiDangSoPhuc();
        
    }
}
