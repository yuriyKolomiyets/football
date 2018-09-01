package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InitTables {

    public static void main(String[] args) {
        Player player = new Player("A", "B", 1, 1, 2, 3, new Team());

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate-init");

        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            manager.persist(player);
            transaction.begin();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
    }
}
