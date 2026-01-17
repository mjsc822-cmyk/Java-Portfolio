package act1;

class Book {
	String title;
	String author;
	int year;
	int currentpage;
	
	Book (String t,String a, int y,int cp) {
		
		title = t;
		author=a;
		year=y;
		currentpage=cp;
		
	}
	
	void displayDetails() {
		
		System.out.println("Title: "+title+", Author: "+author+", Year: "+year+", Current Page: "+currentpage);
		
	}
	
	int changePage() {
		
		for(int i = 1; i<=50; i++) {currentpage++;}
		
		return currentpage;
	}
	
}

public class MyBookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
		Book book2 = new Book("The Power of Habit","Charles Duhiggi", 2012, 0);
		Book book3 = new Book("Atomic Habits","James Clear,", 2018, 0);
		Book book4 = new Book("Java Programming","John Doe",2020, 0);
		Book book5 = new Book("Favorite Book","Maximus Lord",2021, 0);
		
		
		book1.displayDetails();
		book2.displayDetails();
		book3.displayDetails();
		book4.displayDetails();
		book5.displayDetails();
		System.out.println("\n");
		book1.changePage();
		book3.changePage();
		book3.changePage();
		book1.displayDetails();
		book3.displayDetails();
		System.out.println("\n");
		book5.changePage();
		book5.changePage();
		book5.changePage();
		book5.displayDetails();
		System.out.println("\n");
		book4.author="Jane Smith";
		book4.displayDetails();
		
		int [] PBook = {book1.year,book2.year,book3.year,book4.year,book5.year};
		String [] ABook = {book1.title,book2.title,book3.title,book4.title,book5.title};
		System.out.println("\n");
		for(int i=0; i<=4; i++) {
			
			if (PBook[i]>2010) {
				
				System.out.println(ABook[i]+", "+PBook[i]);
				
			}
			
		}
		

	}

}
