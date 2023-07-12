package exo5;


public class Main {

	public static void main(String[] args) {
 		
		Article test = new Article("Vêtement", "Chaussette", 50);
		Client client1 = new Client("Dupont", "Michel","58 rue de la République", "Paris", 75111);
		//System.out.println(test.getDes());
		//System.out.println(test.getPrix() + "€");
		//System.out.println(test.getRef());
		test.setPrix(70);
		//System.out.println(test.getPrix() + "€");
		// client1.afficheClient();
		Commande com = new Commande();
		com.tab[0] = new Article("Vêtement", "Chaussette",50);
		com.tab[1] = new Article("Vêtement","Tee-Shirt",70);
		//System.out.println(com.tab[1].getRef());
		com.qui = new Client ("Dupont", "Françoise","90 rue de la République", "Paris", 75111);
		//com.qui.afficheClient();
		System.out.println(com.date);
		Commande com2 = new Commande(5, test, client1 );
		//System.out.println(com2.qut[1]);
		System.out.println(com2.tab[0].getDes());
		com2.ajoutCommande(3, new Article("Vêtement", "Chaussette",50));// Permet d'ajouter un nouvel article à la commande
		//System.out.println(com2.tab[1].getDes());
		com2.qui.afficheClient();
		System.out.println(com2.qut[1]);
		System.out.println(com2.tab[1].getDes());
		System.out.println(com2.date); 

		

	}

}
