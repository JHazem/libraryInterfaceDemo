package com.perscholas.libraryInterface;
 

public class LibraryInterfaceDemo {
 
	
	public static void main(String[] args) {
 
		// Case 1
			KidUser kids1 = new KidUser(10, "Kids");
			KidUser kids2 = new KidUser(18, "Fiction");
			
			kids1.registerAccount();
			kids1.requestBook();
			
			kids2.registerAccount();
			kids2.requestBook();
 				
		// Case 2
			AdultUser adult1 = new AdultUser(5, "Kids");
			AdultUser adult2 = new AdultUser(23, "Fiction");
			
			adult1.registerAccount();
			adult1.requestBook();
			
			adult2.registerAccount();
			adult2.requestBook();
 	} 
}

 

	// 1- Create an interface LibraryUser with the following methods declared,
	interface LibraryUser {
 
        void registerAccount();
        void requestBook();
                
}

 
	//2. Create classe “KidUsers” which implement the LibraryUser interface.
 
	 class KidUser implements LibraryUser {
		int age;
		String bookType;

		public KidUser(int age, String bookType) {
			this.age = age;
			this.bookType = bookType;
		}

		// The methods in the KidUser class should perform the following logic.
		@Override
		public void registerAccount() {

			if (age <= 11) {
				System.out.println("You have successfully registered under a Kids Account");
			} else if (age > 11) {
				System.out.println("Sorry, Age must be less than 12 to register as a kid");
			}

		}

		@Override
		public void requestBook() {

			if (bookType.equals("Kids")) {
				System.out.println(" Issued successfully, please return the book within 10 days");
			} else
				System.out.println("Oops, you are allowed to take only kids books");
		}

	}
	// 2- Create classe “AdultUser” which implement the LibraryUser interface.
	 
	 class AdultUser implements LibraryUser {
		int age;
		String bookType;

		public AdultUser(int age, String bookType) {
			this.age = age;
			this.bookType = bookType;
		}

		// The methods in the AdultUser class should perform the following logic.
		@Override
		public void registerAccount() {

			if (age >= 12) {
				System.out.println("You have successfully registered under an Adult Account");
			} else if (age <= 11) { 
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
		}

		@Override
		public void requestBook() {

			if (bookType.equals("Fiction")) {
				System.out.println("Book Issued successfully, please return the book within 7 days");
			} else
				System.out.println("Oops, you are allowed to take only adult Fiction books");

		}
	}
 
