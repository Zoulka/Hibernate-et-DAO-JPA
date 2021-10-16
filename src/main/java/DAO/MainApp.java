package DAO;

import DAO_JDBC.Products;

public class MainApp {
    public static void main(String[] args) {
        // on va creer notre url... pour envoyer dans notre base de données:
        String url ="jdbc:mysql://localhost:3306/mabase?serverTimezone=UTC";
        String user="root";
        String password="Admin123";

        // on va creer un produit
        Products products = new Products();
        products.setName("AMD Ryzen 5 2600");

        // on va extencier la classe pour passer la connection
        productDAO productDAO = new productDAO(url, user, password);
        // puis on sauvegarde les produits dans ma base de données, on met:
        productDAO.saveProduct(products);

        // si on veut afficher un produit, on procede ainsi:
       System.out.println(productDAO.getProductById(1L));


    }
}
