package DAO;

import DAO_JDBC.Products;

import java.sql.*;

public class productDAO {

    private String url;
    private String username;
    private String password;

    // et on va creer un constructeur qui va nous permettre d'utiliser notre DAO
    public productDAO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // puis on crée une methode qui va nous permettre de sauvegarder un produit dans la base de données
    public void saveProduct(Products products) {
        //on va passer une connection avec la base de données. Mais getconnection on doit la passer en try catch (gestion des erreurs)
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            if (products.getId() != null) {
                PreparedStatement statement = connection.prepareStatement
                        ("update products set name = ? where id = ?;");
                statement.setString(1, products.getName());
                statement.setLong(2, products.getId());

                // une finit ceci, on va exécuter notre requete sql
                statement.execute();
                // si le produit n'existe pas, alors on failt else qui suit


            } else {
                PreparedStatement statement = connection.prepareStatement
                        ("insert into products (name) values (?);");
                statement.setString(1, products.getName());
                statement.execute();
            }

            // et on peut aussi ajouter un petit message
            System.out.println(products.getName() + "enregistré dans la base de données");


        } catch (SQLException e) {
            e.printStackTrace();

            // si on veut qu'il nous affiche un message d'erreur s'il y'en a, alors on met:
            System.out.println("Une erreure d'enregistrement products");
        }
    }

    // si on veut recuperer des données dans notre base de données, alors:
    public Products getProductById(Long id) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement statement = connection.prepareStatement
                    ("select * from products where id = ?");
            statement.setLong(1, id);

            // puis on va chercher le resultat par:
            ResultSet resultSet = statement.executeQuery();

            // on va creer un nouveau product
            Products products = new Products();

            // puis on va faire un while qui va trier le resultat
            while (resultSet.next()) {
                products.setId(resultSet.getLong("id"));
                products.setName(resultSet.getString("name"));
            }
            return products;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}