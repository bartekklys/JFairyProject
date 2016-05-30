package Entities;

import javax.persistence.Entity;

@Entity
public class SalaryEmployee extends Employee{

    private String company;
    private String companyEmail;

    public SalaryEmployee(String firstName, String lastName, int age, int nationalIdentyficationNumber, String company, String companyEmail) {
        super(firstName, lastName, age, nationalIdentyficationNumber);
        this.company = company;
        this.companyEmail = companyEmail;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
}
