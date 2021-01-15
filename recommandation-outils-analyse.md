**Rapport – Outils à comparer : CheckStyle vs Sonarqube**

# Remise du travail pratique 2

## Identification:

- Cours      : Outils et pratiques de développement logiciel
- Sigle      : INF2050
- Session    : Hiver 2020
- Groupe     : `30`
- Enseignant : `François-Xavier Guillemette`
- Auteur     : `Mehran Nazemi` (`NAZM30088507`)
- Auteur     : `Hussein Nahle` (`NAHH85090004`)
- Auteur     : `Giovanny Andrés Pardo Hoyos` (`PARG03028209`)

**CheckStyle**  :
CheckStyle est un outil développer par Oliver Burn en 2001.Il est utilisé en language java, pour vérifier si le code respect les lois des codages. Cet outil garanti que le code soit conforme aux bonnes pratiques de programmation, en améliorant la qualité, la lisibilité du code et en réduisant le coût de développement. Les fonctions effectuées par CheckStyle se limitent principalement à la présentation du code. CheckStyle admet plusieurs modules. Chaque module contient un certain nombre de règles. Les modules sont responsables de notifier le programmeur, lorsque le code né respect par les règles. Par exemple le nombre de paramètres, la nomenclature des méthodes, la longueur des lignes, les codes dupliqués, l’espace entre les caractères… On peut installer CheckStyle sous la forme d’archive .jar et l’utiliser sur une machine virtuelle java ou avec un plugiciel maven. L’utilisateur peut quand même ajouter des nouvelles modules et de nouvelle règles au plugiciel CheckStyle pour être averti quand il le veut. 


**SonarQube**  : 
SonarQube est une plate-forme open source développer par Sonar source. Cette plate-forme contient plusieurs outils qui permet de faire une examination sur le code, pour détecter les bugs, les répétitions, les méthodes longues…(code smells). SonarQube peut enregistrer l'historique des métriques et fournir des graphiques d'évolution, ainsi qu’une analyse et une intégration entièrement automatisées avec Maven, Ant, Gradle. Dans le domaine de l'analyse automatisée de code, SonarQube est le meilleur outil du marché. Il prend en charge plus de 20 languages de programmation, et offre plusieurs options de personnalisation. De plus, c'est un excellent outil pour les métriques de code statique, la couverture du code et les revues de code. Pour l’installation de Sonar Qube, une machine java virtuelle est requise (Java SE Runtime Environnement). Le lien de l’installation, ainsi que les étapes de configuration se trouvent sur le site officiel de Sonar Qube.



**Critère # 1 : soutien et assistance**
- -- **Description** : 
Il convient de noter que lorsque nous choisissons un appareil, quelle aide cet appareil peut-il apporter aux membres de l'équipe?

- -- **Importance**  :
 Ce critère est important car lorsqu'une équipe travaille sur un projet, les outils que nous choisissons doivent être tels qu'ils puissent aider autant que possible tous les membres de l'équipe dans chaque section. Parce que toute l'équipe a passé du temps sur ce projet et y a investi. Ils devraient donc être en mesure de tirer le meilleur parti des outils qu'ils ont choisis

SonarQube est le meilleur selon ce critère, parce que:

1.Du point de vue d'un testeur:il vous aidera à identifier les endroits où les tests automatisés sont minces ou inexistants.

2.Du point de vue d'un développeur :il vous aide à grandir en tant que codeur. Des subtilités spécifiques à la langue à la sécurité des threads et à la gestion des ressources, SonarQube peut vous montrer ce que vous vous trompez ou faites de manière sous-optimale et vous orienter dans la bonne direction pour le corriger.

3.D'un point de vue commercial:SonarQube offre un fort retour sur investissement car ses coûts d'acquisition et de configuration sont faibles et ses interfaces intuitives signifient que très peu de formation est requise. Ajoutez à cela le fait que son adoption au sein d'une organisation est généralement virale, et vous obtenez un investissement minimal qui produit rapidement des résultats significatifs.

4.Du point de vue d'un architecte logiciel:Il peut vous montrer si les règles de codage internes sont suivies et il peut vous aider à repérer la complexité croissante qui doit être refactorisée.5.Du point de vue de la gestionSonarQube analyse et favorise la qualité interne: si une application fonctionnera de manière optimale et sera facilement maintenable et extensible sur la route.

