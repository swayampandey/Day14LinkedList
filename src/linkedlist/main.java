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
		 * node with data 70 first created
		 * next 30 is added to 70
		 * finally 56 is added to 70
		 */
		Node head = list.addNode(null, 70);
		
		head = list.addNodeAtFirst(head, 30);
		head = list.addNodeAtFirst(head, 56);
		list.printLinkedList(head);

	}

}
