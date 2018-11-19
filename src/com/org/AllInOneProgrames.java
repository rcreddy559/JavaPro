package com.org;

public class AllInOneProgrames {
	public static void main(String[] args) {
        int arr[] = {  23, 47, 81, 92, 88, 52, 48, 56, 66, 65, 76, 71, 85, 100,
                     49, 53, 56, 61, 65, 84, 1 };
        secondLargeNumber(arr);
        printNumbers(insertionSort(arr));
        System.out.println(fact(10));
        reversOfString("1234567890");
        printNumbers(fib(9));
        System.out.println(mPowerOfn(5, 2));
        System.out.println(isOddOrEvenNmuber(3));
        System.out.println(isPrimeNumber(91));
        regTest();
	 }
	
	public static final String EXAMPLE_TEST = "This is my small example "
		      + "string which I'm going to " + "use for pattern matching.";

	static void regTest() {
		    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		    System.out.println(splitString.length);// Should be 14
		    for (String string : splitString) {
		      System.out.println(string);
		    }
		    // Replace all whitespace with tabs
		    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		  }
	
	static void isPalindrome(int value){
		int palindrome = value; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
	}
	
	static String isPrimeNumber(int value){
		
		if(value%2 ==0)
			return "Not prime Number";
		
		for(int i=3;i<value;i++) {
			if(value%i == 0) {
				return "Not prime Number";
			}
		}
		return "Prime Number";
		
	}
	
	
	static String isOddOrEvenNmuber(int value) {
		if(value%2 ==0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	static int mPowerOfn(int m, int n) {
		int result = 1;
		
		for(int i=1;i<=n;i++){
			result *= m;
		}
		
		return result;
	}
	
	static int[] fib(int n)
	{
	  /* Declare an array to store fibonacci numbers. */
	  int f[] = new int[n+1];
	  int i;

	  /* 0th and 1st number of the series are 0 and 1*/
	  f[0] = 0;
	  f[1] = 1;

	  for (i = 2; i <= n; i++)
	  {
	      /* Add the previous 2 numbers in the series
	         and store it */
	      f[i] = f[i-1] + f[i-2];
	  }

	  return f;
	}
	
	public static String reversOfString(String value) {
		String reverse = "";
		for(int i=value.length()-1;i>=0;i--) {
			reverse += value.charAt(i);
			System.out.println(reverse);
		}
		
		return reverse;
	}
	
	public static void secondLargeNumber(int[] arr) {
	        int largest = arr[0];
	        int secondLargest = arr[0];
	        for (int i = 0; i < arr.length; i++) {
	               if (arr[i] > largest) {
	                     secondLargest = largest;
	                     largest = arr[i];
	                    
	               } else if (arr[i] > secondLargest) {
	                     secondLargest = arr[i];
	                   
	               }
	        }
	        System.out.println("second largest in array is:" + secondLargest);
	}
	 
	 static int fact(int n) {
			if(n == 1) {
				return 1;
			}
			
			int result;
			
			result = fact(n-1)*n;
			return result;
		}
	 
	 public static int[] insertionSort(int array[]) {
			int n = array.length;
			for (int j = 1; j < n; j++) {
				int key = array[j];
				int i = j-1;
				while ( (i > -1) && ( array [i] > key ) ) {
					array [i+1] = array [i];
					i--;
				}
				array[i+1] = key;
				//printNumbers(array);
			}
			return array;
		}
	 
	 private static void printNumbers(int[] input) {
			
			for (int i = 0; i < input.length; i++) {
				System.out.print(input[i] + ", ");
			}
			System.out.println("\n");
		}
}
