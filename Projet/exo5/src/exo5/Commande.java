package exo5;
import exo5.Article;
import exo5.Client;
import java.util.Date;

public class Commande {
		int numCommande;
		Date date;
		Client qui ;
		Article tab[];
		int qut[] ; 
		
		Commande(Article tab[])
		{
			this.tab= tab;
		};
}
