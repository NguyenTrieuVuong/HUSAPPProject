package Hus;

/**
 *
 * @author LeVan
 */
public class Lophoc extends Monhoc implements java.io.Serializable {

    String chiSoLopHoc;
    String phongHoc;
    String maLopHoc;

    public Lophoc(String maMon, String tenMon, int soTinChi, String chiSoLopHoc, String maLopHoc, String phongHoc) {
        super(maMon, tenMon, soTinChi);
        this.chiSoLopHoc = chiSoLopHoc;
        this.phongHoc = phongHoc;
        this.maLopHoc = maLopHoc;
    }

    public String getChiSoLopHoc() {
        return chiSoLopHoc;
    }

    public void setChiSoLopHoc(String chiSoLopHoc) {
        this.chiSoLopHoc = chiSoLopHoc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getMaLopHoc() {
        return maMon + " " + chiSoLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String getMaMon() {
        return maMon;
    }

    @Override
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    @Override
    public String getTenMon() {
        return tenMon;
    }

    @Override
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

//    @Override
//    public int getSoTinChi() {
//        return soTinChi;
//    }

    @Override
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String toLopHoc() {
        return maMon + "," + tenMon + "," + soTinChi + "," + maLopHoc + "," + phongHoc;
    }
}
