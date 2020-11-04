
package bai2;

class maHangException extends Exception{
    public String toString(){
        return "ma hang phai co 4 chu so";
    }
}

class tenException extends Exception{
    public String toString(){
        return "ten hang ko duoc de trong";
    }
}

class nhomException extends Exception{
    public String toString(){
        return "nhom phai gom hang tieu dung, hang thoi trang, dien tu- dien lanh";
    } 
}
class giaBanException extends Exception{
    public String toString(){
        return "gia ban phai lon 0";
    }
}
public class MatHang {
    private int maHang;
    private String ten;
    private String nhom;
    private double giaBan;

    public MatHang() {
    }

    public MatHang(int maHang, String ten, String nhom, double giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.nhom = nhom;
        this.giaBan = giaBan;
    }

    public void setMaHang(int maHang) throws maHangException {
        if(maHang>=1000 && maHang<=9999 )
        this.maHang = maHang;
        else throw new maHangException();
    }

    public void setTen(String ten) throws tenException {
       if(ten.matches("\\s*")) throw new tenException();
       else 
        this.ten = ten;
    }

    public void setNhom(String nhom) throws nhomException {
        if(nhom.equals("hàng tiêu dùng") || nhom.equals("hàng thời trang")
                || nhom.equals("điện tử - điện lạnh"))
        this.nhom = nhom;
        else throw new nhomException();
    }

    public void setGiaBan(double giaBan) throws giaBanException {
        if(giaBan>0)
        this.giaBan = giaBan;
        else throw new giaBanException();
    }
    
    public String toString(){
        return maHang+" "+ten+" "+nhom+" "+giaBan;
    }

    public String getTen() {
        return ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getNhom() {
        return nhom;
    }
    
}

