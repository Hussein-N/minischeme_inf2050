**Rapport – Outils à comparer : Maven vs Gradle**

# Remise du travail pratique 1

## Identification:

- **Cours**      : Outils et pratiques de développement logiciel
- **Sigle**      : INF2050
- **Session**    : Hiver 2020
- **Groupe**     : `30`
- **Enseignant** : `François-Xavier Guillemette`
- **Auteur**     : `Mehran Nazemi` ( `NAZM30088507` )
- **Auteur**     : `Hussein Nahle` ( `NAHH85090004` )
- **Auteur**     : `Giovanny Andrés Pardo Hoyos` ( `PARG03028209` )

**Maven**  :
Apache Maven est un cadre de gestion de projet open source basé sur des normes qui simplifie la construction, les tests, les rapports et la mise en package des projets. Les racines initiales de Maven étaient dans le projet Apache Jakarta Alexandria qui a eu lieu au début de 2000. Il a ensuite été utilisé dans le projet Apache Turbine. Comme beaucoup d'autres projets Apache à l'époque, le projet Turbine avait plusieurs sous-projets, chacun avec son propre système de construction basé sur Ant. À l'époque, il y avait un fort désir de développer
une façon standard de créer des projets et de partager facilement les artefacts générés entre les projets. Ce désir a donné naissance à Maven. Apache Maven est aujourd'hui utilisé par la majorité des développeurs pour automatiser la construction (build) et le déploiement (deploy) des applications.
Maven version 1.0 est sortie en 2004, suivie de la version 2.0 en 2005 et de la version 3.0 en 2010.


**Gradle**  : 
Gradle est un système d’automatisation et de construction logiciel (build) open-source déclaratif, développé pour Java et autres plateformes. Il utilise certains concepts qui proviennent de systèmes analogues comme Apache Maven et Apache Ant. Cependant, Gradle s’éloigne de ces derniers étant donné qu’il introduit le langage de domaine spécifique basé sur Groovy, ainsi que le langage de typage statique Kotlin pour programmer des scripts au lieu des fichiers XML. En outre, Gradle utilise le modèle DAG (Directed acyclic graph) pour établir l’ordre dans lequel les tâches pourront être exécutées. Une première version a été lancée en 2007. D'importantes applications comme Netflix, Linkedin ou Android utilisent Gradle. Il est supporté par plusieurs IDE comme Android Studio, Eclipse, IDEA et NetBeans. Gradle build tool source code est disponible sous licence Apache License 2.0. Le manuel de l’utilisateur de Gradle et les références DSL sont sous licence Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International.



**Critère # 1 : Performance**
- -- **Description** : 
Dans ce critère on cherche à trouver lequelle des deux outils Maven ou Gradle, est le moins complexe, le plus facile et le plus performant a utilisé, dans le cas de notre projet.

- -- **Importance**  : 
Le build Maven suit un cycle de vie spécifique. Il existe trois cycles de vie intégrés. 
Le cycle de vie principal qui est responsable du déploiement du projet
Un clean, pour nettoyer le projet et supprimer tous les fichiers générés par la build précédente.
Et un site pour créer la documentation du site du projet.
Chaque cycle de vie consiste en une séquence de phases. Le cycle de vie de génération par défaut se compose de 23 phases car il s'agit du cycle de vie de génération principal.
Alors que gradle utilise des tasks, c'est-à-dire des actions pour construire le projet. Comme par exemple la compilation du code source, génération de Javas Doc, zipper les .class en .jar .
Gradle offre en plus, des fonctionalistées et des caractéristiques pour améliorer la vitesse d’exécution des tests. Comme, la compilation incrémentielle pour les classes java. L’utilisation d’API pour les sous tachesincrémentielles. Et l’utilisation de démon de compilation pour accélérer la compilation. C’est fonctionaliste se trouve dans Gradle mais  pas dans Maven. Cela rend Maven plus lent et moins performant lors de l’exécution de test, pour un projet qui compte de plus de 10 sous-projets, et 50 fichiers de code sources.
Plusieurs recherches ont été faite pour comparer la durer de l’exécution de tester chez Maven et Gradle. On a trouvé que Gradle est 2 à 3 fois plus rapides pour les versions propres, environ 7 fois plus rapide pour les modifications incrémentielles et jusqu'à 14 fois plus rapide lorsque les sorties de tâche Gradle sont mises en cache.
Cependant l’utilisation de ces fonctionalistées dépant du projet.

