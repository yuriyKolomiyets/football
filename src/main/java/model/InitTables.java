package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashSet;

public class InitTables {

    public static void main(String[] args) {
        /*Player player =
                new Player("A", "B", Coach.Nationality.GERMAN, 1, 1, 2,
                3,
                        new Team("Dynamo", "Kyiv", new Coach("Oleg", "Oleg",
                        Coach.Nationality.GERMAN, null),
                        new HashSet<Player>(), new Championship("Ukr", new HashSet<Game>())));*/

        Championship ukraine = new Championship("Ukraine", new HashSet<Game>());

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate-init");

        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            transaction.begin();
            manager.persist(ukraine);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();
    }
}
