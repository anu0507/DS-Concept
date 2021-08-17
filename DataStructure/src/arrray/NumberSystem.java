package arrray;

import java.util.Scanner;

/*
 * Q1. Write a program of odd number.
 * Q2. Write a program of even number.
 * Q3. Swap two numbers without using 3rd variable.
 * Q4. Add all the digits of a given number without using string.
 * Q5. find length of a given number.
 * Q6. Write a program of a prime number.
 * Q7. Write a program of factorial(using with and without recursive).
 * Q8. Write a program of a fibonacci number.
 * Q9. Write a program of GCF
 * Q10. Write a program of LCF
 * Q11. Reverse a given number
 * Q12. Check a given number is palindrome
 * Q13. Check a given number is armstrong
 */

public class NumberSystem {
	// Q1.
	/*
	 * Step 1: take a variable num to store the value. Step 2: start the loop till
	 * the given number. Step 3: check the number when divisible by two and leaves
	 * the remainder 1.
	 * 
	 */
	public static int odd(int num) {

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}
		}
		return num;

	}

//Q2. 
	/*
	 * Step 1: take a variable num to store the value. Step 2: start the loop till
	 * the given number. Step 3: check the number when divisible by two and leaves
	 * the remainder 0.
	 * 
	 */
	public static int even(int num) {
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println(i + " ");
		}
		return num;

	}

	// Q3.
	/*
	 * Step 1: take two variable n1,n2 to store the values. Step 2: print the
	 * number. Step 3: add the given no i.e n1 +n2 and store in n1. Step 4:
	 * substract the no i.e n1-n2 and store in n2. Step 5: again, substract the no
	 * i.e n1-n2 and store in n1. Step 6:print after swaping the number.
	 * 
	
	 *
	 */
	public static int swapTwoNumber(int n1, int n2) {
		System.out.println("number is:" + n1 + " " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("after Swapping:" + n1 + " " + n2);
		return n2;

	}

	// Q6.
	/*Step 1: firstly check the given no is greater than 1, if not tha return false.
	 * Step 2:if the no is greater than 1 then iteration start from 2 to the given no .
	 *  Step 3:check if it divides n than return false else return true.
	 */
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	// Q7.
	/*
	 * 
	 */
	// With Recursion
	public static int factorial(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	// withOut Recursion
	/*
	 * 
	 */
	public static int fact(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;

	}

	// Q8.
	/*Step 1: take  two variable i.e previews is initialized with 0 and next is 1.
	 * Step 2: iteraters loop util the given number.
	 * Step 3: print previews number.
	 * Step 4: add the previews number and next number.
	 * Step 5: update the new value of previews number and next number.
	 * 
	 */
	public static int fibonacci(int num) {
		int previews = 0, next = 1, current = 0;
		for(int i =1;i<=num;++i) {
			System.out.println(previews+" ");
				current = previews + next;
				previews = next;
				next = current;
		}
			return current; 
	}

	// Q9.
	/*Step 1: take two variable i.e a and b.
	 * Step 2: check the condition of gcf.
	 * Step 3: if number is divisible and remainder is not 0 than again 
	 * divide the number until remainder becomes  0.
	 * Step 4: if remainder of given no is 0 than return common factor of the given number.
	 * 
	 */
	public static int gcf(int a, int b) {

		{
			if (a % b != 0) {
				return gcf(b, a % b);

			} else
				return b;
		}
		

	}

	// Q10.
	/*
	 * 
	 */
	public static int lcf(int x, int y) {
		{
			if(x%y!=1) {
				return x*y/gcf(x,y);
			
			}
			else 
				return y;
		
		}
	
		

	}

	// Q11.
	public static int reverseNumber(int num) {
		int output = 0;
		while (num != 0) {
			output = output * 10 + num % 10;
			num = num / 10;}
		return output;
	}

	// Q12.
	public static int palindrome(int n) {
		int temp, out = 0;
		temp = n;
		while (n > 0) {
			out = (out * 10 )+( n % 10);
			n = n / 10;}
			if (temp == out) {
				System.out.println("Palindrome number:"+temp);}
			else {
				System.out.println("Not Palindrome number");

			}
		
		return n;
	}
	//Q13.
	public static int armstrong(int n) {
		int temp,out,sum = 0;
		temp = n;
		while(n!=0) {
			out =n%10;
			n = n/10;
		sum  =sum+(out*out*out);
			
		}
		if(temp==sum) {
			System.out.println("Armstrong No:"+temp);
		}
		else
			System.out.println("Not Armstrong no");
		
		return n ;
		
	}

	public static void main(String[] args) {
		
	//	NumberSystem.odd(20);
		// NumberSystem.even(20);
		 //NumberSystem.swapTwoNumber(10, 50);
		boolean prime = NumberSystem.isPrime(6);
		//System.out.println(prime);
		int factorial = NumberSystem.factorial(7);
		//System.out.println(factorial);
		int fact = NumberSystem.fact(7);
		//System.out.println(fact);
		int fibonacci = NumberSystem.fibonacci(4);
		// System.out.println(fibonacci);
		int gcf = NumberSystem.gcf(24, 64);
		//System.out.println(gcf);
		int lcf = NumberSystem.lcf(12, 8);
		// System.out.println(lcf);
		int reverseNumber = NumberSystem.reverseNumber(579);
		 System.out.println(reverseNumber);
		 NumberSystem.palindrome(121);
		NumberSystem.armstrong(163);
		 
	
	}
	
	}
	


