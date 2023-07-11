package Exercice2;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random(); // Créer un objet Random nommé rand
		int nombre[] = new int[3]; // Tableau de 3 entiers
		int modulo[] = {0,0,0}; // Tableau de modulo de 3 entiers
		int nombreEssaie = 0;  // Compteur 
		
		
		while ((modulo[0] != 0) || (modulo[1] != 0) || (modulo[2] != 1) ) { // Boucle tant qu'il ne trouve pas une combinaison pair pair impair 
			
			for (int x = 0 ; x < nombre.length; x++) {
				
				nombre[x] = rand.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000
				modulo[x] = nombre[x]%2 ; // Détermine si le nombre est paire ou impaire
				System.out.println(nombre[x] +" " + modulo[x]);


		}
			nombreEssaie++; // Incrémente le compteur 

				}
		System.out.println("Effectué en " + nombreEssaie + " essais");

	}
}

