package Exercice;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String [] mailArrow = {"jpp@sfr.fr",
		"tom@gmail.com",
		"fred@sfr.fr",
		"victor@sfr.fr",
		"chris@sfr.fr",
		"robber@orange.fr",
		"paul@sfr.fr",
		"lise@gmail.com",
		"thierry@isitech.fr",
		"marie@isitech.fr",
}; 

		//System.out.println(mailArrow[1]);
		final int TAILLE = 100; 
		String[] mailSplit = new String[TAILLE];
		 mailSplit = mailArrow[1].split("@") ;
		//System.out.println(mailSplit[1]);
		//int nombreMail[];
		String[] extension = new String[200] ;
		mailSplit = mailArrow[2].split("@");
		//System.out.println(mailSplit[1]);
		String uniqueExtension[] = null ;
		
		
		for (int x = 0; x < mailArrow.length; x++) {
			mailSplit = mailArrow[x].split("@");
			extension[x] = mailSplit[1] ;
			System.out.println(extension[x]);
			
			};
			
		for (int x = 0; x < extension.length; x++ )
		{
			uniqueExtension[x] = "";
			if (uniqueExtension[x].equals(extension[x]) )
			{
				break;
			}
			else
			{
				uniqueExtension[-1] = extension[x];
				System.out.println(uniqueExtension[x]);
			}
		}
	}
	

}
