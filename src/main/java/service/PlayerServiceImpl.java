package service;

import model.Coach;
import model.Player;
import model.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements IPlayerService {

    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("hibernate-init");

    EntityManager manager = managerFactory.createEntityManager();
    EntityTransaction transaction = manager.getTransaction();

    //todo write logic for Team (present or not in db)
    public Player create(String firstName, String lastName, Coach.Nationality nationality,
                         int age, int number, int height, int weight, Team team) {

        Player playerObj = null;

        try {
            transaction.begin();

            playerObj = new Player(firstName, lastName, nationality, age, number, height, weight, new Team());

            manager.persist(playerObj);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();

        return playerObj;
    }

    public List<Player> read() {

        List <Player> playersList = new ArrayList<Player>();

        try {
            transaction.begin();

            playersList = manager.createQuery("FROM Players").getResultList();

            manager.persist(playersList);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();


        return playersList;
    }

    public Player update(String firstName, String lastName, Coach.Nationality nationality) {

        List <Player> playersList = new ArrayList<Player>();
        Player playerObj = null;

        try {
            transaction.begin();
            playersList = read();

            for (Player player:playersList) {
                if (player.getFirstName().equals(firstName) && player.getLastName().equals(lastName)){
                    playerObj = player;
                }
            }
            if (playerObj != null) {
                playerObj.setNationality(nationality);
            }

            manager.persist(playerObj);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();

        return playerObj;
    }

    public Player delete(String firstName, String lastName) {

        List <Player> playersList = new ArrayList<Player>();
        Player playerObj = null;
        try {
            transaction.begin();
            playersList = read();

            for (Player player:playersList) {
                if (player.getFirstName().equals(firstName) && player.getLastName().equals(lastName)){
                    playerObj = player;
                }
            }

            //to do find how to delete
            manager.persist(playerObj);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            manager.close();
        }
        managerFactory.close();

        return playerObj;
    }
}
