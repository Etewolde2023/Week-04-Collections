package week4;

public class ArraysandMethods {

	public static void main(String[] args) {
		// Coding Steps — Arrays and Methods
		
		// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 97};		
		
		// a.	Programmatically subtract the value of the first element in the array from the value in the last
		    // element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		
		  System.out.println(ages[ages.length-1] - ages[0]);
		  
		// b.	Add a new age to your array and repeat the step above to ensure it is 
		  // dynamic (works for arrays of different lengths).
		  System.out.println(ages[ages.length-1] - ages[0]);
		  
		  
		// c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		  int Sum = 0;
		  for (int age : ages) {
			  Sum += age;
			  System.out.println(Sum);
			  int averageAge = Sum / ages.length;
			  System.out.println(averageAge);
		  }
		  
		  
		// 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, 
		   // “Tim”, “Sally”, “Buck”, “Bob”.
		  
		  String[] names = { "sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		  
		// a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
		  // Print the result to the console.
		  int sumOfLetters = 0;
		  for(String name : names) {
			  sumOfLetters += name.length();
		  }
		  System.out.println(sumOfLetters);
		  
		  
		  
		  
		// b.	Use a loop to iterate through the array again and concatenate all the names together, 
		  //   separated by spaces, and print the result to the console.
		  String result = " ";
		  for(int i = 0; i < names.length; i++) {
			  System.out.println(result += names[i] + " ");
		  }
		  
		  
		// 3.	How do you access the last element of any array?
		  
		//      ANSWER TO THIS QUESTION IS:  array[array.length - 1];
		  
		// 4.	How do you access the first element of any array?
		  
		//      ANSWER TO THIS QUESTION IS:  array[0];
		  
		  
	    //  5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//      created names array and add the length of each name to the nameLengths array.
		  
		  for(String name : names) {
			  System.out.println(name.length());
		  }
		  int[] nameLengths = new int[6];
		  nameLengths[0] = 3;
		  nameLengths[1] = 5;
		  nameLengths[2] = 3;
		  nameLengths[3] = 5;
		  nameLengths[4] = 4;
		  nameLengths[5] = 3;
		  
		// 6.	Write a loop to iterate over the nameLengths array and calculate
		//      the sum of all the elements in the array. Print the result to the console.
		  
		  int sum = 0;
		  for(int number : nameLengths) {
			  sum += number;
			  System.out.println(sum);
		  }		  
	}
		  
		  
		  
		  
		// 7.	Write a method that takes a String, word, and an int, n, as arguments 
		//      and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
	    //      I expect the method to return “HelloHelloHello”).
		  public static String repeatStringNumTimes(String word, int n) {
			  return word;			  
		  }
		  
		  
		  
		// 8.	Write a method that takes two Strings, firstName and lastName, 
		//      and returns a full name (the full name should be the first and the last 
	    //      name as a String separated by a space).
		  public static String returnsFullName(String firstName, String lastName) {
			  return firstName + " " + lastName;
		  }
		  
		  
		// 9.	Write a method that takes an array of int and returns true if the sum of all the ints 
		//      in the array is greater than 100.
		  public static boolean checkSum(int[] array) {
			  int sum = 0;
			  for(int i = 0; i < array.length; i++) {
				  if((sum += array[i]) > 100) {
					  return true;
				  }
			  }
			  return false;
		  }
		  
		// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		  public static double returnAverage(double[] array) {
			  double sum = 0;
			  for(double number : array) {
				  number += sum;
		  }
			  return sum / array.length;
		  }
			  
			  
		  
		// 11.	Write a method that takes two arrays of double and returns true if the average 
	    //       of the elements in the first array is greater than the average of the elements in the second array.
		  public static boolean willMeasureAverage(double[] arr1, double[] arr2) {
			  double sum = 0; 
			  for(int i = 0; i < arr1.length; i++) { for(int j = 0; j < arr2.length; j++) {
				  if((sum += arr1[i]) / arr1.length > (sum += arr2[j]) / arr2.length) {
					  return true;
				  }
			  }
			  
		  }
			  return false;
		  }
		  
		  
		// 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//      and a double moneyInPocket, and returns true if it is hot outside 
		//      and if moneyInPocket is greater than 10.50.
			  public static boolean willBuyDrink(boolean isHotOutside, double moneyInpocket) {
				  if(isHotOutside == true && moneyInpocket > 10.50) {
					  return true;
				  }
				  return false;
			  }
				  
			  
			  
		// 13.	Create a method of your own that solves a problem. In comments, write what the method does 
		//   and why you created it.
			  
			  
			  
			  // This method will take an array of int and will return the biggest number in the array.
			  public static int findTheBiggestNumber(int[] array) {
				  int biggest = array[array.length -1];
				  for(int number : array) {
					  if(number > biggest) {
						  biggest = number;
					  }
				  }
				  return biggest;


			  }
}


