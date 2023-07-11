package exo5;
import exo5.Article;
import exo5.Client;
import exo5.Commande;

public class Main {

	public static void main(String[] args) {
		
		Article test = new Article("Vêtement", "Chaussette", 50);
		Client client1 = new Client("Dupont", "Michel","58 rue de la République", "Paris", 75111);
		System.out.println(test.getDes());
		System.out.println(test.getPrix() + "€");
		System.out.println(test.getRef());
		test.setPrix(70);
		System.out.println(test.getPrix() + "€");
		client1.afficheClient();
		Commande com = new Commande(tab[100]);
		com.tab[0] = new Article("Vêtement", "Chaussette",50);
		com.tab[1] = new Article("Vêtement","Tee-Shirt",70);
		System.out.println(com.tab[1]);

		

	}

}
