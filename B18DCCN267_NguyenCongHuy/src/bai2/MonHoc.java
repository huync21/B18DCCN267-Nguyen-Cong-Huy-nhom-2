
package bai2;


class maMonException extends Exception{
    public String toString(){
        return "ma mon phai co 4 chu ";
    }
}

class tenMonException extends Exception{
    public String toString(){
        return "ten mon ko duoc de trong ";
    }
}

class nhomMonException extends Exception{
    public String toString(){
        return "nhom mon phai gom: Cơ bản, cơ sở ngành, chuyên ngành, kỹ năng mềm. ";
    }
}

class soTinChiException extends Exception{
    public String toString(){
        return "so tin chi lon hon 0, nho hon 7 co ma ";
    }
}
public class MonHoc {
    private int maMon;
    private String tenMon;
    private String nhomMon;
    private int soTinchi;

    public MonHoc() {
    }

    public MonHoc(int maMon, String tenMon, String nhomMon, int soTinchi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhomMon = nhomMon;
        this.soTinchi = soTinchi;
    }

    public void setMaMon(int maMon) throws maMonException {
        if(maMon>=1000 && maMon<=9999)
        this.maMon = maMon;
        else throw new maMonException();
    }

    public void setTenMon(String tenMon) throws tenMonException {
        if(tenMon.matches("\\s*")) throw new tenMonException();
        else
        this.tenMon = tenMon;
    }

    public void setNhomMon(String nhomMon) throws nhomMonException {
        if(nhomMon.equalsIgnoreCase("Cơ bản") || nhomMon.equalsIgnoreCase("Cơ sở ngành")
                || nhomMon.equalsIgnoreCase("Chuyên ngành") || nhomMon.equalsIgnoreCase("Kỹ năng mềm"))
        this.nhomMon = nhomMon;
        else throw new nhomMonException();
    }

    public void setSoTinchi(int soTinchi) throws soTinChiException {
        if(soTinchi>0 && soTinchi<7)
        this.soTinchi = soTinchi;
        else throw new soTinChiException();
    }
    
    public String toString(){
        return maMon+" "+tenMon+" "+nhomMon+" "+soTinchi;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getNhomMon() {
        return nhomMon;
    }

    public int getSoTinchi() {
        return soTinchi;
    }
    
}