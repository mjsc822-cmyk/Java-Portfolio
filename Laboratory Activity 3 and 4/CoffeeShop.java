package activities;
import java.util.Scanner;
class Customer{
	 String name;
	 int points;
	static int totalCustomers;
	
	Customer(String a,int points, int tCustomers) {	
		
		name=a;		this.points=points;	
		totalCustomers=tCustomers;
	}

	
	int addPoints() {
			Scanner choice = new Scanner(System.in);
			int muffin = 30;
			int latte = 50;
			int water = 20;
			System.out.println("Hi! "+name);
			System.out.println("What do you want to buy?: \n1.Muffin\n2.Latter\n3.Water");
			System.out.println("--------------------------------------------------------------------------------------------");
			String bought = choice.next();
			
			if (bought.equalsIgnoreCase("1")) {
				points=points+muffin;
				System.out.println(name+" earned "+muffin+" points. Total points: "+points);
				totalCustomers++;
				return points+muffin;
			
			}
			else if(bought.equals("2")) {
				points=points+latte;
				System.out.println(name+" earned "+latte+" points. Total points: "+points);
				totalCustomers++;
				return points+latte;
				
			}
			
			else if(bought.equals("3")) {
				points=points+water;
				System.out.println(name+" earned "+water+" points. Total points: "+points);
				totalCustomers++;
				return points+water;
			}
			
			else {
				System.out.println("Invalid order!");
				return points+0;
				
			}
			
			
			
	}
	int redeemReward() {
		
		if(points>=100) { 
			
			System.out.println("Congratulation! "+name+"! You redeemed a free drink!");
			
			points = points-100;
			System.out.println("Remaining points: "+points);
			
			return points-100;
		}
		
		else if(points<100) {
			
			System.out.println(name+" does not have enough points to redeem a drink.");
			
			return points+0;
			
		}
		
		else {return points+0;}
		
	}
	void displayCustomerInfo() {	
		System.out.println("Customer: "+name+"\nPoints: "+points); 
		System.out.println("------------------------------------");
		
	}
	static void displayTotalCustomers() {
			
		System.out.println("Total Registered Customers: "+totalCustomers);
		}
	static void getAllowedRewardsRedemption(int a,String b) {
		
		double remaingr;
		
		if(a>=100) {
		remaingr = a*0.01;
		int result = (int) remaingr;
		System.out.println(b+" can redeem "+result+" reward(s).");
		
	} 
		else if (a<100 ) {
			
			System.out.println(b+" can redeem 0 reward(s).");
			
		}
		else { 		System.out.println();			}
		
		
	}
	
	
	void passMethod() {		getAllowedRewardsRedemption(points,name);}	
	
}

public class CoffeeShop {
	 public static void main(String[] args) {
	Scanner respond = new Scanner (System.in);
	Customer c1 = new Customer("",200,0);
	Customer c2 = new Customer("",0,0);
	Customer c3 = new Customer("",0,0);
	Customer c4 = new Customer("",0,0);
	
do {
	System.out.println("--------------------------------------------------------------------------------------------");
	System.out.println("Welcome to our Coffee Shop! What's your name?: \n1. Joseph\n2. Peter\n3. Diane\n4. Unknown");
	System.out.println("--------------------------------------------------------------------------------------------");
	String name = respond.nextLine();	
	System.out.println("Do you want to order or redeem some reward? \n1. Order\n2. Redeem\n3. Show customer’s information and the total number\n4. Check Remaining Points");
	System.out.println("--------------------------------------------------------------------------------------------");
	String option = respond.nextLine();
	
	
	switch(option) {
	
		case "1" : 
			if (name.equalsIgnoreCase("Joseph") || name.equals("1")) {
				c1.name="Joseph";
				
				c1.addPoints();
				break;
			}
			else if (name.equalsIgnoreCase("Peter") || name.equals("2")) {
				c2.name = "Peter";
				c2.addPoints();
				break;
			}

			else if (name.equalsIgnoreCase("Unknown") || name.equals("4")) {
				c3.name = "Unknown";
				c3.addPoints();
				break;
			}
			else if (name.equalsIgnoreCase("Diane") || name.equals("3")) {
				c4.name = "Diane";
				c4.addPoints();
				break;
			}
			
			else { 
				System.out.println("Sorry but, your name is not in the list."); 
				System.out.println("Name on the list: \n1. Joseph\n2. Peter\n3. Diane\n4. Unknown");
				System.out.println("\nType any letter or number to continue...");
				respond.nextLine();
				break;
				}
		
		case "2" : 

			if (name.equalsIgnoreCase("Joseph") || name.equals("1")) {
				c1.name="Joseph";
				c1.redeemReward();
				break;
			}
			else if (name.equalsIgnoreCase("Peter") || name.equals("2")) {
				c2.name = "Peter";
				c2.redeemReward();
				break;
			}

			else if (name.equalsIgnoreCase("Unknown") || name.equals("4")) {
				c3.name = "Unknown";
				c3.redeemReward();
				break;
			}
			else if (name.equalsIgnoreCase("Diane") || name.equals("3")) {
				c4.name = "Diane";
				c4.redeemReward();
				break;
			}
			
			else { 
				System.out.println("Sorry but, your name is not in the list."); 
				System.out.println("Name on the list: \n1. Joseph\n2. Peter\n3. Diane\n4. Unknown");
				System.out.println("\nType any letter or number to continue...");
				respond.nextLine();
				break;
				}

		case "3": 
			   System.out.println("=== Customer Information ===");
			   if (!c1.name.isEmpty()) {	c1.displayCustomerInfo();	}
			   if (!c2.name.isEmpty()) {	c2.displayCustomerInfo();	}
			   if (!c3.name.isEmpty()) {	c3.displayCustomerInfo();	}
			   if (!c4.name.isEmpty()) {	c4.displayCustomerInfo();	}
			   Customer.displayTotalCustomers();
			   break;
		case "4" : 
				System.out.println("=== Remaining Reward Point ===");
			   if (!c1.name.isEmpty()) {	c1.passMethod();	}
			   if (!c2.name.isEmpty()) {	c2.passMethod();	}
			   if (!c3.name.isEmpty()) {	c3.passMethod();	}
			   if (!c4.name.isEmpty()) {	c4.passMethod();	}
			   
			   break;
				   
				   
		default : 
	}

 }while(true);
	 }
}
