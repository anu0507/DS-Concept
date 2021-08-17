package queue;
/*1. insert(enQueue)
 * 2. remove(deQueue)
 * 3. getFront
 * 4. getRear
 * 5. size
 * 6. isEmpty
 * 7. isFull
 * 
 * 
 */

public class MyQueue {
	private static int CAPACITY = 10;
	private int[] array;
	private int size;

	public MyQueue() {
		this.array = new int[CAPACITY];
	}

	public void enQueue(int data) {
		if (!isFull()) {
			this.array[size++] = data;
		}
	}
	/*
	 * T.C:- O(n)
	 * Q1. Is it possible to reduce time complexity to O(1)?
	 * Ans:- yes(hint: circular array, rear = [front+(size-1)]% capacity)
	 */

	public int deQueue() {

		if (!isEmpty()) {
			int data = this.array[0];
			for (int i = 0; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
			return data;
		}
		else
		return -1;
	}
	public int getFirst(){
		/*if(!isEmpty()) {
			return array[0];
		}
		else
			return -1;*/
		return !isEmpty() ? array[0]:-1;
	}
	public int getLast() {
		return !isEmpty() ? array[size-1]: -1;
	}
	public int size() {
		return size;
	}
	public void clean() {
		
		
	}

	public boolean isFull() {

		return size == CAPACITY;

	}

	public boolean isEmpty() {
		return size == 0;
	}
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		int first = queue.getFirst();
		System.out.println(first);
		int last = queue.getLast();
		System.out.println(last);
	}

}
