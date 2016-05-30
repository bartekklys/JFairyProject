package DatabaseManager;

import Entities.SalaryEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Start {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        SalaryEmployee johnSmith = new SalaryEmployee("John", "Smith", 22, 22, "Epam", "john.smith@epam.com");

        session.save(johnSmith);

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
