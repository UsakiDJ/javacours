package Exercice3;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	


	public static void main(String[] args) {
		
		 Scanner inpt = new Scanner(System.in);
		 Random rand = new Random();
		 int nombre = rand.nextInt();
		 int plage = rand.nextInt() ;
		 int input = -1 ;
		 int compteur = 0 ;
		 System.out.println(input);
		 String error; 
		 
		
		
		while ((plage < 100 )|| (plage > 10001))
		{
			plage = rand.nextInt() ;
		}
		 System.out.println(plage);
		
		while ((nombre < 0 ) ||(nombre > plage) )
		{	
			 nombre = rand.nextInt();
		}
		
		 System.out.println(nombre);
		 System.out.println("Entrez un nombre compris entre 0 et " + plage);
		
		while (input != nombre )
		{
			try {
				 input = inpt.nextInt();
				 
				 if (input > nombre) {
					 System.out.println("Plus petit");
					 compteur++;
				 }
				 else if (input < nombre){ 
					 System.out.println("Plus grand");
					 compteur++;
				 }
			}
			catch(java.util.InputMismatchException err)
			{
				error = err.getMessage();
				System.out.println(error);
				input = inpt.nextInt();
			}


		}
		compteur++;
		System.out.println("Vous avez gagné en "+ compteur + " essai(s)");

	}

}
