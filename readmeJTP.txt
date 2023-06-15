Sources d'info:

1: Pour lancer:

    Sources: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

    java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App         (cf pb 4 ci-dessous)
    
    Rq: voir le scope dans le fichier pom.xml qui permet de packager les dépendances...

2: pour confirgurer des paramètres

    Sources: https://maven.apache.org/guides/getting-started/index.html
    
3: log4j

    Sources: 
    - https://mkyong.com/logging/log4j-hello-world-example/    bof/vieux ? (log4J 1)
    - https://koor.fr/Java/Tutorial/java_logging_log4j2.wp#installation    (log4J 2)
    
4: Pb "NoClassDefFound" on log4J (can find dependency) when launch en ligne de comande

    4.1: Source:
    - https://stackoverflow.com/questions/10568275/noclassdeffounderror-on-maven-dependency/10569417#10569417
    - https://maven.apache.org/plugins/maven-shade-plugin/index.html
    
    # Add the shade plugin to package the dependecies in the jar  (see source)
    ==> ne marche ps
    
    4.2/ Source:
    - https://www.jmdoudoux.fr/java/dej/chap-maven.htm#maven-3
    - https://howtodoinjava.com/java-examples/set-classpath-command-line/
    
    # copie des dépendances dans le rep target/dependencies    il faut aussi le rajouter au classpath ?
    mvn clean dependency:copy-dependencies package
    
    # puis lance java avec le -cp pointant sur les dependances ET la classe cible
    java -cp target/dependency/*:target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
    
    ==> marche : mais je ne trouve pas le fichier de log !?