package Entities;

import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee{

    private String companyEmail;

    public SalaryEmployee(String firstName, String lastName, int age, String nationalIdentyficationNumber, String companyEmail) {
        super(firstName, lastName, age, nationalIdentyficationNumber);
        this.companyEmail = companyEmail;
    }


    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
}
