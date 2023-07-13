import java.util.InputMismatchException;
import java.util.Scanner;




public class Client {
	private String nom;
	private String prenom ;
	private int codePostal;
	private String adresse ;
	private String ville ;
	public CompteBancaire compte;
	public boolean compteExist = false;
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	
	public String getVille() {
		return this.ville;
	}
	
	public int getCodePostal() {
		return this.codePostal;
	}
	
	public double getCompteSolde() {
		return this.compte.solde;
	}
	

	
	
	
	
	
	Client(String nom, String prenom, String adresse, String ville, int codePostal){ // Constructeur Client avec toute info
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville ;
		this.codePostal = codePostal;
		 
	}
	
	public void creerCompte() {
		 if (this.compteExist == true)
		 {
			 System.out.println("Vous avez déjà un compte");
		 }
		 else	
		 {
			this.compte = new CompteBancaire(0);
			this.compteExist = true;
			 
		 }

	}
	
	public void afficheClient()
	{
		System.out.println(getNom());
		System.out.println(getPrenom());
		System.out.println(getVille());
		System.out.println(getAdresse());
		System.out.println(getCodePostal());
		
	}
	
	public void modifClient() {
		
		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		Scanner post = new Scanner(System.in);
		
		int choix = -1 ;
		System.out.println("Quelle information voulez-vous modifier ?");

		
		try {
			
			while (choix != 0 ) {
				
				System.out.println("1. Nom : " + this.nom );
				System.out.println("2. Prenom : " + this.prenom);
				System.out.println("3. Adresse : " + this.adresse);
				System.out.println("4. Ville : " + this.ville);
				System.out.println("5. Code Postale : " + this.codePostal);
				System.out.println("0. Quitter");
				
				choix = input.nextInt();

				
				switch (choix) {
				case 0 :
					break;
				case 1 :
					System.out.println("Modifier votre nom");
					this.nom = string.nextLine();
					break;
				case 2:
					System.out.println("Modifier votre prenom");
					this.prenom = string.nextLine();
					break;
				case 3:
					System.out.println("Modifier votre adresse");
					this.adresse = string.nextLine();
					break;
				case 4:
					System.out.println("Modifier votre ville");
					this.ville = string.nextLine();
					break;
				case 5:
					System.out.println("Modifier votre code postale");
					this.codePostal = post.nextInt();
					break;		
			}
		}
		} catch(InputMismatchException e )
		{
 			System.out.println("Error " + e);
			System.out.println("choix value " + choix);
			System.out.println("Error " + this.nom);
		}

}
	
}
