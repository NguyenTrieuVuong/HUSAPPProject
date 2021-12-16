package Hus;

import java.util.ArrayList;

/**
 *
 * @author LeVan
 */
public class sinhvien extends huser{
    public sinhvien(String name, String email) {
        super(name, email);
    }
    ArrayList<monhoc> monhoc;
    public void dkmonhoc(monhoc monhoc){
        this.monhoc.add(monhoc);
    }
    public String xemdiem(){
        String Score = null;
        for (monhoc object : monhoc) {
            if (object.getTestScore() == -1) {
                Score = " chuyen can :null ,giua ki :null, cuoi ki null";
            }
        }
        return Score;
    }
}
