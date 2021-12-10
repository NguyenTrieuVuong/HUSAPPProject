/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package schoolapp;

import java.util.ArrayList;

public class LopHoc {
    private ArrayList<KhoaHoc> lopHocPhan;

    public LopHoc() {
        lopHocPhan = new ArrayList<>();
    }

    public ArrayList<KhoaHoc> getLopHocPhan() {
        return this.lopHocPhan;
    }

    public void setLopHocPhan(ArrayList<KhoaHoc> lopHocPhan) {
        this.lopHocPhan = lopHocPhan;
    }

}
