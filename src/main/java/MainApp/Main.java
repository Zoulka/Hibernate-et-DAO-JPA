package MainApp;

import Model.DAO;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();

        Travailleurs travailleurs = new Travailleurs();
        travailleurs.setNom("Hamcha");
        travailleurs.setPrenom("Amadou");
        DAO.saveTravailleurs(travailleurs);

    }
}
