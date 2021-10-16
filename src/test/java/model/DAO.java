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


    public static void savecommercant(commercant commercant) {
        EntityManager entityManager = EntityManagerFactory.createEnti<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" version="2.2">
