package presentation;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentationSpringAnnotation {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            IMetier metier = context.getBean(IMetier.class);

            System.out.println("Résultat = " + metier.calcul());
        }
    }
}