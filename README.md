Application Spring Boot de gestion de patients : 

Encadré par Mr Mohammed Youssfi : 

-Pour la database, on a utilisé mysql.

-Thymyleaf comme moteur de template html.

-Lombok Pour generer les getters/setters et autres ...

-JPA Buddy pour gerer les modeles de DATA

-Spring Security pour hoster une page login/logout et permettre les fonctions Admin et autres.

-Hibernate solution open source de type ORM (Object Relational Mapping) qui permet de faciliter le développement de la couche persistance d'une application.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

L'application a l'objectif de gérer plusieurs patients, voir leurs score, ajouter et supprimer.

![1](https://user-images.githubusercontent.com/73953594/166082187-d3a2e866-ffa8-429e-b032-89ba7cc1e6df.png)

On commence par l'interface Spring Boot Security qui permettra le login/logout
![2](https://user-images.githubusercontent.com/73953594/166082256-2d82e3f9-8e75-4948-ae37-0b9181716590.png)

La bar de navigation d'un utilisateur s'affiche comme :
![3](https://user-images.githubusercontent.com/73953594/166082267-fed8d667-1655-40f5-8c9a-870d52df2712.png)

L'interface change par rapport au role de l'utilisateur, si c'est un user normal il pourra voir sans avoir la possibilité d'éditer ou de supprimer.
Par contre si le compte entré est un administrateur, l'interface change, et il aura la possibilité de faire des modifications.

![4](https://user-images.githubusercontent.com/73953594/166082309-0beb8d2e-d411-412d-9307-c03b6b9e1a6f.png)


Pour supprimer : 

![5](https://user-images.githubusercontent.com/73953594/166082330-581af406-2c1b-44bb-a828-0526e004ce2e.png)


Pour éditer : 
![7](https://user-images.githubusercontent.com/73953594/166082372-06753c0e-c44c-43f0-96c3-19ad2861ac81.png)

Et après le click, l'adminisitrateur pourra changer les paramètres suivants : 
![8](https://user-images.githubusercontent.com/73953594/166082549-b4d3100f-5ca5-4f3c-b826-6808a8b70bd1.png)


