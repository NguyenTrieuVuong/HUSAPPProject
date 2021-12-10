/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package schoolapp;

public class Admin extends Nguoi {
    private String chucVu;

    public Admin() {

    }

    public Admin(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getChucVu() {
        return this.chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

}
