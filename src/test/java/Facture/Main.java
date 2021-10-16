package Facture;

import com.mysql.cj.xdevapi.Client;
import com.mysql.cj.xdevapi.Session;
import model.DAO;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();

       commercant nom = new commercant();
       nom.setNom("Hamidou");
       nom.setPrenom("Maiga");
       DAO.savecommercant(nom);


    }
}
