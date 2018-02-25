This is a maven project with Java and Scala code that is mix compiled, built, unit tested, integration tested, and sonar tested.

Setup guidance:
* Java JDK 8
* Scala 2.12.4
* Maven v3
* Git v2.7.4
* Eclipse 4.7 Oxygen
* Clone/Build in Local Maven Repo https://github.com/stephenc/mongodb-maven-plugin

In Eclipse 4.7 Oxygen, do the following steps in the toolbar
* Windows -> Preferences -> Java -> Installed JREs -> Add -> JDK8 (root installation folder)
* Windows -> Preferences -> Scala -> Installations -> Add -> Scala 2.12.4 (lib folder in root installation folder)
* Windows -> Preferences -> Maven -> Installations -> Add -> Maven v3 (root installation folder)
* Help -> Install New Software -> Work With -> http://download.scala-ide.org/sdk/lithium/e47/scala212/stable/site -> Select all & Install
* Help -> Install New Software -> Work With -> http://alchim31.free.fr/m2e-scala/update-site -> Select all & Install
* Restart Eclipse to finish everything
* Windows -> Perspective -> Open Perspective -> Other -> Java
* Windows -> Perspective -> Open Perspective -> Other -> Scala
* Windows -> Perspective -> Open Perspective -> Other -> Git
* In the Git perspective, clone this repo to your local computer
