
package bai2;


public class SinhVien {
    private String maSinhVien; // chi get ko the set nen dat private
    private String tenSinhVien;// chi get ko the set nen dat private
    public String lop; // de public vi ta can ca get va set, nhung ko can viet get set, ma truy cap thang bang property luon
    public String khoa;
    

    public String getMaSinhVien() {// chi get ko set
        return maSinhVien;
    }

    public String getTenSinhVien() {// chi get ko set
        return tenSinhVien;
    }
    
    
    public SinhVien(String maSinhVien, String tenSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
    }
    
    
    
    public SinhVien(String maSinhVien, String tenSinhVien, String lop, String khoa) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
        this.khoa = khoa;
    }
    
    
}
