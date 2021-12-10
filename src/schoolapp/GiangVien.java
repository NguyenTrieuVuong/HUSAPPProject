/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package schoolapp;

public class GiangVien extends Nguoi {
    private String donVi;

    public GiangVien() {

    }

    public GiangVien(String hoTen, String diaChi, String donVi) {
        super(hoTen, diaChi);
        this.donVi = donVi;
    }

    public String getDonVi() {
        return this.donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

}
