package Hus;

/**
 *
 * @author LeVan
 */
public class Monhoc implements java.io.Serializable{
    String maMon;
    String tenMon;
    int soTinChi;

    public Monhoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public Monhoc() {
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getSoTinChi() {
        return ""+soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    public String toMonHoc(){
        return this.getMaMon()+","+this.getTenMon()+","+this.getSoTinChi();
    }
    public Object[] toArray(){
        return new Object[]{maMon,tenMon,soTinChi};
    }
}
