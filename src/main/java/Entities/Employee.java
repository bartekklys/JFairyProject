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
    private int nationalIdentyficationNumber;

    public Employee(String firstName, String lastName, int age, int nationalIdentyficationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalIdentyficationNumber = nationalIdentyficationNumber;
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

    public int getNationalIdentyficationNumber() {
        return nationalIdentyficationNumber;
    }

    public void setNationalIdentyficationNumber(int nationalIdentyficationNumber) {
        this.nationalIdentyficationNumber = nationalIdentyficationNumber;
    }
}
