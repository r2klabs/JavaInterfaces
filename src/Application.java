/**
 * This class represents a racehorse, 
 * @author Robert Kelley
 * @version 0.1
 * Programming Problem 2
 * Summer 2022
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Animal a = new RaceHorse();
		//RaceHorse b = new Animal();
		
		RaceHorse h1 = new RaceHorse("Winning Colors",HennekeScore.MODERATELYFLESHY, 1100, 68);
		RaceHorse h2 = new RaceHorse("Authentic", HennekeScore.MODERATELYFLESHY, 1120, 64);
		
		int c = h1.compareTo(h2);
		System.out.println(c);
		
		h1.move(50);
			
		Scanner input = new Scanner(System.in);
		
		RaceHorse horses[] = new RaceHorse[3];
		
		for(int i=0;i<horses.length;i++) {
			
			input.nextLine();
			
			System.out.print("Enter Horse Name: ");
			String name = input.nextLine();
		
			
			System.out.print("Enter Weight: ");
			int w = input.nextInt();
			
			System.out.print("Enter Height: ");
			int h = input.nextInt();
			
			horses[i] = new RaceHorse(name, HennekeScore.MODERATE,w , h);
			
		
		}//end for
		
		ArrayList<RaceHorse> racehorses = new ArrayList<RaceHorse>();
	
		
		
		racehorses.add(new RaceHorse("Winning Colors",HennekeScore.MODERATELYFLESHY, 1100, 68));
		racehorses.add(h2);
		
	
				
	}//end main

}//end class
