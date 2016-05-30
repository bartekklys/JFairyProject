package DatabaseManager;

import Entities.CommissionEmployee;
import Entities.SalaryEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

public class Start {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Fairy fairy = Fairy.create();


        for(int i = 0; i < 15 ; i++) {
            Person salaryPerson = fairy.person();
            SalaryEmployee salaryEmployee = new SalaryEmployee(salaryPerson.firstName(), salaryPerson.lastName(), salaryPerson.age(), salaryPerson.nationalIdentityCardNumber(),
                    salaryPerson.companyEmail());

            Person commissionPerson = fairy.person();
            CommissionEmployee commissionEmployee = new CommissionEmployee(commissionPerson.firstName(), commissionPerson.lastName(), commissionPerson.age(),
                    commissionPerson.nationalIdentityCardNumber(), commissionPerson.username(), commissionPerson.telephoneNumber());


            session.save(salaryEmployee);
            session.save(commissionEmployee);
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
