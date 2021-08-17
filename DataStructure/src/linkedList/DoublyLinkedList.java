package linkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		/*
		 * Node newNode = new Node(data); newNode.next = head; newNode.prev= null;
		 * if(head!=null) head.prev = newNode; head = newNode;
		 */

	}

	private static class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data, Node prev, Node next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		Node(int data) {
			data = data;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
	}

}
