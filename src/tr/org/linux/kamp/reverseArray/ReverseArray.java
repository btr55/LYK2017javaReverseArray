package tr.org.linux.kamp.reverseArray;

import java.util.Arrays;

import java.util.Random;

public class ReverseArray {
	private static Random rand = new Random();
	private static int bound = 10; // array sınırlarını belirledik.
	private static int[] array = new int[bound];
	private static int[] reversedArrays = new int[bound];
	
	public static void main(String[] args) {
		
		generateArray();
		System.out.println(Arrays.toString(array));	//ekrana yazarken stringe çevirmek zorundayiz.
		System.out.println(Arrays.toString(reverseArray(array)));
	}
	
	public static void generateArray() {		
		
		int item;
		for(int i=0;i<array.length;i++) {
			
			item=rand.nextInt(10);
			array[i]=item;
		}
	}

	public static int[] reverseArray(int [] array) {
		
		int i=0;
			for (int j=array.length-1;j>=0;j--) {
				reversedArrays[i]=array[j];
				i++;
			}
		
		return reversedArrays;
	}
}
