Application Spring Boot de gestion de patients : 

Encadré par Mr Mohammed Youssfi : 

-Pour la database, on a utilisé mysql.

-Thymyleaf comme moteur de template html.

-Lombok Pour generer les getters/setters et autres ...

-JPA Buddy pour gerer les modeles de DATA

-Spring Security pour hoster une page login/logout et permettre les fonctions Admin et autres.

-Hibernate solution open source de type ORM (Object Relational Mapping) qui permet de faciliter le développement de la couche persistance d'une application.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Le but de l'application est de gerer les patients d'un soit disant hopital, tout en ayant la possibilité d'utiliser les methodes CRUD afin de recevoir ces données sous fourmes de tableaux bien organisé , facilitant aux utilisateurs la vue de données.

![1](https://user-images.githubusercontent.com/73953594/166082187-d3a2e866-ffa8-429e-b032-89ba7cc1e6df.png)

On commence par l'interface Spring Boot Security qui permettra le login/logout
![2](https://user-images.githubusercontent.com/73953594/166082256-2d82e3f9-8e75-4948-ae37-0b9181716590.png)

NavBar D'un utilisateur normal
![3](https://user-images.githubusercontent.com/73953594/166082267-fed8d667-1655-40f5-8c9a-870d52df2712.png)

Et ceci est l'interface patient d'un utilisateur normal, pas d'ajout et pas de modification.Mais , quand il s'agit de compte admin declaré auparavant, l'interface changeras en fonction et affichera ceci

![4](https://user-images.githubusercontent.com/73953594/166082309-0beb8d2e-d411-412d-9307-c03b6b9e1a6f.png)


Et vous pouvez y voir les bouttons de supression --->

![5](https://user-images.githubusercontent.com/73953594/166082330-581af406-2c1b-44bb-a828-0526e004ce2e.png)

Avec une demande de verification de la supression

![6](https://user-images.githubusercontent.com/73953594/166082342-39ad345b-b681-4745-98cd-bb3faee2ef0f.png)

Mais pour l'edit voila le bouton: 
![7](https://user-images.githubusercontent.com/73953594/166082372-06753c0e-c44c-43f0-96c3-19ad2861ac81.png)

et apres le click :
![8](https://user-images.githubusercontent.com/73953594/166082549-b4d3100f-5ca5-4f3c-b826-6808a8b70bd1.png)


