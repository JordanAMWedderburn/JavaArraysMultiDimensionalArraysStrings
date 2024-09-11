import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {

	String str1 = "abc";
	String str2 = "ABC";
	
	boolean result1 = str2.equalsIgnoreCase(str1);
	System.out.println(str1 + " is equal to " + str2 + " when case is ignored = " + result1);
	
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter a string:");
	String conStr1 = myObj.nextLine();
	System.out.println("Enter a string to add to " + conStr1);
	String conStr2 = myObj.nextLine();
	System.out.println("New string is: " + conStr1.concat(conStr2));
	
	System.out.println("Enter a string: ");
	String lenStr = myObj.nextLine();
	System.out.println("Length of " + lenStr + " is: " + lenStr.length());
	
	System.out.println("Enter a string: ");
	String subStr = myObj.nextLine();
	System.out.println("Enter 2 positions for the substring: ");
	int subA = myObj.nextInt();
	int subB = myObj.nextInt();
	
	System.out.println("The substring of " + subStr + "between " + subA + " and " + subB + " is: " + subStr.substring(subA,subB));
	System.out.println(str1.toUpperCase());
	System.out.println(str2.toLowerCase());
	
	String reversedStr = "";
	
	for (int i = 0; i < str1.length(); i++) {
		  reversedStr = str1.charAt(i) + reversedStr;
		}

	System.out.println("Reversed string: "+ reversedStr);
	
	int count = 0;
	String str3 = "tracer";
	
	for (int i = 0; i < str3.length(); i++) {
		for(int j= i+1; j<str3.length();j++)
			if(str3.charAt(i)==str3.charAt(j))
				count++;
		}
	System.out.println("Count of repeated chacters in the given string: " + count);
	
	String words = "One Two Three Four Five.";
	int countWords = words.split("\\s").length;
	System.out.println("Number of words in given sentence: " + countWords);
	
	int a = 3;
	String b = Integer.toString(a);
	System.out.println("Int to String: " + b);
	int c = Integer.valueOf("1");
	System.out.println("Value of int c: " + c);
	
	String white = "   o k     ";
	String noWhite = white.replaceAll("\\s","");
	System.out.println(noWhite);
	
	String pal1 = "racecar";
	String pal2 = "race";
	String revPal1 = "";
	String revPal2 = "";
	
	for (int i = 0; i < pal1.length(); i++) {
		  revPal1 = pal1.charAt(i) + revPal1;
		}
	if (pal1.compareTo(revPal1) == 0)
			System.out.println(revPal1 + " is a palindrome of " + pal1);
	else
			System.out.println(revPal1 + " is not a palindrome " + pal1);
	
	for (int i = 0; i < pal2.length(); i++) {
		  revPal2 = pal2.charAt(i) + revPal2;
		}
	if (pal1.compareTo(revPal2) == 0)
			System.out.println(revPal2 + " is a palindrome of " + pal2);
	else
			System.out.println(revPal2 + " is not a palindrome " + pal2);
	
		myObj.close();	
}
}