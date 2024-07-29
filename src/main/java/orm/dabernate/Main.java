package orm.dabernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import orm.dabernate.entity.Person;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
        EntityManager em = emf.createEntityManager();

        Person person = em.find(Person.class, 1L);
        System.out.println(person);

        em.close();
        emf.close();
    }
}
