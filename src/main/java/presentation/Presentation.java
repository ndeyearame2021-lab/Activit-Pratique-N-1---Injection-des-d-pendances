package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){

            // Création de l'objet DAO
            DaoImpl dao = new DaoImpl();

            // Création de l'objet métier
            MetierImpl metier = new MetierImpl();

            // Injection de la dépendance
            metier.setDao(dao);

            // Appel de la méthode calcul
            System.out.println("Résultat = " + metier.calcul());

    }
}
