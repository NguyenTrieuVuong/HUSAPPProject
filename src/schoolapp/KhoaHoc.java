/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package schoolapp;

public class KhoaHoc {
    private String tenHocPhan;
    private String maHocPhan;
    private int tinChi;

    public KhoaHoc() {

    }

    public KhoaHoc(String tenHocPhan, String maHP, int tinChi) {
        this.tenHocPhan = tenHocPhan;
        this.maHocPhan = maHP;
        this.tinChi = tinChi;
    }

    public String getTenHocPhan() {
        return this.tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public String getMaHocPhan() {
        return this.maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public int getTinChi() {
        return this.tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

}
