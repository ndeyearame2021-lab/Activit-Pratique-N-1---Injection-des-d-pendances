# Activit-Pratique-N-1---Injection-des-d-pendances

## Introduction
Ce projet consiste à mettre en pratique le concept d'injection de dépendances en Java, un principe qui permet de réduire le couplage entre les classes et de rendre le code plus flexible et maintenable.
L'objectif est d'implémenter et de comparer différentes méthodes d'injection de dépendances : l'injection statique, l'injection dynamique par réflexion, ainsi que l'utilisation du framework Spring avec une configuration XML et des annotations.
Ce travail pratique permet de comprendre les avantages de chaque approche et de découvrir comment l'injection de dépendances facilite le développement et la maintenance des applications Java.

1. v Création de l'interface IDao avec une méthode getData
![Capture d'écran 2026-10-21 104434.png](../../../../../../../Pictures/Screenshots/Capture%20d%27%C3%A9cran%202026-10-21%20104434.png)

2. Création d'une implémentation de cette interface
![img.png](img.png)

3. Création de l'interface IMetier avec une méthode calcul
![img_1.png](img_1.png)

4. Création d'une implémentation de cette interface en utilisant le couplage faible
![img_2.png](img_2.png)

5. l'injection des dépendances :
   a.Par instanciation statique

6. création de la class presentation pour la création de nouveaux objets 
![img_3.png](img_3.png)

7. instanciation statique (création des objets dans presentation)
![img_4.png](img_4.png)

8. ajout d'un setter dans MetierImpl pour accéder a presentation
![img_5.png](img_5.png)

9. test de la metier.calcul()
![img_6.png](img_6.png)

10. création du directory ressources et du dossier conf.txt
![img_7.png](img_7.png)

11. modification de MetierImpl avec un setter, pour injecter DAO
![img_8.png](img_8.png)

12. presentation2 pour l'instanciation dynamique
![img_12.png](img_12.png)

13. modification de conf.txt
![img_11.png](img_11.png)

14. test du programme presentation2
![img_13.png](img_13.png)

15. ajout des dépendances dans pom.xml
![img_14.png](img_14.png)

16. presentationSpringXml
![img_16.png](img_16.png)

17. test de presentationSpringXml
![img_15.png](img_15.png)
    
18. modification de metierImpl et DaoImpl avec component
![img_17.png](img_17.png)
![img_18.png](img_18.png)

19. instanciation framework spring version annotations avec test
![img_19.png](img_19.png)

Conclusion : Ce projet m'a permis de comprendre le concept d'injection de dépendances en Java et son importance dans la réduction du couplage entre les classes. 
J'ai mis en œuvre quatre approches :
-L'injection de dépendances statique
-L'injection de dépendances dynamique à l'aide de la réflexion Java
-L'injection de dépendances avec Spring XML
-L'injection de dépendances avec les annotations Spring

Ce travail pratique a permis de découvrir comment l'injection de dépendances améliore la flexibilité, la maintenabilité et la réutilisabilité du code.
Il a également aidée à mieux comprendre les principes de la programmation orientée objet et les mécanismes du framework Spring.

