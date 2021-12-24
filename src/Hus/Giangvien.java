package Hus;

/**
 *
 * @author LeVan
 */
public class Giangvien extends Huser implements java.io.Serializable {

    String gender;

    public Giangvien(String ID, String name, String email, String gender) {
        super(ID, name, email);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public String toGiangVien() {
        return this.getID().trim() + "," + this.getName().trim() + "," + this.getEmail().trim() + ","
                + "," + this.getGender().trim();
    }

    public Object[] toArray() {
        return new Object[]{ID, name, email, gender};
    }
}
