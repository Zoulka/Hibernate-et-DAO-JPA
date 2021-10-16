package model;

import Facture.commercant;
import com.mysql.cj.xdevapi.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DAO {
    public static void main(String[] args) {

    }
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connect");

// c n'est pas encore fini
    public static void savecommercant(commercant commercant) {
    }
