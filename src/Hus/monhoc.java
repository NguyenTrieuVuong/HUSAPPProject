package Hus;

/**
 *
 * @author LeVan
 */
public class monhoc {
    String mhp;
    String name ;
    float finalScore =-1;
    float midScore =-1;
    float testScore =-1;
    public monhoc(String mhp, String name) {
        this.mhp = mhp;
        this.name = name;
    }

    public String getMhp() {
        return mhp;
    }

    public void setMhp(String mhp) {
        this.mhp = mhp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(float finalScore) {
        this.finalScore = finalScore;
    }

    public float getMidScore() {
        return midScore;
    }

    public void setMidScore(float midScore) {
        this.midScore = midScore;
    }

    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
    } 
}
