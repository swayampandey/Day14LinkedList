package linkedlist;

public class main {

	public static void main(String[] args) {
		/**
		 * creating object of linkedList class
		 * 
		 * 
		 */

		LinkedList list = new LinkedList();
		/**
		 * node with data 56 first created
		 * next 30 is appended to 56
		 * finally 70 is appended to 56
		 */
		Node head = list.addNode(null, 70);
		
		head = list.addNodeAtFirst(head, 30);
		head = list.addNodeAtFirst(head, 56);
		list.printLinkedList(head);

	}

}
