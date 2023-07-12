import java.io.IOException;

public class Main {

	public static void main(String[] args)  {
		Client client = new Client("Dupont", "Michel","83 rue de la république","Paris", 74201);
		client.afficheClient();
		client.modifClient();
		client.afficheClient();
	//	client.creerCompte();
	//	System.out.println(client.compte.solde);
		//client.compte.retirerDeposerArgent(500);
	//	client.compte.retirerDeposerArgent(600);
		//client.compte.afficheHistorique();
		//System.out.println(client.compte.solde);
		
		
		
	}

}
