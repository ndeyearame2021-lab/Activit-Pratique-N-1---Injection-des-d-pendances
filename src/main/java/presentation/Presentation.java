package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.FileInputStream;
import java.util.Properties;

public class Presentation {

    public static void main(String[] args) throws Exception {

        // Lire le fichier de configuration
        Properties properties = new Properties();

        properties.load(
                new FileInputStream("src/main/resource/config.txt")
        );

        // Récupérer les noms des classes
        String daoClass = properties.getProperty("dao");
        String metierClass = properties.getProperty("metier");

        // Créer les objets dynamiquement
        IDao dao = (IDao) Class.forName(daoClass)
                .getDeclaredConstructor()
                .newInstance();

        IMetier metier = (IMetier) Class.forName(metierClass)
                .getDeclaredConstructor()
                .newInstance();

        // Injecter le DAO dans le métier
        metier.getClass()
                .getMethod("setDao", IDao.class)
                .invoke(metier, dao);

        // Exécuter le calcul
        System.out.println("Résultat = " + metier.calcul());
    }
}