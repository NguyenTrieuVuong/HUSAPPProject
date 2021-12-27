package Hus;

/**
 *
 * @author LeVan
 */
public class Sinhvien {

    String lophoc;
    String gender;
    public String name;
    public String ID;
    public String email;

    public Sinhvien(String ID, String name, String email, String gender, String lophoc) {
//        super(ID, name, email);
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.lophoc = lophoc;
        this.gender = gender;
    }

    public Sinhvien() {
        
    }

    public String getLophoc() {
        return lophoc;
    }

    public void setLophoc(String lophoc) {
        this.lophoc = lophoc;
    }

    public String isGender() {
        return gender;
    }

    public String getGender() {
//        if (gender = false) {
//            return "nam";
//        } else {
//            return "nu";
//        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    @Override
    public String getName() {
        return name;
    }

//    @Override
    public void setName(String name) {
        this.name = name;
    }

//    @Override
    public String getID() {
        return ID;
    }

//    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

//    @Override
    public String getEmail() {
        return email;
    }

//    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String toSinhVien() {
        return this.getID().trim() + "," + this.getName().trim() + "," + this.getEmail().trim() + ","
                + this.getGender()+","+this.getLophoc().trim();
    }
    public Object[] toArray(){
        return new Object[]{ID,name,email,gender,lophoc};
    }
}
