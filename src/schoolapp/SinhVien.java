
package schoolapp;

public class SinhVien extends Nguoi {
    private String maSV;
    private String khoa;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String maSV, String khoa, String lop, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.maSV = maSV;
        this.khoa = khoa;
        this.lop = lop;
    }

    public String getMaSV() {
        return this.maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getKhoa() {
        return this.khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
