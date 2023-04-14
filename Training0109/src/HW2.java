//
//
////Day2: (using loops)
//// 
////Write a java program for the following. Note: Use user inputs and functions.
//// 
////1. Find the given year is leap year or not (consider century year)
//// 
////2. Find Fibonacci series of given size n
//// 
////3. WAP to find factorial for the given number n.
//// 
////4. print fallowing patterns (write separate methods to each)
//// 
////i. n=4 then o/p= 1 3 5 7
//// 
////ii. n=4 then o/p = 2 4 6 8
//// 
////iii. n=4 then o/p= 6 9 12 15
//// 
////iv. n=5 then o/p= 1,4,7,10,13
//// 
////v. n=5 then o/p= 0,4,8,12,16
//// 
////5. search the given element in an array of size n, using binary search
//// 
////6. convert 1) int to Integer and Integer to int 2) double to Double and Double to double
//// 
//import java.io.*; 
//import java.util.*;
//
//public class HW2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//1. Find the given year is leap year or not (consider century year)
//		Scanner myObj = new Scanner(System.in);
////		int year = myObj.nextInt();
////		boolean result = checkLeap(year);
////		System.out.println("\t The leap year is:\t" + result);
////		
////		//2. Find Fibonacci series of given size n
////		int n = myObj.nextInt();
////		int[] arr = new int[n];
////		for (int i = 0; i < n; i++){
////			arr[i] = findFib(i);
////		}
////		printList(arr);
////		System.out.println();
////		
////		//3. WAP to find factorial for the given number n.
////		int n1 = myObj.nextInt();
////		arr = new int[n1];
////		for (int i = 0; i < n1; i++){
////			arr[i] = findFac(i);
////		}
////		printList(arr);
////		System.out.println();
////		
////		//4. print fallowing patterns (write separate methods to each)	
////		//i. n=4 then o/p= 1 3 5 7
////		
////		findOdd();
////		System.out.println();
////		//ii. n=4 then o/p = 2 4 6 8
////		findEven();
////		System.out.println();
////		//iii. n=4 then o/p= 6 9 12 15
////		findMult3();
////		System.out.println();
////		//iv. n=5 then o/p= 1,4,7,10,13
////		findAdd3();
////		System.out.println();
////		//v. n=5 then o/p= 0,4,8,12,16
////		findMult4();
////		System.out.println();
////		
//		
//		//5. search the given element in an array of size n, using binary search
//		int n5 = myObj.nextInt();
//		int[] arr5 = new int[n5];
//		for (int i = 0; i < n5; i++){
//			arr5[i] = myObj.nextInt();
//		}
//		
//		int val = myObj.nextInt();
//		Arrays.sort(arr5);
//		int idx = binarySearch(arr5, val);
//		System.out.println(idx);
//		
//		
//		
////		//6. convert 1) int to Integer and Integer to int 2) double to Double and Double to double
////		// 
////		
//		
//	}
//	private static int binarySearch(int[] arr, int tar) {
//		// TODO Auto-generated method stub
//		int l, r;
//		l = 0;
//		r = arr.length - 1;
//		while (l <= r) {
//			int mid = l +(r-l)/ 2;
//			if (arr[mid] == tar){
//				return mid;
//			}
//			else if(arr[mid] > tar) {
//				r = mid - 1;
//			}
//			else {
//				l = mid + 1;
//			}
//		}		
//	}
//	private static void findMult4() {
//		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		for (int i = 0; i < 10; i++){
//			arr[i] = i*4;
//		}
//		for (int i = 0; i < 10; i++){
//			if(arr[i] != 0) {
//				System.out.print("\t"+ arr[i]);
//			}
//		}
//	}
//	private static void findAdd3() {
//		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		for (int i = 1; i < 20; i=i+3){
//			arr[i] = i;
//		}
//		for (int i = 0; i < 20; i++){
//			if(arr[i] != 0) {
//				System.out.print("\t"+ arr[i]);
//			}
//		}
//	}
//	
//	private static void findMult3() {
//		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		for (int i = 2; i < 10; i++){
//			arr[i] = i*3;
//		}
//		for (int i = 0; i < 10; i++){
//			if(arr[i] != 0) {
//				System.out.print("\t"+ arr[i]);
//			}
//		}
//	}
//	private static void findOdd() {
//		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		for (int i = 0; i < 20; i++){
//			if(i % 2 == 1) {
//				arr[i] = i;
//			}
//		}
//		
//		for (int i = 0; i < 20; i++){
//			if(arr[i] != 0) {
//				System.out.print("\t"+ arr[i]);
//			}
//		}
//	}
//
//	private static void findEven() {
//		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		for (int i = 0; i < 20; i++){
//			if(i % 2 == 0) {
//				arr[i] = i;
//			}
//		}
//		for (int i = 0; i < 20; i++){
//			if(arr[i] != 0) {
//				System.out.print("\t"+ arr[i]);
//			}
//		}
//	}
//	
//
//	private static int findFac(int n) {
//		// TODO Auto-generated method stub
//		if(n == 0) {
//			return 1;
//		}
//		return n*findFac(n-1);
//		
//	}
//
//	private static int findFib(int n) {
//		if(n < 2) {
//			return n;
//		}
//		return findFib(n-1)+findFib(n-2);
//	}
//	
//	private static void printList(int[] myList) {
//		for (int a : myList) {
//			System.out.print("\t" + a);
//		}
//	}
//
//	private static boolean checkLeap(int year) {
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)){
//			return true;
//		}
//		return false;
//	}
//
//}
