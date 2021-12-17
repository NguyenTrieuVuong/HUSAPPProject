package Hus;

/**
 *
 * @author LeVan
 */
public class Admin {
    String tenDangNhap;
    String password;

    public Admin(String tenDangNhap, String password) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toAdmin(){
        return this.getTenDangNhap()+","+this.getPassword();
    }
}
