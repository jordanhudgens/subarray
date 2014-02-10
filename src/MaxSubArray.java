// Class: 		CS5381
// Student:		Jordan Hudgens
// Level:		Graduate Student
// Date:		2014-03-03
// Project:		Maximum Sub Array for 10, 100, and 1000 items
// Comment:		Couldn't get it to work, it keeps printing out the first and last index, the sum component works, but I couldn't figure a non brute force way of getting the indexes

public class MaxSubArray {
 
    public static void main(String args[]){
    	
    	// Below I create the three arrays and create
    	// a randomize algorithm on them
    	int[] array_10 = new int[10];
    	int[] array_100 = new int[100];
    	int[] array_1000 = new int[1000];

    	System.out.println("------------------- 10 items ------------------------");
    	generateRandomNumbers(array_10);
    	maxSubarray(array_10);
    	
    	System.out.println();
	    System.out.println("------------------- 100 items ------------------------");
    	generateRandomNumbers(array_100);
    	maxSubarray(array_100);
    	
    	System.out.println();
	    System.out.println("------------------- 1000 items ------------------------");
    	generateRandomNumbers(array_1000);
    	maxSubarray(array_1000);
    	       
    }
 
    static void maxSubarray(int[] givenArray) {

    	double new_max = 0, max_end = 0;
        int max_start_index = 0, start_index = 0, max_end_index = -1;

        for(int i = 0; i < givenArray.length; i++) { // iterates over the array
          if(0 > max_end + givenArray[i]) { // compares 0 with the max plus the current value of the array for the iteration
        	start_index = i + 1; // increments the start index value
            max_end = 0; // and sets the max end value to 0
          } else {
        	max_end += givenArray[i]; // if the first condition isn't met, it adds the value at the index to the sum
          }

          if(max_end > new_max) {
            max_start_index = start_index;
            max_end_index = i;
          }
        }
        System.out.println("Start of the index: " + max_start_index);
        System.out.println("End of the index: " + max_end_index);
        System.out.println("Sum of the sub array: " + max_end);

      }
    
    static void generateRandomNumbers(int[] givenArray) {
    	for(int i = 0; i < givenArray.length; i++) {
    		givenArray[i] = (int)(Math.random() * 100);
    	}
    }
}