package activities;

import java.util.Scanner;
public class Act1 {

	public static void addbook(String [] added, String [] availability) { 
	Scanner receive = new Scanner(System.in);
	
	
	System.out.print("Enter the title of the 1st book: ");
	added[0] = receive.next();
	availability[0] = "Available"; 
	System.out.println("The book: "+added[0]+" has been registered. The book code number is:(0)\n");
	System.out.print("Enter the title of the 2nd book: ");
	added[1] = receive.next();
	availability[1] = "Available"; 
	System.out.println("The book: "+added[1]+" has been registered. The book code number is:(1)\n");
	System.out.print("Enter the title of the 3rd book: ");
	added[2] = receive.next();
	availability[2] = "Available"; 
	System.out.println("The book: "+added[2]+" has been registered. The book code number is:(2)\n");
	System.out.print("Enter the title of the 4th book: ");
	added[3] = receive.next();
	availability[3] = "Available"; 
	System.out.println("The book: "+added[3]+" has been registered. The book code number is:(3)\n");
	System.out.print("Enter the title of the 5th book: ");
	added[4] = receive.next();
	availability[4] = "Available"; 
	System.out.println("The book: "+added[4]+" has been registered. The book code number is:(4)\n");
	System.out.println("5 Books Successfully Added.\n");
	System.out.println("Type any letter or number to continue..\n");
	String signal = receive.next();
	
	}
	public static void updatebookstatus(String [] added,String [] availability) {	
		Scanner receive = new Scanner(System.in);
		int bcode;
		boolean valid = false;
	
do {		
		System.out.println("Enter the number code() of the book.");
		
		if (receive.hasNextInt()) {bcode = receive.nextInt();
			if (bcode >=0 && bcode <=4) {break;}
			else {System.out.println("Error! Invalid Book Number.\n");}
			
		}
		
		else if (!receive.hasNextInt())
	       { System.out.println("Error! Invalid Book Number.\n");
			receive.next();	} 
		
		}while (true);	
		
while(true) {	
		if(bcode==bcode) 
		{  
			System.out.println("Book: "+added[bcode]+" is "+availability[bcode]+".");
			System.out.println("-Type '1' if its Available or '2' if Borrowed-");
		}	
			if (receive.hasNextInt())
			{	int resp = receive.nextInt();
				if (resp ==1) { availability[bcode] = "Available"; break;}
				else if (resp ==2) {	availability[bcode] = "Borrowed"; break;}
				else {System.out.println("Error! Input '1' or '2' only.\n");}	
				
			}
			else if (!receive.hasNextInt()) 
			{ System.out.println("Error! Input '1' or '2' only.\n"); receive.next(); 
			}
	}	
			System.out.println("The book: "+added[bcode]+" is now "+availability[bcode]+"\n");
			System.out.println("Type any letter or number to continue..\n");
			String signal = receive.next();
} 
	
	public static void showBooks(String [] added,String [] availability)
	{
		Scanner receive = new Scanner(System.in);
		for (int i=0; i<=4; i++) { System.out.println("-The book: "+added[i]+ " is "+availability[i]+"\n");}
		System.out.println("Type any letter or number to continue..\n");
		String signal = receive.next();
	}
	
	public static void generateReport(String [] added,String [] availability) 
	{	
		 Scanner receive = new Scanner(System.in);
		 String avail = "Available";
		 String bor = "Borrowed";
		 int count = 0;
		 System.out.println("Total number of books registered: "+added.length);
		for (String found: availability)
		 { if (found != null && found.equalsIgnoreCase(avail)) {count++;} }
		 	System.out.println("Total number of available books: "+count);
		 	count=0;
		for (String found: availability)
		 { if (found != null && found.equalsIgnoreCase(bor)) {count++;} }
			System.out.println("Total number of borrowed books: "+count+"\n");
			System.out.println("Type any letter or number to continue..\n");
			String signal = receive.next();
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receive = new Scanner(System.in);
		boolean off = false;
		String [] databok = new String[5];
		String [] status = new String[5];
		int enduser;
		
		while(true) {
				System.out.println("< Library Book Management System >\n");
				System.out.println("1. Add Book");
				System.out.println("2. Update Book Status");
				System.out.println("3. Show All Books");
				System.out.println("4. Generate Report");
				System.out.println("5. Exit");	
				System.out.print("\nInput the number of your chosen option: ");
			
				enduser = receive.nextInt();
				
			switch (enduser) 
				{
				case 1:
					System.out.println("1. Add Book\n");
					addbook(databok, status);
					break;
				case 2:
					System.out.println("2. Update Book Status\n");
					updatebookstatus(databok, status);
					break;
				case 3:
					System.out.println("3. Show All Books\n");
					showBooks(databok, status);
					break;
				case 4:
					System.out.println("4. Generate Report\n");
					generateReport(databok, status);
					break;
				case 5:
					System.out.println("\nProgram Terminated...\n");
					return;
					
				default:
					System.out.println("\nINVALID OPTION NUMBER! TYPE ANY KEY TO CONTINUE...\n");
					String signal = receive.next();
				}
			
		}
		

	}

} 
