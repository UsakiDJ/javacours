
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
	
	
	

}
