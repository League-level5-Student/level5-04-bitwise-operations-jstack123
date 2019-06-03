package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 3;
		
		// 2. Print the value of numShifted, and convert that value to binary.

//		String str = "";
//		int one = 1;
//		int n = 0;
//		while(n < num) {
//			str = "" + 2*one + "" + one;
//			n = Integer.parseInt(str);
//		}
//		System.out.println(str);
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		//shifts each bit 3 places to the left
		// >> shifts each bit 3 places to right
		System.out.println(numShifted);
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
