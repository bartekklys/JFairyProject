package Entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationalIdentityCardNumber;

    public Employee(String firstName, String lastName, int age, String nationalIdentityCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalIdentityCardNumber = nationalIdentityCardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationalIdentityCardNumber() {
        return nationalIdentityCardNumber;
    }

    public void setNationalIdentityCardNumber(String nationalIdentityCardNumber) {
        this.nationalIdentityCardNumber = nationalIdentityCardNumber;
    }
}
