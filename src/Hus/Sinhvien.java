package Hus;

/**
 *
 * @author LeVan
 */
public class Sinhvien extends Huser implements java.io.Serializable {

    String lophoc;
    boolean gender;

    public Sinhvien(String ID, String name, String email, boolean gender, String lophoc) {
        super(ID, name, email);
        this.lophoc = lophoc;
        this.gender = gender;
    }

    public String getLophoc() {
        return lophoc;
    }

    public void setLophoc(String lophoc) {
        this.lophoc = lophoc;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGender() {
        if (gender = true) {
            return "nam";
        } else {
            return "nu";
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
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

    public String toSinhVien() {
        return this.getID().trim() + "," + this.getName().trim() + "," + this.getEmail().trim() + ","
                + this.getGender()+","+this.getLophoc();
    }
}
