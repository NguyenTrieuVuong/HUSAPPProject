
package Hus;

public class Bangdiem {
    int stt;
    float diemThuongXuyen,diemGiuaKy,diemCuoiKy,diemTBC;
    String diemTuongUng,ID,hocPhan;

    public Bangdiem(int stt, String ID, String hocPhan, float diemThuongXuyen, float diemGiuaKy, float diemCuoiKy, float diemTBC, String diemTuongUng) {
        this.diemThuongXuyen = diemThuongXuyen;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.diemTBC = diemTBC;
        this.diemTuongUng = diemTuongUng;
        this.ID = ID;
        this.hocPhan = hocPhan;
        this.stt = stt;
    }
    public Bangdiem(String ID, String hocPhan, float diemThuongXuyen, float diemGiuaKy, float diemCuoiKy, float diemTBC, String diemTuongUng) {
        this.diemThuongXuyen = diemThuongXuyen;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.diemTBC = diemTBC;
        this.diemTuongUng = diemTuongUng;
        this.ID = ID;
        this.hocPhan = hocPhan;
    }
//    public Bangdiem(String ID, String hocPhan, float diemThuongXuyen, float diemGiuaKy, float diemCuoiKy){
//        this.diemThuongXuyen = diemThuongXuyen;
//        this.diemGiuaKy = diemGiuaKy;
//        this.diemCuoiKy = diemCuoiKy;
//        this.ID = ID;
//        this.hocPhan = hocPhan;
//    }

    public Bangdiem() {}

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
    public float getDiemThuongXuyen() {
        return diemThuongXuyen;
    }
    
    public String getDTX(){
        return ""+diemThuongXuyen;
    }

    public void setDiemThuongXuyen(float diemThuongXuyen) {
        this.diemThuongXuyen = diemThuongXuyen;
    }

    public float getDiemGiuaKy() {
        return diemGiuaKy;
    }
    public String getDGK(){
        return ""+diemGiuaKy;
    }

    public void setDiemGiuaKy(float diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }
    public String getDCK(){
        return ""+diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }

    public float getDiemTBC() {
        return diemTBC;
    }
    public String getDiemTBCtoString() {
        return ""+diemTBC;
    }

    public void setDiemTBC(float diemTBC) {
        this.diemTBC = diemTBC;
    }

    public String getDiemTuongUng() {
        return diemTuongUng;
    }

    public void setDiemTuongUng(String diemTuongUng) {
        this.diemTuongUng = diemTuongUng;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(String hocPhan) {
        this.hocPhan = hocPhan;
    }
    public String toBangDiem(){
        return getID().trim()+","+getHocPhan().trim()+","+getDiemThuongXuyen()+","
                +getDiemGiuaKy()+","+getDiemCuoiKy()+","+getDiemTBC()+","+getDiemTuongUng();
    }
    public Object[] toArray(){
        return new Object[]{ID,hocPhan,diemThuongXuyen,diemGiuaKy,diemCuoiKy,diemTBC,diemTuongUng};
    }
}
