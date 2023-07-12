package exo5;

public class Client {
	String nom;
	String prenom;
	String adresse;
	int codePostal;
	String ville;
	
	Client(String nom, String prenom, String adresse, String ville, int codePostal){
		
		this.nom = nom ;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public void afficheClient() {
		System.out.println(this.nom +" " + this.prenom +" "+ this.adresse +" "+ this.ville + " " +this.codePostal);
		
	}
	
}
