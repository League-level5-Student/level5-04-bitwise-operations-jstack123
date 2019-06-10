package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		byte firstBit = (byte) (b & 1);
		byte secondBit = (byte) ((b & 2) >> 1);
		byte thirdBit = (byte) ((b & 4) >> 2);
		byte fourthBit = (byte) ((b & 8) >> 3);
		byte fifthBit = (byte) ((b & 16) >> 4);
		byte sixthBit = (byte) ((b & 32) >> 5);
		byte seventhBit = (byte) ((b & 64) >> 6);
		byte eighthBit = (byte) ((b & 128) >> 7);
		String binary = "";
		
		binary = "" + firstBit + ""+ secondBit + "" + thirdBit + "" + fourthBit + "" + fifthBit + "" + sixthBit + ""+ seventhBit +  "" + eighthBit;
		System.out.print(binary);
	}
		public static void main(String[] args) {
			BinaryPrinter bp = new BinaryPrinter();
			bp.printByteBinary((byte)129);
			System.out.println();
			bp.printShortBinary((short)300);
			System.out.println();
			bp.printIntBinary((int)123456);
			
		}
	
	public void printShortBinary(short s) {
		byte firstByte = (byte) (s >> 8);
		byte secondByte =(byte) (s&255);
		printByteBinary(firstByte);
		printByteBinary(secondByte);
	}
	
	public void printIntBinary(int i) {
		//4bytes
		short firstShort = (short) (i >> 16);
		short secondShort = (short) (i & 32767);	
		printShortBinary(firstShort);
		printShortBinary(secondShort);
	}
//	8 128 9 256 10 512 11 1024 12 2048 13 4096 14 8192 15 16384 16 32768 
	//17 65536 18 131072 19 262144 20 524288 21 1048576
	public void printLongBinary(long l) {
		//8 bytes
	}
}
