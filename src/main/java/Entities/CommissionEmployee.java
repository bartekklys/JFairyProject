package Entities;

import javax.persistence.Entity;

@Entity
public class CommissionEmployee extends Employee{

    private String username;
    private String telephoneNumber;

    public CommissionEmployee(String firstName, String lastName, int age, String nationalIdentyficationNumber, String username, String telephoneNumber) {
        super(firstName, lastName, age, nationalIdentyficationNumber);
        this.username = username;
        this.telephoneNumber = telephoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
