package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PracownikData {
    private final StringProperty ID;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty email;
    private final StringProperty DOB;
    private final StringProperty ID_Firmy;

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getDOB() {
        return DOB.get();
    }

    public StringProperty DOBProperty() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB.set(DOB);
    }

    public String getID_Firmy() {
        return ID_Firmy.get();
    }

    public StringProperty ID_FirmyProperty() {
        return ID_Firmy;
    }

    public void setID_Firmy(String ID_Firmy) {
        this.ID_Firmy.set(ID_Firmy);
    }

    public  PracownikData(String id, String firstName, String lastName, String email, String DOB, String id_firmy) {
        this.ID = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
        this.DOB = new SimpleStringProperty(DOB);
        this.ID_Firmy =new SimpleStringProperty(id_firmy);


    }
}