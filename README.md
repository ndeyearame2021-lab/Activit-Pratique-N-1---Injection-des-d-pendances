# Activit-Pratique-N-1---Injection-des-d-pendances
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

    



