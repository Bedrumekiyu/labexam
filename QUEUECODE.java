package dsa;
  //Q3
public class QUEUECODE {
	
	 private int[] numbers;
	 private int front;
	 private int rear;
	 private int nItems;
	 private int maxSize;
	 public QUEUECODE(int maxSize) {
	 this.maxSize = maxSize;
	 numbers = new int[maxSize];
	 front = 0;
	 rear = -1;
	 nItems = 0;
	 }
	 public boolean isEmpty() {
	 return nItems == 0;
	 }
	 public boolean isFull() {
	 return nItems == maxSize;
	 }
	 public int peek() {
	 if (isEmpty()) {
	 throw new IllegalStateException(" Cannot peek.");
	 }
	 return numbers[front];
	 }
	 public void enqueue(int value) {
	 if (isFull()) {
	 throw new IllegalStateException("Queue is full " + value);
	 }
	 if (rear == maxSize - 1) {
	 rear = -1; 
	 }
	 numbers[++rear] = value;
	 nItems++;
	 }
	 public int dequeue() {
	 if (isEmpty()) {
	 throw new IllegalStateException("Queue is empty. Cannot dequeue.");
	 }
	 int frontValue = numbers[front++];
	 if (front == maxSize) {
	 front = 0; 
	 }
	 nItems--;
	 return frontValue;
	 }
	 public static void main(String[] args) {
	 QUEUECODE numQueue = new QUEUECODE(7);
	 numQueue.enqueue(11);
	 numQueue.enqueue(2);
	 numQueue.enqueue(13);
	 numQueue.enqueue(4);
	 numQueue.enqueue(45);
	 numQueue.enqueue(20);
	 numQueue.enqueue(5);
	 numQueue.dequeue();
	 numQueue.dequeue();
	 System.out.println("Front element: " + numQueue.peek());
	 System.out.println("Size of the queue: " + numQueue.nItems);
	 
	 while (!numQueue.isEmpty()) {
	 System.out.println(numQueue.dequeue());
	 } }
	 }
	
