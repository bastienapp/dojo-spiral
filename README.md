# Spirale

Le but de ce kata est de dessiner une spirale dans le sens inverse des aiguilles d'une montre.
Eans une grille comprenant N lignes et N colonnes (où N est un entier impair), en plaçant le premier point au centre, vous devez tourner à gauche à chaque fois que cela est possible, bien sûr sans sortir de la grille.

Dans la grille a retourner, chaque trait sera représenté par un 1, et le reste par des 0.

Tout cela peut sembler un peu complexe, mais c'est plus clair avec les dessins ci-dessous (pour plus de lisibilité, à gauche la représentation graphique, et à droite le résultat attendu).

	N=3
	╔═════╗ 
	║ ... ║ 	{0,0,0},
	║ ┌─. ║  	{1,1,0},
	║ │.. ║ 	{1,0,0}
	╚═════╝

	N=5
	╔═══════╗
	║ ────┐ ║ 	{1,1,1,1,1},
	║ ....│ ║ 	{0,0,0,0,1},
	║ .┌─.│ ║ 	{0,1,1,0,1},
	║ .│..│ ║ 	{0,1,0,0,1},
	║ .└──┘ ║ 	{0,1,1,1,1}
	╚═══════╝

	N=9
	╔═══════════╗
	║ ────────┐ ║ 	{1,1,1,1,1,1,1,1,1},
	║ ........│ ║ 	{0,0,0,0,0,0,0,0,1},
	║ .┌────┐.│ ║ 	{0,1,1,1,1,1,1,0,1},
	║ .│....│.│ ║ 	{0,1,0,0,0,0,1,0,1},
	║ .│.┌─.│.│ ║ 	{0,1,0,1,1,0,1,0,1},
	║ .│.│..│.│ ║ 	{0,1,0,1,0,0,1,0,1},
	║ .│.└──┘.│ ║ 	{0,1,0,1,1,1,1,0,1},
	║ .│......│ ║ 	{0,1,0,0,0,0,0,0,1},
	║ .└──────┘ ║ 	{0,1,1,1,1,1,1,1,1}
	╚═══════════╝

	N=11
	╔═════════════╗
	║ ........... ║ 	{0,0,0,0,0,0,0,0,0,0,0},
	║ ┌────────┐. ║ 	{1,1,1,1,1,1,1,1,1,1,0},
	║ │........│. ║ 	{1,0,0,0,0,0,0,0,0,1,0},
	║ │.┌────┐.│. ║ 	{1,0,1,1,1,1,1,1,0,1,0},
	║ │.│....│.│. ║ 	{1,0,1,0,0,0,0,1,0,1,0},
	║ │.│.┌─.│.│. ║ 	{1,0,1,0,1,1,0,1,0,1,0},
	║ │.│.│..│.│. ║ 	{1,0,1,0,1,0,0,1,0,1,0},
	║ │.│.└──┘.│. ║ 	{1,0,1,0,1,1,1,1,0,1,0},
	║ │.│......│. ║ 	{1,0,1,0,0,0,0,0,0,1,0},
	║ │.└──────┘. ║ 	{1,0,1,1,1,1,1,1,1,1,0},
	║ │.......... ║ 	{1,0,0,0,0,0,0,0,0,0,0}
	╚═════════════╝

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar SpiralTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SpiralTest
