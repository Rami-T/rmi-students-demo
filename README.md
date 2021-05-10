# rmi-students-demo
NSY107 - TD Java RMI
TD Java RMI
On considère une application repartie qui facilite la gestion des étudiants dans une université. 
Dans cette application l’étudiant est décrit par son nom de type String et les notes de trois matières (Math, Physique et info). 
Les étudiants seront stockés sur le serveur de l’université, ce serveur devra inclure les fonctionnalités suivantes:

1. Lister les noms des étudiants inscrits
2. Donner le nombre des étudiants inscrits
3. Inscription d’un nouvel étudiant qui sera identifié par son nom supposé unique
4. Suppression d’un étudiant
5. Actualiser les notes d’un étudiant inscrit
6. Calculer la moyenne d’un étudiant identifié par son nom
7. Calculer la moyenne totale des tous les étudiants inscrits

a) Créer la classe java qui représente un Etudiant.
b) On souhaite rendre chacune de ces méthodes accessibles à distance de manière à ce qu’elles définissent l’interface entre le client et le serveur. Ecrire cette interface.
c) Ecrire une application serveur permettant l’Implantation de l'interface distante et ayant pour but de stocker les étudiants sur un poste serveur.
d) Ecrire une application cliente ayant pour but d’inscrire un nouvel étudiant sur le poste serveur.
e) Ecrire une application cliente ayant pour but d’actualiser les notes d’un étudiant identifié par son nom sur le poste serveur, ensuite cette application demande au serveur de calculer la moyenne de l’étudiant.

# Conclusion
running the client at the first time after starting the RMI service server, will give the following outputs:
#NSY107-> Students Count at the very begining: 0
#NSY107-> Students Count: 5
#NSY107-> Rami's average: 16.400000000000002
#NSY107-> Total average: 14.926666666666668
#NSY107-> Students Count before removing Lama: 5
#NSY107-> Students Count after removing Lama: 4
#NSY107-> Students Count before adding Khalil: 4
#NSY107-> Students Count after adding Khalil: 5

