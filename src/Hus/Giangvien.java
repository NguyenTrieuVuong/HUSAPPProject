package Hus;

/**
 *
 * @author LeVan
 */
public class Giangvien extends Huser implements java.io.Serializable {

    String lophoc;

    public Giangvien(String ID, String name, String email, String lophoc) {
        super(ID, name, email);
        this.lophoc = lophoc;
    }

    public String getLophoc() {
        return lophoc;
    }

    public void setLophoc(String lophoc) {
        this.lophoc = lophoc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String toGiangVien() {
        return this.getID().trim() + "," + this.getName().trim() + "," + this.getEmail().trim() + ","
                + "," + this.getLophoc().trim();
    }
}
