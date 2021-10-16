package Model;

import MainApp.Travailleurs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO {
    public static void main(String[] args) {

    }
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");


    public static void saveTravailleurs(Travailleurs travailleurs) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        if(travailleurs.getId()==null){
            entityManager.persist(travailleurs);
        }else {
            entityManager.merge(travailleurs);
        }
   transaction.begin();
        transaction.commit();
    }
}
