import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		int choix = -1 ;
		Scanner inpt = new Scanner(System.in);
		Client client = new Client("Dupont", "Michel","83 rue de la république","Paris", 74201);
		
		while (choix != 0)
			
		{
			System.out.println("Que souhaitez-vous faire ?");
			
			System.out.println("1. Créer un compte");
			System.out.println("2. Accéder à votre compte");
			System.out.println("3. Modifier vos informations personnelles");
			System.out.println("4. Afficher vos informaions personnelles");
			System.out.println("0. Quitter");
 
			choix = Integer.parseInt(inpt.nextLine());
			
			switch (choix) {
			case 0 : 
				inpt.close();
				break;
			case 1 : 
				client.creerCompte();
				break;
			case 2 : 
				if(client.compteExist == true)
				{
					client.compte.accederCompte();
				}
				else
				{
					System.out.println("Vous n'avez pas de compte");
				}
				break;
			case 3 :
				client.modifClient();
				break;
			case 4 :
				client.afficheClient();
				break;
				
			}
		}

		
		
	}

}
