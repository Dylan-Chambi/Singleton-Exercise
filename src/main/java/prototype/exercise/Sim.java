package prototype.exercise;

public class Sim {
    private String ISPName;
    private String phoneNumber;

    public Sim() {

    }

    public String getISPName() {
        return ISPName;
    }

    public void setISPName(String ISPName) {
        this.ISPName = ISPName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return  "Sim {" +
                " ISPName = '" + ISPName + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                " }";
    }
}
