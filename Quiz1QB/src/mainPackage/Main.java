package mainPackage;
import java.util.Scanner;

/*This program serves to calculate the passer rating of a given quarterback.
 * The formula used is the standard used by the NFL and CFL found at
 * https://en.wikipedia.org/wiki/Passer_rating
 * The program prompts the user for the QB's game statistics, one by one, and then
 * outputs their rating.
 * */

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);				//initialize scanner
		
		System.out.println("Enter the QB's touchdowns. ");	//user inputs touchdowns
		double touchDowns = input.nextDouble();
		
		System.out.println("Enter the QB's total yards. ");	//user inputs yards
		double yards = input.nextDouble();
		
		System.out.println("Enter the QB's interceptions. ");//user inputs interceptions
		double interceptions = input.nextDouble();
		
		System.out.println("Enter the QB's completions. ");	//user inputs completions
		double completions = input.nextDouble();
		
		System.out.println("Enter the QB's passes attempted. ");//user inputs attempts
		double attempts = input.nextDouble();
		
		input.close();
		double rating = calculateRating(touchDowns, yards,interceptions, completions, attempts);
		System.out.print("This QB's passer rating is: "); 
		System.out.printf("%.2f",rating); 					//two decimal place accuracy
	}
	
	private static double calculateRating(double touchDowns, double yards,
			double interceptions, double completions, double attempts){
		
		double a = ((completions/attempts - .3)*5); 		//formula given online
		double b = ((yards/attempts - 3)*.25);
		double c = ((touchDowns/attempts)*20);
		double d = (2.375 - (interceptions/attempts)*25);

		return (((a+b+c+d)/6)*100);
	}

}
