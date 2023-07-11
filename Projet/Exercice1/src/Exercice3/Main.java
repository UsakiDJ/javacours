package Exercice3;

import java.util.Random;
import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

public class Main {
	
	


	public static void main(String[] args) {
		
		 Scanner inpt = new Scanner(System.in);
		 Random rand = new Random();
		 Instant timeStart = Instant.now();
		 int nombre = rand.nextInt();
		 int plage = rand.nextInt() ;
		 int input = -1 ;
		 int compteur = 0 ;
		 long duration = 0 ;
		 long min = 0 ;
		 long sec = 0;
		
		while ((plage < 100 )|| (plage > 10001))
		{
			plage = rand.nextInt() ;
		}
		
		while ((nombre < 0 ) ||(nombre > plage) )
		{	
			 nombre = rand.nextInt();
		}
		
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
				System.out.println("Entrez un nombre");
				inpt = new Scanner(System.in);
				input = -1;
				System.out.println(input);
			}


		}
		Instant timeEnd = Instant.now();
		duration = Duration.between(timeStart, timeEnd).getSeconds();
		if (duration > 60)
		{
			sec = duration % 60 ;
			min = (duration / 60) ;
			
		}
		compteur++;
		System.out.println("Vous avez gagné en "+ compteur + " essai(s) et "+ min+ "min " + sec + "s");

	}
		

}
