package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.UUID;

public class InitTables {

    public static void main(String[] args) {

        Championship ukraine = new Championship("Ukraine", new HashSet<Game>());

        Player player =
                new Player("A", "B", Coach.Nationality.GERMAN, 1, 1, 2,
                        3,
                        new Team("Dynamo", "Kyiv", new Coach("Oleg", "Oleg",
                                Coach.Nationality.GERMAN, null),
                                new HashSet<Player>(), ukraine));
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate-init");

        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            transaction.begin();
            manager.persist(player);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();
    }
}