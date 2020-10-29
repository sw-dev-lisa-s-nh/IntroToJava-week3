package com.lisasmith.week3;

public class App {

	public static void main(String[] args) {

		/* Requirement 1
		 * Create an array of int called ages that contains the 
		 * following values:  3,9,23,64,2,8,28,93.
		 */
		
		System.out.println("--------------------------------------");		
		System.out.println("Intro To Java Week 3 Coding Assignment");
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Requirement 1:");
		System.out.println("--------------");
		int[] ages = {3,9,23,64,2,8,28,93};
		System.out.print("Elements in the ages array are: ");
		for (int i=0; i<ages.length; i++) {
			System.out.print(ages[i] + " "); 			
		}
		System.out.println();
		System.out.println();

		/* Requirement 1(a)
		 * Programmatically subtract the value of the first element in 
		 * the array from the value in the last element of the array
		 * (i.e. do not use "ages[7]" in your code).
		 * Print the result to the console.
		 */
		int diffOfAges = ages[ages.length-1]- ages[0];
		System.out.println("Requirement 1(a):");
		System.out.println("------------------");
		System.out.println("The first array element is: " + ages[0]);
		System.out.println("The last array element is: " + ages[ages.length-1]);
		System.out.println();
		System.out.println("The difference in the ages array between");
		System.out.println("  the last array element & the first array element is: "+ diffOfAges);
		System.out.println();
		System.out.println();

		/* Requirement 1(b)
		 * Add a new age to your array and repeat the step above
		 * to ensure that it is dynamic (works for arrays of 
		 * different lengths).
		 */
		int[] ages2 = {3,9,23,64,2,8,28,93,100};
		int diffOfAges2 = ages2[ages2.length-1]- ages2[0];
		
		System.out.println("Requirement 1(b):");
		System.out.println("------------------");
		
		System.out.print("Elements in the ages2 array are: ");
		for (int i=0; i<ages2.length; i++) {
			System.out.print(ages2[i] + " "); 			
		}
		System.out.println();
		System.out.println();
		System.out.println("The first array element is: " + ages2[0]);
		System.out.println("The last array element is: " + ages2[ages2.length-1]);
		System.out.println();
		System.out.println("The difference in the ages2 array (e.g. the ages array plus one element)");
		System.out.println("  between the last array element & the first array element is: "+ diffOfAges2);
		System.out.println();
		System.out.println();

		/* 
		 * Requirement 1(c)
		 * Use a loop to iterate through the array and calculate the average age. 
		 * Print the result to the console.
		 */
		
		int sumAge = 0;
		int averageAge = 0;
		for (int num : ages ) {
			sumAge += num;
		}
		averageAge = sumAge/ages.length;	
		System.out.println("Requirement 1(c):");
		System.out.println("------------------");
		System.out.print("The average of all of the elements in the ages array is: ");
		System.out.println(averageAge);
		System.out.println();
		
		/* 
		 *  Do the same calculation for the ages2 array
		 */		
		sumAge = 0;
		int averageAge2 = 0;
		for (int num : ages2 ) {
			sumAge += num;
		}
		averageAge2 = sumAge/ages2.length;	
		System.out.print("The average of all of the elements in the ages2 array is: ");
		System.out.println(averageAge2);
		System.out.println();
		System.out.println();
				
		/* Requirement 2.
		 * Create an array of String called names that contains the following values:  
		 * "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
		 */
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		System.out.println("Requirement 2:");
		System.out.println("--------------");
		System.out.print("The length of the names array is: ");
		System.out.println(names.length);
		System.out.print("The names in the names array are: ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		/* Requirement 2(a)
		 * Use a loop to iterate through the array and  
		 * calculate the average number of letters per name 
		 * Print the result to the console.
		 */
		 
		int sum = 0;
		int avgLengthOfName = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		avgLengthOfName = sum/names.length;
		
		System.out.println("Requirement 2(a):");
		System.out.println("------------------");
		System.out.print("The average number of letters per name in the names array is: ");
		System.out.println(avgLengthOfName);
		System.out.println();
		System.out.println();
		
		/* Requirement 2(b)
		 * Use a loop to iterate through the array again &
		 * concatenate all the names together, separated by spaces, &
		 * print the results to the console.
		 */

		String concatenatedName = "";
		for (String name : names) {
			concatenatedName += (name + " ");	
		}
		System.out.println("Requirement 2(b):");
		System.out.println("------------------");
		System.out.print("The concatenation of the elements in the names array with spaces is: ");
		System.out.println(concatenatedName);
		System.out.println();
		System.out.println();
	
		
		/* Requirement 3
		 * How do you access the last element of any array?
		 */		
		int lastAgeOfAges = ages[ages.length-1]; 
		String lastNameOfNames = names[names.length-1]; 
		System.out.println("Requirement 3:");
		System.out.println("--------------");
		System.out.println("Using our declared arrays, ages & names; and");
		System.out.println("    the index <arrayName>[arrayName.length-1]");
		System.out.println("---------------------------------------------");
		System.out.println("The last element of the ages array is: " + lastAgeOfAges);
		System.out.println("The last element of the names array is: " + lastNameOfNames);
		System.out.println();
		System.out.println();
		
		/* Requirement 4
		 * How do you access the first element of any array?
		 */
		int firstAgeOfAges = ages[0]; 
		String firstNameOfNames = names[0]; 		
		System.out.println("Requirement 4:");
		System.out.println("--------------");
		System.out.println("Using our declared arrays, ages & names;");
		System.out.println("     and the index <arrayName>[0]");
		System.out.println("-----------------------------------------");		
		System.out.println("The first element of the ages array is: " + firstAgeOfAges);
		System.out.println("The first element of the names array is: " + firstNameOfNames);
		System.out.println();
		System.out.println();

		
		/* Requirement 5
		 * Create a new array of int called nameLengths.  
		 * Write a loop to iterate over the previously created names array &
		 * add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		for (int i=0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("Requirement 5:");
		System.out.println("--------------");
		System.out.print("The elements in the nameLengths array are: ");
		for (int i=0; i<nameLengths.length; i++) {
			System.out.print(nameLengths[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		
	
		/* Requirement 6
		 * Write a loop to iterate over the nameLengths array & 
		 * calculate the sum of all the elements in the array.  
		 * Print the result to the console.
		 */
		
		int sumOfNameLengths = 0;
		for (int num : nameLengths) {
			sumOfNameLengths += num;
		}
		System.out.println("Requirement 6:");
		System.out.println("--------------");
		System.out.println("The sum of all of the elements "
				+ "in the nameLengths array is:  " + sumOfNameLengths);
		System.out.println();
		System.out.println();
	
		
		/* Requirement 7
		 * Write a method that takes a String, word and an int, n, 
		 * as arguments and returns the word concatenated to itself 
		 * n number of times.(i.e. if I pass in "Hello" and 3, I would
		 * expect the method to return "HelloHelloHello").
		 */
		System.out.println("Requirement 7:");
		System.out.println("--------------");
		System.out.println("The following method takes input of a String, word & an int,");
		System.out.println("     n, and returns the word concatenated to itself n times.");
		System.out.println("------------------------------------------------------------");

		String inputString = "Hello";
		int inputNum = 3;
		System.out.println("Input variables: " + inputString + " & " + inputNum);
		System.out.println("Output of method multiplyConcat is: " + multiplyConcat (inputString, inputNum));
		System.out.println();
		
		inputString = "Goodbye";
		inputNum = 5;
		System.out.println("Input variables: " + inputString + " & " + inputNum);
		System.out.println("Output of method multiplyConcat is: " + multiplyConcat (inputString, inputNum));
		System.out.println();
		System.out.println();
	
			
		/* Requirement 8
		 * Write a method that takes two Strings, firstName and last Name,
		 * and returns a full name (the full name should be the first and
		 * last name as a String separated by a space). 
		 */
		
		String firstName = "Mickey";
		String lastName = "Mouse";
		
		System.out.println("Requirement 8:");
		System.out.println("--------------");	
		System.out.println("The first name is: " + firstName);
		System.out.println("The last name is: " + lastName);	
		System.out.println("Output of method createFullName is: " +  createFullName (firstName, lastName));
		System.out.println();
		System.out.println();
		
		/* Requirement 9
		 * Write a method that takes an array of int and returns true if 
		 * the sum of all the ints in the array is greater than 100.
		 */
	
		int[] numArray = {60,3,7,25,88,71,3};
		int[] numNewArray = {1,2,3,4,5,6,7,8,9,10}; 
		
		System.out.println("Requirement 9:");
		System.out.println("--------------");	
	
		System.out.print("The elements in numArray are: ");
		for (int i = 0; i<numArray.length; i++) {
			System.out.print(numArray[i]+" ");
		}
		System.out.println();
		
		System.out.print("Does the sum of elements in numArray equal more than 100? ");
		if (isGreaterThanOneHundred(numArray)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}		
		System.out.println();
		
		System.out.print("The elements in numNewArray are: ");
		for (int i = 0; i<numNewArray.length; i++) {
			System.out.print(numNewArray[i]+" ");
		}
		System.out.println();	
		System.out.print("Does the sum of elements in numNewArray equal more than 100? ");
		if (isGreaterThanOneHundred(numNewArray)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println();
		
		
		/* Requirement 10
		 * Write a method that takes an array of double &
		 * returns the average of all the elements in the array.
		 */
		
		double[] pricesOfItems = {2.00, 4.00, 3.45, 7.75, 3.25, 9.99};
		System.out.println("Requirement 10:");
		System.out.println("---------------");	
		System.out.print("The elements in the pricesOfItems array are: ");
		for (int i=0; i<pricesOfItems.length; i++) {
			System.out.printf("%.2f ", pricesOfItems[i]); 
		}
		System.out.println();
		System.out.print("The average price of items in the pricesOfItems array is: $");
		System.out.printf("%.2f", averageDouble(pricesOfItems));
		System.out.println();
		System.out.println();	
		System.out.println();	

		/* 
		 * Requirement 11
		 * Write a method that takes two arrays of double &
		 *  returns true if the average of the elements in the 
		 *  first array is greater than the average of the elements 
		 *  in the second array.
		 */
		double[] pricesOfNewBooks = {15.00,65.00,34.00,53.00,22.00};
		double[] pricesOfUsedBooks = {14.99,54.99,32.50,17.32,15.46};
		
		System.out.println("Requirement 11:");
		System.out.println("---------------");	
		System.out.print("The elements in the pricesOfNewBooks array are: ");
		for (int i=0; i<pricesOfNewBooks.length; i++) {
			System.out.printf("%.2f ", pricesOfNewBooks[i]);
		}
		System.out.println();
		System.out.println();
		
		System.out.print("The elements in the pricesOfUsedBooks array are: ");
		for (int i=0; i<pricesOfUsedBooks.length; i++) {
			System.out.printf("%.2f ", pricesOfUsedBooks[i]);
		}
		System.out.println();
		System.out.println();
	
		
		System.out.println("Is the average of the elements in the priceOfNewBooks array greater than ");
		System.out.print("     the average of the elements in the priceOfUsedBooks array? "); 
		if (isAverageGreaterThan (pricesOfNewBooks,pricesOfUsedBooks)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println();	
		System.out.println("Reversing the input to the method, isAverageGreaterThan:");
		System.out.println("-------------------------------------------------------");
		System.out.println("Is the average of the elements in the priceOfUsedBooks array greater than ");
		System.out.print("     the average of the elements in the priceOfNewBooks array? ");
		if (isAverageGreaterThan (pricesOfUsedBooks,pricesOfNewBooks)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}	
	
		System.out.println();
		System.out.println();

		
		/* 
		 * Requirement 12
		 * Write a method called willBuyDrink that takes a boolean
		 * isHotOutside and a double moneyInPocket, and returns true 
		 * if it is hot outside and if moneyInPocket is greater
		 * than 10.50.
		 */
		boolean isHotOutside = true;
		double moneyInPocket = 10.00;
		System.out.println("Requirement 12:");
		System.out.println("---------------");	
		System.out.println("You will only buy a drink if it is hot outside");
		System.out.println("and you have more than $10.50 in your pocket!");
		System.out.println("----------------------------------------------");
		System.out.print("Is it hot outside? ");
		if (isHotOutside) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}	
		System.out.print("How much money do you have in your pocket? $"); 
		System.out.printf("%.2f",moneyInPocket);
		System.out.println();
		System.out.print("Will you buy a drink? ");
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("Yes");
			System.out.println("It must be hot outside, and you have more than $10.50!");
		} else {
			System.out.println("No");
		}
		System.out.println();
		System.out.println();
	
		
		/*
		 * Requirement 13
		 * Create a method of your own that solves a problem.  
		 * In comments, write what the method does and why you created it.
		 *
		 * My set of methods is for a Point Of Sale System. 
		 * Methods:
		 *      boolean pointOfSale (double purchasePrice, double moneyTendered)
		 *      	This method takes the total purchase price and the money tendered, 
		 *      	and returns a boolean to indicate whether the sale was successful.
		 * 		double returnCorrectChange(double price, double moneyTendered)  
		 * 			This method returns the difference between the price of an item 
		 * 			and the money tendered, returning a message if not enough money 
		 * 			has been tendered for the purchase of the item.
		 *      double addItemPrices (double[] priceArray)
		 *      	This method returns the sum of all of the elements in a double array.
		 */     
	
		System.out.println("Requirement 13:");
		System.out.println("---------------");	
		
		/*
		 *  Example for Requirement 13 -- a simple first example
		 */

		int numberOfPurchase = 1;		
		System.out.println("Purchase #" + numberOfPurchase + ":");
		System.out.println("------------");
		double priceOfItem = 14.55;
		double moneyTendered = 20.00;
		if (pointOfSale (priceOfItem, moneyTendered)) {
			System.out.println("Have a nice day!");
		} 
		System.out.println();
		System.out.println();

		/*
		 *  Example for Requirement 13 -- showing moneyTendered < priceOfItem
		 */
		numberOfPurchase++;
		System.out.println("Purchase #" + numberOfPurchase + ":");
		System.out.println("------------");
		priceOfItem = 9.55;
		moneyTendered = 5.00;
		if (pointOfSale (priceOfItem, moneyTendered)) {
			System.out.println("Have a nice day!");
		} 
		System.out.println();
		System.out.println();	
	
		/*
		 *  Example for Requirement 13 -- using a item price of $0.00
		 */
		numberOfPurchase++;
		System.out.println("Purchase #" + numberOfPurchase + ":");
		System.out.println("------------");
		priceOfItem = 0.00;
		moneyTendered = 20.00;		
		if (pointOfSale (priceOfItem, moneyTendered)) {
			System.out.println("Have a nice day!");
		} 
		System.out.println();
		System.out.println();	
		
		/*
		 *  Example for Requirement 13 -- using an array of prices 
		 *  							(need to call addItemPrices)
		 */
		numberOfPurchase++;
		System.out.println("Purchase #" + numberOfPurchase + ":");
		System.out.println("------------");
		
		System.out.println("Using an array of prices, and adding all of the items in the array!");
		System.out.println("-------------------------------------------------------------------");
		double[] itemPrices = {4.00, 6.45, 9.55, 10.50, 8.99};
		moneyTendered = 50.00;
		
		System.out.println("The number of elements in the itemPrices array: "+ itemPrices.length);
		System.out.print("The elements in the itemPrices array are: ");
		for (int i = 0; i<itemPrices.length; i++) {
			System.out.printf("%.2f ", itemPrices[i]);
		}
		System.out.println();
		
		if (pointOfSale ((priceOfItem = addItemPrices(itemPrices)), moneyTendered)) {
			System.out.println("Have a nice day!");
		} 		
		System.out.println();
		System.out.println();
			
		System.out.println("---------------------------------------------");		
		System.out.println("End of Intro To Java Week 3 Coding Assignment");
		System.out.println("---------------------------------------------");		

	}
	
	/* ******************************************
	 * Methods Written for Requirements in Week 3
	 * ******************************************/
	

	/* 
	 * Requirement 7 -- multiplyConcat Method
	 */
	public static String multiplyConcat (String word, int n) {
		String concatenatedString = "";
		for (int i = 0; i<n; i++) {
			concatenatedString += word;
		}
		return concatenatedString;
	}
	
	/* 
	 * Requirement 8 -- createFullName Method
	 */
	public static String createFullName(String first, String last) {
		return (first + " " + last );		
	}

	/* 
	 * Requirement 9 -- isGreaterThanOneHundred Method
	 */
	public static boolean isGreaterThanOneHundred(int[] newarray) {
		int sum = 0;
		for (int num : newarray) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	/* 
	 * Requirement 10 -- averageDouble Method
	 */
	public static double averageDouble (double[] doubleArray) {
		double sum = 0.0;
		for (double num : doubleArray ) {
			sum += num;
		}
		return sum/doubleArray.length;	
	}
	
	/*
	 * Requirement 11 -- isAverageGreaterThan Method
	 */
	public static boolean isAverageGreaterThan (double[] arrayOne, double[] arrayTwo) {
		if (averageDouble(arrayOne) > averageDouble(arrayTwo)) {
			return true;
		} else {
			return false;
			
		}
	}	
	/*
	 * Requirement 12 -- willBuyDrink Method
	 */
	public static boolean willBuyDrink (boolean isHot, double hasMoney) {
		if (isHot && hasMoney > 10.50) {
			return true;
		} else {
			return false;
		}	
	}
		
	/* 
	 * Requirement 13 -- A method of my own design.  
	 * This ended up being a set of methods.
	 *
	 * My set of methods is for a Point Of Sale System. 
	 * Methods:
	 *      boolean pointOfSale (double purchasePrice, double moneyTendered)
	 *      	This method takes the total purchase price and the money tendered, 
	 *      	and returns a boolean to indicate whether the sale was successful.
	 *      
	 * 		double returnCorrectChange(double price, double moneyTendered)  
	 * 			This method returns the difference between the price of an item 
	 * 			and the money tendered, returning a message if not enough money 
	 * 			has been tendered for the purchase of the item.
	 * 
	 *      double addItemPrices (double[] priceArray)
	 *      	This method returns the sum of all of the elements in a double array.   
	 *
	 * returnCorrectChange 
	 * 
	 * This method takes two doubles as input, 
	 * 			the first is the price, the second is the money paid; and
	 * 			returns a double, which is the difference of these two, or will
	 * 					be set to the money paid amount if it is less than the price.
	 * This method will print a warning (returning the amount paid) if the amount paid 
	 * will not be enough to purchase the item.
	 * 
	 * I created this method because it seems like any application used 
	 * for point of sale would need a method with this functionality.  
	 * It will also be useful for my example ice cream ordering program.
	 * 
	 */
	
	public static double returnCorrectChange (double price, double totalCash) {
		if (price <= totalCash) {
			return totalCash - price;
		} else {
				System.out.println("NO SALE: More money is needed to make this purchase!");
				return totalCash;
			}
	}
	
	/*
	 * addItemPrices -- Adds all elements in an array of double
	 * 
	 * This method takes a double array as input, and
	 * 			   returns a double which is the sum of all items.
	 * 
	 * I created this method to help in a point of sale application to add up
	 * a list of items that a customer wants to purchase.  This is not as useful 
	 * with an array, which is immutable (can't grow dynamically), but I'm sure 
	 * we will learn about some type of object or list in the weeks to come where 
	 * we can dynamically add items, and a method that takes that object or list
	 * as an input could return the total price.
	 * 
	 */
	
	public static double addItemPrices (double[] itemArray) {
		double sum = 0;
		for (double  item : itemArray) {
			sum += item;
		    }
		return sum;
	}
	
	/*
	 * pointOfSale -- Returns true if the sale is successful
	 * 
	 * This method takes a double which is the item price, and a double which
	 * 				indicates the money tendered.
	 * 
	 * This method returns a boolean which indicates whether or not the sale is 
	 * successful.
	 * 
	 * I wrote this method because I was duplicating a lot of code to show all
	 * of my examples, so I created a method to write my code once.  
	 */
	
	public static boolean pointOfSale (double price, double money) {
		double change = 0.0;		
		System.out.print("The purchase price is:  $");
		System.out.printf("%.2f", price);
		System.out.println();
		System.out.print("The money tendered is:  $");
		System.out.printf("%.2f", money);
		System.out.println();
		if  (price == 0)  {
			System.out.println("This item is free!");
			return true;
		} else if((change = returnCorrectChange(price,money)) < money)  {	
			System.out.printf("Your change is: $%.2f", change);
			System.out.println();
			return true;
		} else {
			System.out.println("NO SALE!");
			return false;
		}
		
		
		
	}
}
