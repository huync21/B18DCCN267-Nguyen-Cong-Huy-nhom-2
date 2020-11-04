
package bai2;


public class bai14 {
    public static void main(String[] args)  {
        try{
            SoPhuc soPhuc1=new SoPhuc();
            SoPhuc soPhuc2=new SoPhuc();
            System.out.println("Nhập số phức 1: ");
            soPhuc1.nhap();
            System.out.println("Nhập số phức 2: ");
            soPhuc2.nhap();
            System.out.println("Số phức 1:");
            soPhuc1.hien();
            System.out.println("Số phức 2: ");
            soPhuc2.hien();
            System.out.println("tổng: ");
            soPhuc1.cong(soPhuc2).hien();
            System.out.println("hiệu: ");
            soPhuc1.tru(soPhuc2).hien();
            System.out.println("tích: ");
            soPhuc1.nhan(soPhuc2).hien();
            System.out.println("thương: ");
            soPhuc1.chia(soPhuc2).hien();
            System.out.println("Nghịch đảo số phức 1: ");
            soPhuc1.nghichDao().hien();
            System.out.println("Nghịch đảo số phức 2: ");
            soPhuc2.nghichDao().hien();
            if(soPhuc1.lonHon(soPhuc2)) System.out.println("Số phức 1 lớn hơn số phức 2");
            else if(soPhuc1.nhoHon(soPhuc2)) System.out.println("số phức 1 nhỏ hơn số phức 2");
            else System.out.println("2 số phức bằng nhau");;
        }
        catch(nhapSaiDangSoPhuc e){
            System.out.println(e);
        }
        
        
    }
}
