import java.util.Scanner;

public class CompteBancaire {
	
	public double solde;
	public double historique[];
	
	CompteBancaire(double solde){
		this.solde = solde; 
		this.historique = new double[100];
	}
	
	
	public void retirerDeposerArgent(int x) { // Negatif pour retirer / Positif pour déposer
		
		this.solde = this.solde + x ;
		int compteur = 0 ; 
		
		while(historique[compteur] != 0) {
			
			compteur++;
		}
		
		historique[compteur] = x;
		
		
	}
	
	
	public void afficheHistorique(){
		
		for (int x = 99; x >= 0 ; x-- ) {
			if (historique[x] != 0)
			{
				System.out.println(historique[x]);
			}

		}
		
	}
	
	public int verifInput(int x) {
		Scanner input = new Scanner(System.in);
		while (x <= 0) {
			System.out.println("Entrez une valeur supérieur à 0 ");
			x = input.nextInt();
			
		}
		return x; 
	}
	
	public void accederCompte() {
		
		Scanner input = new Scanner(System.in);
		
		int choix = -1 ;
		System.out.println("Que souhaitez-vous faire ?");
		
		System.out.println("1. Consulter mon solde");
		System.out.println("2. Deposer de l'argent");
		System.out.println("3. Retirer de l'argent");
		System.out.println("4. Voir mon historique des opérations");
		System.out.println("0. Quitter");
		

		while (choix != 0 ) {
			
			choix = input.nextInt();
		switch(choix) {
		
		case 1: 
			System.out.println(this.solde);
			break;
		case 2 :
			int x = 0; 
			System.out.println("Combien souhaitez-vous déposer ?");
			x = input.nextInt();
			x = this.verifInput(x);
			this.retirerDeposerArgent(x);
			System.out.println("Votre nouveau solde:  "+ this.solde);
			break;
			
		case 3 : 
			int y= 0; 
			System.out.println("Combien souhaitez-vous retirer ?");
			y = input.nextInt();
			y = this.verifInput(y);
			y = -y;
			this.retirerDeposerArgent(y);
			System.out.println("Votre nouveau solde:  "+ this.solde);
			break;
		case 4 :
			this.afficheHistorique();
			break;
			
		case 0 :
			break;
		
		}
		
	}
	
	
	

}
	
}
