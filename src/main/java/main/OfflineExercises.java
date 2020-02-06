package main;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String output = "";
		for(String splitter:input.split("")) {
			for(int i=0;i!=3;i++) {
				output=(output+splitter);
			}
		}
		return output;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {

		if (input.contains("bert")) {

		}

		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {

		int x = 0; // largest number
		int y = 0; // smallest number
		int z = 0; // middle number

		if (a > b && a > c) {
			x = a;
		} else if (b > a && b > c) {
			x = b;
		} else if (c > a && c > b) {
			x = c;
		} // finds largest number

		if (a < b && a < c) {
			y = a;
		} else if (b < a && b < c) {
			y = b;
		} else if (c < a && c < b) {
			y = c;
		} // finds smallest number

		if (x == a && y == b) {
			z = c;
		} else if (x == a && y == c) {
			z = b;
		} else if (x == b && y == c) {
			z = a;
		} else if (x == b && y == a) {
			z = c;
		} else if (x == c && y == a) {
			z = b;
		} else if (x == c && y == b) {
			z = a;
		} // finds middle number

		if ((x - y) == (2 * (x - z))) {
			return true;
		} else {

			return false;
		}

	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		
		int length=input.length()-a;
		int end=length/2;
		String output="";
		output = input.substring(0,end)+input.substring(input.length()-end,input.length());
		return output;

	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		int length = input.length();
		String word = input.toLowerCase();

		if (length > 3) {

			if (word.substring(length - 3, length).equals("dev")) {
				return true;
			}
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		String[] blocks = input.split(null);
		int count = 0;

		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		String word = arg1.toLowerCase();
		for (String subString : word.split(" ")) {
			if (subString.equals("am")) {
				count++;
			}
		}

		return count;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		ArrayList<Integer> fizzbuzz = new ArrayList<Integer>();
		fizzbuzz.add(arg1);
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		} else {
			if (arg1 % 3 == 0) {
				return "fizz";
			} else {
				if (arg1 % 5 == 0) {
					return "buzz";
				}
			}

			return null;
		}
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		String[] largest = arg1.split(null);

		return 0;

	}

}
