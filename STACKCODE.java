package dsa;


		//Q2
		public class STACKCODE {
		int maxSize;
		int top;
		int[] numArray;
		
		STACKCODE(int size){
		maxSize = size;
		top = -1;
		numArray = new int[maxSize];
		}
		void push(int value) {
		if(top < maxSize - 1) {
		numArray[++top] = value;
		}
		else {
		System.out.println("Stack is full.");
		}
		}
		public static void main(String[] args) {
		Stacks numStack = new Stacks(3);
		numStack.push(11);
		numStack.push(22);
		numStack.push(33);
		for (int i = 0; i < numStack.maxSize; i++) {
		System.out.println(numStack.numArray[i]);


	}

		}}
