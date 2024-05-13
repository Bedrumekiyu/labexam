package dsa;
//Q5
public class MERG {
	public static void main(String[] args) {
		MERG();
	}

		
	
	private static void MERG(int[] inputArray) {
		int inputLength = inputArray.length;
		if(inputLength < 2) {
		return;
		}
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength -
		midIndex];
		for(int i = 0; i < midIndex; i++) {
		leftHalf[i - midIndex] = inputArray[i];
		}
		for(int i = midIndex; i < inputLength; i++) {
		rightHalf[i] = inputArray[i];
		}
		merge(leftHalf);
		merge(rightHalf);
		
		merge(inputArray, leftHalf, rightHalf);
		}
		private static void MERG(int[] inputArray, int[] 
		leftH, int[] rightH) {
		int leftSize = leftH.length;
		int rightSize = rightH.length;
		int i = 0;
		int j = 0;
		int n = 0;
		while(i < leftSize && j < rightSize) {
		if(leftH[i] <= rightH[j]) {
		inputArray[n] = leftH[i];
		i++;
		}
		else {
		inputArray[n] = rightH[j];
		}
		n++;
		}
		while(i < leftSize) {
		inputArray[n] = leftH[i];
		i++;
		n++;
		}
		while(j < rightSize) {
		inputArray[n] = rightH[j];
		j++;
		n++;
		}
		}

}
