package presentation;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import java.io.InputStream;
import java.util.Scanner;

public class presentation2 {

    public static void main(String[] args) throws Exception {

        InputStream input = presentation2.class
                .getClassLoader()
                .getResourceAsStream("config.txt");

        if (input == null) {
            throw new RuntimeException("Fichier config.txt introuvable");
        }

        Scanner scanner = new Scanner(input);

        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();
        scanner.close();

        IDao dao = (IDao) Class.forName(daoClassName)
                .getDeclaredConstructor()
                .newInstance();

        IMetier metier = (IMetier) Class.forName(metierClassName)
                .getDeclaredConstructor()
                .newInstance();

        ((MetierImpl) metier).setDao(dao);

        System.out.println("Résultat = " + metier.calcul());
    }
}