package linkedlist;

public class main {

	public static void main(String[] args) {
		/**
		 * creating object of linkedList class
		 * added values through add method
		 * 
		 */

		LinkedList list = new LinkedList();
		Node head = list.addNode(null, 56);
		list.addNode(head, 30);
		list.addNode(head, 70);
		list.printLinkedList(head);

	}

}