Comme nous l'avons vu, SonarQube peut aider tous les membres de l'équipe, et l'utilisation de cet outil est un investissement précieux.


**Critère # 2 : flexibilité: **

De très gros projets nécessitent la contribution de beaucoup de programmeurs. Les plugins Checkstyle pour les IDE comme Eclipse et IntelliJ, peuvent aider les équipes de programmeurs en utilisant toujours le même standard et soumettre du code avec une lisibilité élevée, tout en assurant que le code Java est conforme aux conventions de codage. Checkstyle vérifie le "style" du code. Il ne trouve pas de bogues sérieux, mais il peut aider à assurer que le code source est bien formaté et respecte les bonnes normes et pratiques. L'objectif principal de l'outil est de s'assurer que le code respecte une norme de codage. Sonarqube possède des modules comme celle de Checkstyle qui peuvent exécuter les mêmes plugins par défaut pour les projets java. La principale valeur ajoutée, est qu’il peut stocker l’historique dans une base de données. De nombreux plugins sont disponibles pour l'utiliser dans le cadre de pipelines d'intégration continue, notamment pour Maven, et Git Hub. Sonarqube utilise plusieurs outils comme plugins et agrègent les données, donnant une valeur ajoutée en affichant des graphiques et autres à partir de ces outils. CheckStyle est donc un complémentaire au Sonarqube. On peu donc dire que Sonarqube est plus flexible que Checkstyle, car Sonarqube n’est pas juste un outil mais une plate-forme qui intègre plusieurs outils, et pour différents languages. Et ce qui rend Sonarqube plus flexible, c’est qu’il peut être utilisé avec plus que 20 languages alors que Checkstyle est juste spécialisé pour les codes en java. 
Pour conclure, Sonarqube est le meilleur, puisqu’il nous donne tous les fonctionnalités que CheckStyle possède et plus. 


**Critère # 3 : Complexité **

La plupart des programmeurs utilisent des outils d'analyse de code statique comme checkstyle et sonarqube. La mise en place d'un outil d'analyse de la qualité du code est parfois une tâche assez lourde. 
CheckStyle prend en charge un très grand nombre de règles, y compris celles concernant les conventions de dénomination, les annotations, les commentaires, la taille des classes et des méthodes, les métriques de complexité du code, les mauvaises pratiques de codage et bien d'autres. Le code dupliqué est plus difficile à maintenir et à déboguer. Checkstyle fournit un certain support pour la détection de code dupliqué, mais des outils plus spécialisés et qui font un meilleur travail dans ce domaine. Checkstyle est si facile à configurer. En utilisant le plugiciel éclipse (ou même directement en XML), on peut choisir parmi plusieurs centaines de règles différentes et affiner les paramètres des règles comme on désire. Cela est important, car différentes organisations, ou équipes qui travaillent sûres de même projet ont des exigences et des préférences différentes en ce qui concerne les normes de codage, et il vaut mieux avoir un ensemble précis de règles qui peuvent être respectées, plutôt qu'un large ensemble de règles qui seront ignorées. 
Sonarqube est un outil qui centralise une gamme de métriques de qualité de code dans un seul site Web. Il utilise plusieurs plugins Maven pour analyser les projets Maven et générer un ensemble de rapports de métriques de qualité de code. des métriques plus élevées que la complexité, la maintenabilité et même la dette technique. On peut même utiliser des plugins pour étendre ses fonctionnalités pour d'autres langues. les règles utilisées par divers outils sont fusionnées et configurées de manière centralisée sur le site Web de Sonarqube, et les projets maven analysés ne nécessitent pas de configuration particulière. Cela rend le sonarqube parfaitement adapté aux projets aven où nous avons un contrôle limité sur les fichiers pom Sonarqube
 


**Références :**

https://dzone.com/articles/why-sonarqube-1

https://docs.sonarqube.org/latest/https://www.manning.com/books/sonarqube-in-action

https://stackoverflow.com/questions/5479019/is-sonarqube-replacement-for-checkstyle-pmd-findbugs

https://axibase.com/use-cases/workshop/sonar.htm

https://www.jrebel.com/blog/static-code-analysis-in-java-guide

https://blog.sideci.com/an-overview-of-checkstyle-and-how-it-is-used-in-open-sourced-projects-8dc288f65fdb

https://en.wikipedia.org/wiki/SonarQube

https://checkstyle.sourceforge.io

https://en.wikipedia.org/wiki/Checkstyle
