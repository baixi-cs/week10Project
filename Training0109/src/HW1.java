import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorialNumber = 5;
		int hw3Size = 5;
		

		//1. Write Java program to display numbers from 1 to 100
		displayNumbers();
		
		//2. Write Java program to find factorial of a number
		int answer2 = findFactorial(factorialNumber);
//		System.out.println("q2-------------------------------------" );
		System.out.println("\tnumber\t" + factorialNumber + "'s factorial output is\t" + answer2);
		
		//3. Write Java program to find the first big, second big, and third-biggest number ( Take
		//userinput, use scanner function)
		int[] myList = new int[hw3Size];
		inputNum(myList, hw3Size);
//		
		int[] sorted2List = bubbleSort(myList);
		printList(sorted2List);
		int big1 = sorted2List[0];
		int big2 = sorted2List[1];
		int big3 = sorted2List[2];
		System.out.println("\tfirst big:" + big1 +"\tsecond big:"+ big2+"\tthird-biggest:" +big3);
		
		//4. Swap two variable without using the third variable
		int x = 20;
		int y = 10;
		x = x + y; //20+10=30
		y = x - y; //30-10=20
		x = x - y; //30-20=10
		System.out.println("\tx:" + x +"\ty:"+ y);
		
		//5. Write bubble sort program and find O(n), time complexity, and space complexity
		
		//6. Reverse string without using reverse command
//		Scanner myObj = new Scanner(System.in);
//		allWords = myObj.nextLine(); //“ Iamagoodboy ”;
//		
		String allWords = "Iamagoodboy";
		String reverseStr = reverseString(allWords);
		System.out.println("\treverse words: "+reverseStr);
		
		//7. Reverse word in a string ( Example: I/p → “ I am a good boy” o/p →” I ma doog yob”
		
		
		//8. Convert roman number to integer number ( Ex: Roman V → 5, Roman XI ➔ 11)
		String roman = "XI";
		int q8 = roman2Int(roman);
		System.out.println("\tq8= "+q8);//11
		
		//9. Convert digits to string ( i/p → 1253 → One Two five three)
		int digits = 1253;
		String strs = Integer.toString(digits);
		System.out.println("+++" + strs);
		
		//10. Program to find occurrence of number ( Example, i/p → {1,3,23,45,4,3,23}
		//o/p →
		//1 → Occurred 1 time
		//3 → Occurred 2 times
		//23 → Occurred 2 times
		//45 → Occurred 1 time
		//4 → Occurred 1 time
//		
//		
//		
//		
		
			
		
		
	
	}

private static int roman2Int(String s) {
		// TODO Auto-generated method stub
	int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch (s.charAt(i)){
            case 'M': nums[i]=1000;break;
            case 'D': nums[i]=500;break;  
            case 'C':nums[i]=100;break;
            case 'L':nums[i]=50;break;
            case 'X' :nums[i]=10;break;
            case 'V':nums[i]=5;break;
            case 'I':nums[i]=1;break;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1])
            sum-=nums[i];
        else
            sum+=nums[i];
    }
    return sum+nums[nums.length-1];
	}

private static String reverseString(String s) {
	// TODO Auto-generated method stub
	char[] chs = s.toCharArray();
	int l = 0;
    int r = chs.length - 1;
    while(l < r){
        char temp = chs[l];
        chs[l] = chs[r];
        chs[r] = temp;
        l++;
        r--;
    }
	return new String(chs);
}
//	private static void selectSort(int[] myList) {
//		for (int i = 0; i < myList.length; i++){
//			int minIdx = i;
//			for (int j = i+1; j < myList.length; j++) {
//				if (myList[j] < myList[minIdx]) {
//					minIdx = j;
//				}
//			}
//			if(i != minIdx) {
//				swap(myList, i, minIdx);
//			}
//		}
//		
//		
//	}

	private static int[] bubbleSort(int[] myList) {
		for (int i = 0; i < myList.length-1; i++){
			for (int j = 0; j < myList.length-1; j++) {
				if (myList[j] < myList[j+1]) {
					swap(myList, j, j+1);
				}
			}
		}
		
		return myList;
	}

	private static void swap(int [] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
//	private static void reverse(char[] s, int l, int r) {
//		// TODO Auto-generated method stub
//		for (; l < r; l++, r--){
//			char temp = s[l];
//			s[l] = s[r];
//			s[r] = temp;
//		}
//	}
	private static void printList(int[] myList) {
		for (int a : myList) {
//			System.out.print("\t" + a);
		}
	}
	private static void inputNum(int[] myList, int size) {
//		System.out.println("q3-------------------------------------" );
		
		Scanner myObj = new Scanner(System.in);
//		System.out.print("\tinput" + size +"nums as following:");
		for (int i = 0; i < size; i++){	
			myList[i] = myObj.nextInt();	
		}
//		System.out.println();
//		printList(myList);
		

	}
	

	private static int findFactorial(int factorialNumber) {
		
		if (factorialNumber == 0) {
			return 1;
		}
		else {
			
				return factorialNumber * findFactorial(factorialNumber -1);
			}
		}
				
		// TODO Auto-generated method stub

	

	private static void displayNumbers() {
//		System.out.println("q1-------------------------------------" );
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++){
//			System.out.print("\t" + i);
		}
//		System.out.println();
	}
}
