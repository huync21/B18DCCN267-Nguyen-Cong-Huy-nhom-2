
package bai2;


class maSachExeption extends Exception{
    public String toString(){
        return "loi: ma sach phai co 4 chu so";
    }
}

class tenSachExeption extends Exception{
    public String toString(){
        return "Tên sách, không được để trống";
    }
}


class chuyenNganhExeption extends Exception{
    public String toString(){
        return "Chuyên ngành phải gồm: Giáo khoa, Văn học, Kỹ thuật,  ….";
    }
}
class giaBanExeption extends Exception{
    public String toString(){
        return "Gia ban phai lon hon 0";
    }
}
public class Sach {
    private int maSach;
    private String tenSach;
    private String chuyenNganh;
    private double giaBan;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String chuyenNganh, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.chuyenNganh = chuyenNganh;
        this.giaBan = giaBan;
    }

    public void setMaSach(int maSach) throws maSachExeption {
        if(maSach>=1000 && maSach<=9999)
        this.maSach = maSach;
        else throw new maSachExeption();
    }

    public void setTenSach(String tenSach) throws tenSachExeption {
        if(tenSach.matches("\\s*"))
        throw new tenSachExeption();
        else 
        this.tenSach = tenSach;
        
        
    }

    public Sach(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) throws chuyenNganhExeption {
        if(chuyenNganh.equals("Giáo khoa") || chuyenNganh.equals("Văn học")
                || chuyenNganh.equals("Kỹ thuật") )
        this.chuyenNganh = chuyenNganh;
        else throw new chuyenNganhExeption();
    }

    public void setGiaBan(double giaBan) throws giaBanExeption {
        if(giaBan>0)
        this.giaBan = giaBan;
        else throw new giaBanExeption();
        
    }

    @Override
    public String toString() {
        return maSach+" "+tenSach+" "+chuyenNganh+" "+giaBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }
    
    
    
    
}