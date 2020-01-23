
import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter price ");
		
		double price = in.nextDouble();
		
		System.out.println(" Enter money given ");
		
		double money = in.nextDouble();
		
		System.out.println(" price: " + price + '\n'+" your money: "+ money);
	
		returnChange(money,price);
		
		in.close();
		
	} public static void returnChange(double cash, double total) {
		
      	int change = (int)((cash - total)*100);
      	
     	int dollar = change / 100; 
		change = change - dollar * 100;
		
		int quarters = change / 25;
        change = change - quarters * 25;
        
       
		int dimes = change / 10  ;		
		change = change - dimes * 10;
		
		
	    int nickels = change /5 ;
	    change = change - nickels *5;
	    
	   
		int pennies = change;
		
		        
	if ( dollar >= 1) {
		
		System.out.println(" Dollars " + dollar );
		}
	if( quarters >= 0.25) {
				
		System.out.println(" Quarters " + quarters);
			}
	if( dimes >= 0.10)		
		
		 System.out.println(" Dimes " + dimes);
	
	if(nickels >= 0.05)
		
		 System.out.println(" Nickels " + nickels); 
	
	if(pennies >= 0.01)
		
		System.out.println(" Pennies " + pennies);



	}

		
	}