- --**Quel outil est le meilleur et pourquoi** : 
Certains projets n’ont pas besoin de tout ces fonctionalistes. Vu que notre projet n’est pas assez complexe, et on est en groupe de 3 personnes.
Tout se qu’on a à faire, c’est d’exécuter quelque test et créer les fichiers .jar, alors ça serait plus avantagé de travailler avec Maven.

**Références 1 :**
- --[http://tutorials.jenkov.com/gradle/gradle-tutorial.html#gradle-core-concepts](http://tutorials.jenkov.com/gradle/gradle-tutorial.html#gradle-core-concepts)

- --[http://tutorials.jenkov.com/maven/maven-tutorial.html](http://tutorials.jenkov.com/maven/maven-tutorial.html)

- --[https://phauer.com/2018/moving-back-from-gradle-to-maven/](https://phauer.com/2018/moving-back-from-gradle-to-maven/)

- --[https://dzone.com/articles/gradle-vs-maven](https://dzone.com/articles/gradle-vs-maven)

- --[https://blog.gradle.org/performance-is-a-feature](https://blog.gradle.org/performance-is-a-feature)

- --[https://gradle.org/gradle-vs-maven-performance/](https://gradle.org/gradle-vs-maven-performance/)



**Critère # 2 : Flexibilité**

- **--Description :**
La capacité du logiciel à changer facilement en réponse aux différentes exigences des utilisateurs et du système.
Description :
Il fait normalement référence à la capacité de la solution à s'adapter aux changements possibles ou futurs de ses besoins. Lorsque vous concevez ou construisez une solution, vous devez essayer de répondre à ces changements qui arriveront inévitablement à l'avenir.

- **--Importance :**
Pour gérer les changements technologiques, les marchés, les réglementations et le budget, la flexibilité est devenue une préoccupation importante pour les responsables informatiques. La flexibilité est la capacité de changer facilement et efficacement et se caractérise comme suit :
Actualité et efficacité d'un changement et satisfaction des résultats du changement 
Difficulté, coût, temps, effort et risque de mettre en œuvre un changement 
Ampleur du changement et stabilité 
Universalité de l'entité censée être flexible.
La flexibilité stratégique est la capacité d'une organisation à s'adapter rapidement
changements et ainsi être en position d’avantage compétitif.

- **--Quel outil est le meilleur et pourquoi :**
Gradle est plus flexible que Maven.
En ce moment, l'intérêt pour les DSL (Domain Specific Languages) a continué de croître. L'idée est d'avoir des langages conçus pour résoudre des problèmes appartenant à un domaine spécifique. En cas de builds, l'un des résultats de l'application DSL est Gradle.
Gradle n'utilise pas XML. Au lieu de cela, il avait son propre DSL basé sur Groovy (l'un des langages JVM). En conséquence, les scripts de construction Gradle ont tendance à être beaucoup plus courts et plus clairs que ceux écrits pour Maven. Et aussi les builds personnalisés seraient faciles à faire sur Gradle que Maven grâce au Groovy.
Le modèle de Gradle est conçu de manière à pouvoir être étendu à tout écosystème.
Gradle est un système de construction basé sur un plugin. Cela signifie que même si vous avez votre propre langage de programmation et si vous souhaitez automatiser la tâche de génération d'exécutable à partir du code source, vous pouvez écrire votre propre plugin dans n'importe quel langage basé sur JVM comme Java, Kotlin, Scala, Groovy, etc. et l'utiliser. Cela rend Gradle beaucoup plus flexible que les autres.

**Références 2 :**
- --[https://www.journaldunet.com/web-tech/developpeur/1137266-au-revoir-maven-et-place-a-gradle/](https://www.journaldunet.com/web-tech/developpeur/1137266-au-revoir-maven-et-place-a-gradle/)
- --Balaji Varanasi - Introducing Maven - A Build Tool for Today’s Java Developers.-Apress (2020)
- --[https://informativearchitecture.wordpress.com/2011/10/04/software-flexibility/](https://informativearchitecture.wordpress.com/2011/10/04/software-flexibility/)

- --[https://encyclopedia2.thefreedictionary.com/software+flexibility](https://encyclopedia2.thefreedictionary.com/software+flexibility)

- --[https://www.diva-portal.org/smash/get/diva2:854708/FULLTEXT01.pdf](https://www.diva-portal.org/smash/get/diva2:854708/FULLTEXT01.pdf)

- --[https://technologyconversations.com/2014/06/18/build-tools/](https://technologyconversations.com/2014/06/18/build-tools/)

- --[https://medium.com/jay-tillu/what-is-gradle-why-google-choose-it-as-official-build-tool-for-android-adafbff4034](https://medium.com/jay-tillu/what-is-gradle-why-google-choose-it-as-official-build-tool-for-android-adafbff4034)



**Critère # 3 : Documentation et communauté**

- -- **Description** : 
 le critère documentation et communauté vise à nous renseigner sur la facilité à trouver de l’information, la qualité de celle-ci et la possibilité de trouver du soutien par rapport aux outils de « build » que nous voulons comparer.

- -- **Importance**  : 
Ce critère est très important à considérer dans le cadre d’un projet de développement logiciel, car une faible qualité et disponibilité d’information, ainsi que de sources de soutien pour le débogage pourront avoir un impact assez négatif dans l’avancement du projet ; particulièrement dans les cas où l’expérience de l’équipe de travail par rapport à l’outil est faible ou dans de nouveaux projets où on a besoin de nouvelles fonctionnalités. 

- -- **Quel outil est le meilleur et pourquoi** : 
le choix du meilleur outil, par rapport à ce critère, est relatif et dépend des utilisateurs et du projet où il sera utilisé. En conséquence, on a choisi Maven comme le meilleur. D’abord, les deux outils disposent d’une très bonne documentation et communauté. En réalité, il n’y a pas une grosse différence, néanmoins la documentation Maven est moins centralisée et elle est disponible en plusieurs langages contrairement à celle de Gradle où prédomine l’anglais. Sur les sites web officiels des deux outils, on trouve les différents chapitres nécessaires pour l’installation et l’apprentissage, mais celui de Maven est moins dense et mieux structuré, possiblement à cause d’une plus basse complexité. En plus, la documentation Gradle est plus vaste et ajoute de l’information et des exemples en lien avec Groovy et Kotlin. Les deux sites web permettent le téléchargement du manuel de l’utilisateur en PDF, cependant celui de Maven est plus concis, 131 pages vs 1243, ce qui montre une plus grande simplicité du premier. En ce qui concerne les livres, les deux outils offrent plusieurs choix, mais on a deux livres gratuites fournis pour Maven en format PDF. En outre, on trouve des livres et des articles écrits en autres langages hors de l’anglais pour Maven. Pour ce qui est la communauté, le forum de Gradle est assez bon et il est placé sur le site officiel. Cependant, le site Stack Overflow dispose d’une plus ample source de questions et réponses, 71797 vs les 36655 de Gradle. On trouve trois fois plus de sites web non officiels pour Maven (Google). Finalement, les deux outils offrent des vidéos pour la formation des développeurs, sur YouTube, ainsi que sur les sites officiels.         

**Références 3 :**

- --[https://gradle.org/](https://gradle.org/)

- --[https://en.wikipedia.org/wiki/Gradle](https://en.wikipedia.org/wiki/Gradle)

- --Notés du cours : INF2050-30-H2020 - Outils et pratiques de développement logiciel

- --[https://gradle.org/guides/](https://gradle.org/guides/)

- --[https://docs.gradle.org/current/userguide/userguide.pdf](https://docs.gradle.org/current/userguide/userguide.pdf)

- --[https://gradle.org/help/](https://gradle.org/help/)

- --[https://stackoverflow.com/questions/tagged/gradle](https://stackoverflow.com/questions/tagged/gradle)

- --[https://maven.apache.org/](https://maven.apache.org/)

- --[https://maven.apache.org/guides/](https://maven.apache.org/guides/)

- --[https://maven.apache.org/articles.html](https://maven.apache.org/articles.html)

- --[https://maven.apache.org/archives/maven-1.x/maven.pdf](https://maven.apache.org/archives/maven-1.x/maven.pdf)

- --[https://stackoverflow.com/questions/tagged/maven](https://stackoverflow.com/questions/tagged/maven)

- --[http://tutorials.jenkov.com/maven/maven-tutorial.html](http://tutorials.jenkov.com/maven/maven-tutorial.html)

- --[https://www.tutorialspoint.com/maven/maven\_project\_documents.htm](https://www.tutorialspoint.com/maven/maven_project_documents.htm)

- --[https://www.java-forums.org/apache-maven/](https://www.java-forums.org/apache-maven/)

- --[https://www.eclipse.org/forums/index.php?SQ=0&t=search&srch=maven&btn_submit=Search](https://www.eclipse.org/forums/index.php?SQ=0&t=search&srch=maven&btn_submit=Search)
