package test;

import java.util.ArrayList;
import java.util.List;

import Search.Search;
import datastructures.Solution;
import mit6092.FooCorporation;
import mit6092.GravityCalculator;
import mit6092.Marathon;
import problems.LeetCode;
import problems.Logger;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.Sort;

public class MainTester {
	
	public static int arraySum(List<Integer> numbers) {
	  int sum = -1;
	  for(int i=0; i < numbers.size() ; i++)
	  {
		int numb =  numbers.get(i);
		sum+=numb;
	  }
	  
	  return sum;

    }	
	
	
	

/*	public static void main(String[] args) 
	{
	 //LeetCode tester = new LeetCode();
	 
	 tester.reverseString("hello");
	 tester.reverseString("cheese");
	 tester.reverseString("cunt");
	 tester.reverseString("pussy");
	 tester.reverseString("egregious");
	 
	// int  [] test = new int[] {2,7,11,15};
	// int [] test2 = new int[] {0,4,3,0};
	//test = tester.twoSum(test, 9);
	//test2 = tester.twoSum(test2, 0);
	//System.out.print("Test2:" + test2[0] + " " + test2[1]);
	// tester.convert("PAYPALISHIRING", 3);
	//Logger logger = new Logger();
	// logging string "foo" at timestamp 1
//boolean test1 =	logger.shouldPrintMessage(100, "bug"); //returns true; 
//System.out.println("The test1: " + test1);

//	// logging string "bar" at timestamp 2
//boolean test2 = logger.shouldPrintMessage(105,"bug"); //returns true;
//System.out.println("The test2: " + test2);

	// logging string "foo" at timestamp 3
boolean test3 =	logger.shouldPrintMessage(111,"bug"); //returns false;
System.out.println("The test3: " + test3);
	// logging string "bar" at timestamp 8
boolean test4 =	logger.shouldPrintMessage(8,"bar"); //returns false;
System.out.println("The test4: " + test4);
	// logging string "foo" at timestamp 10
boolean test5 =	logger.shouldPrintMessage(10,"foo"); //returns false;
System.out.println("The test5: " + test5);
	// logging string "foo" at timestamp 11
boolean test6 =	logger.shouldPrintMessage(11,"foo"); //returns true;
System.out.println("The test6: " + test6);
		
		//Solution test = new Solution();
	}*/

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Solution test = new Solution();
		//int test1 = test.hasBalancedBrackets("(h[e{lo}!]~)()()()(");
		//System.out.println("Test 1: " + test1);
		
		//int test2 = test.hasBalancedBrackets("[](){}<>");
		//System.out.println("Test 2: " + test2);
		
		// int arr[] = {1, 1, 2, 2, 2, 2, 3};
		//test.caller(2,arr);
		//System.out.println("Result: " + res);
		/*test.nextGreaterNumber(218765);
		System.out.println();
		test.nextGreaterNumber(1234);
		System.out.println();
		test.nextGreaterNumber(4321);
		System.out.println();
		test.nextGreaterNumber(534976);*/
		
		// Test mit602 gravityCalc
		
		//GravityCalculator.gravityCalculator();
		//GravityCalculator.printSquare(5);
		
		//FooCorporation.calculatePay(7.50, 35);
		//FooCorporation.calculatePay(8.20, 47);
		//FooCorporation.calculatePay(10.00, 73);
		//Marathon.runnerFastest();	
		/*MergeSort sort = new MergeSort();
		int [] testArr = new int [] {10,12,3,4,5,614,27,8};
		//int [] testArr = new int [] {10,12,3};
		int [] result = sort.MergeSortRun(testArr);
		System.out.println("len: " + result.length);
		System.out.println();
		System.out.print("[");
		
		for(int one : result)
		{
			System.out.print(one  +" ");
		}
		
		System.out.print("]");*/
		
		//QuickSort tester = new QuickSort();
	  // int [] testArr  =  new int [] {1,2,3,6,7,8,55,56,112};
	 //System.out.println("Before: ");
	 //  tester.print(testArr);
	   System.out.println();
	 //System.out.println();
	//int [] resultTest = tester.QuickSortStart(testArr);
	//System.out.println("After: ");
	//tester.print(resultTest);
	  Search findit = new Search();
	  //System.out.println("The test length:" + testArr.length);
	  // accepts an ordered list
  // int res=	  findit.binarySearch(testArr, 118);
 //  System.out.println("the result is index: " + res);
	}
	
}


