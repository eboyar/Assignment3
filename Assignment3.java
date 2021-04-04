package Assignment3;

public class Assignment3{
	
	//Ethan Boyar
	//All in one file instead of split
	
	public static boolean isStrictlyIncreasing(double[] in) {
		
		for(int i = 0; i < in.length -1; i++) {
			if(in[i+1] < in[i]) return false;
		}
		
		return true;
	}
	
	public static char[] removeDuplicates(char[] in) {
		
		int[] preArr = new int[in.length];
		int index = 0;		
		int arrSize = 0;
		
		for(int i = 0; i < in.length; i++) preArr[i] = 1;	
		
		for(int i = 0; i < in.length; i++) {
			for(int j = i + 1; j < in.length; j++) {
				if(in[i] == in[j]) preArr[j] = 0;
			}
		}
		
		for(int i = 0; i < in.length; i++) {
			if(preArr[i] == 1) arrSize++;
		}
		
		char[] newArr = new char[arrSize];
		for(int i = 0; i < in.length; i++) {
			if(preArr[i] == 1) {
				newArr[index] = in[i];
				index++;
			}
		}
		return newArr;
	}
	
	public static int[] remove(int v, int[] in) {
		int index = 0;
		int other = 0;
		
		for(int i = 0; i < in.length; i++) {
			if(in[i] != v) other++;
		}
		
		int[] newArr = new int[other];
		
		for(int i = 0; i < in.length; i++) {
			if(in[i] != v) {
				newArr[index] = in[i];
				index++;
			}
		}
		return newArr;
	}
	
	public static int[] combineOrder(int[] order1, int[] order2) {
		int[] newArr = new int[order1.length];
		
		for(int i = 0; i < order1.length; i++) {
			newArr[i] = order1[i] + order2[i];
		}
		return newArr;
	}
	
}
