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
		
		this.compte = new CompteBancaire(0);
		this.compteExist = true;
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
		
		int choix = -1 ;
		System.out.println("Quelle information voulez-vous modifier ?");
		
		System.out.println("1. Nom");
		System.out.println("2. Prenom");
		System.out.println("3. Adresse");
		System.out.println("4. Ville");
		System.out.println("5. Code Postale");
		System.out.println("0. Quitter");
		

		while (choix != 0 ) {
			
			choix = input.nextInt();
			
			switch (choix) {
			
			case 1 :
				this.nom = input.next();
				break;
			case 2:
				this.prenom = input.next();
				break;
			case 3:
				this.adresse = input.next();
				break;
			case 4:
				this.ville = input.next();
				break;
			case 5:
				this.codePostal = input.nextInt();
				break;		
			}
			
		}
		

		
	}
}
