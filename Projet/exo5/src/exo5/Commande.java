package exo5;
import java.util.Date;

public class Commande {
		int numCommande;
		Date date;
		Client qui ;
		Article tab[];
		int qut[]; 
		
		Commande() {
			this.tab = new Article[100];
			this.qut = new int[100];
			this.date = new Date();

		}
		
		
		Commande(int qut, Article tab, Client qui) {
			this.tab = new Article[100];
			this.tab[0] = tab;
			this.qut = new int [100];
			this.qut[0] = qut;
			this.date = new Date();
			this.qui = qui;

		}
		
		public void ajoutCommande(int qt, Article test) {
			boolean y = true ;
			int compteur = 0;
			
			while ( y == true )
			{
				
				
				if( this.tab[compteur] != null) {
					
					compteur++;
					
				}
				else {
					
					this.tab[compteur] = test;
					this.qut[compteur] = qt;
					y = false;
					
				}
				
			}

		}
		
		
		

}
