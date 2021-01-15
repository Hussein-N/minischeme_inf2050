# Remise finale du travail pratique
​
## Identification:
​
- **Cours**      : Outils et pratiques de développement logiciel
- **Sigle**      : INF2050
- **Session**    : Hiver 2020
- **Groupe**     : `30`
- **Enseignant** : `François-Xavier Guillemette`
- **Auteur**     : `Mehran Nazemi` ( `NAZM30088507` )
- **Auteur**     : `Hussein Nahle` ( `NAHH85090004` )
- **Auteur**     : `Giovanny Andrés Pardo Hoyos` ( `PARG03028209` )
​
# Projet Minischeme [![License:MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
​
## Prérequis
-  [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
-  [Maven 3.6.0](https://maven.apache.org/docs/3.6.0/release-notes.html)
-  [VirtualBox](https://www.virtualbox.org/wiki/Downloads)
-  [Vagrant](https://www.vagrantup.com/downloads.html)
​
### Compilation et exécution des tests avec Maven
**Linux / MacOS**
```./mvnw clean test```
**Windows**
```mvnw.cmd clean test```
​
### Installation du package dans le repertoire local avec Maven
**Linux / MacOS**
```./mvnw clean install```
**Windows**
```mvnw.cmd clean install```
​
### Interface Web
**Linux / MacOS**
```./mvnw spring-boot:run```
**Windows**
```mvnw.cmd spring-boot:run```
​
Accéder à l'application sur l'adresse : [http://localhost:8080](http://localhost:8080)
​
### Vagrant 
Demmarer Vagrant dans le repo `multiTeQ_INF2050-30-H2020` et executer les tests :
**Linux / MacOS**
```
$ vagrant up
$ vagrant ssh
vagrant@vagrant:~$ cd /vagrant
vagrant@vagrant:/vagrant$ mvn test
```
**Windows**
```
> vagrant.exe up
> vagrant.exe ssh
vagrant@vagrant:~$ cd /vagrant
vagrant@vagrant:/vagrant$ mvn test
```
