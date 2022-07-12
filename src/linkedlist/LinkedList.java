package linkedlist;

public class LinkedList {
	/**
	 * program for creating simple linkedList
	 * creating a constructor of add node
	 * creating a object newNode 
	 * 
	 * 
	 */
		
		

		public Node addNode(Node head, int data) {
			
			 
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				}
			
			else {
				Node temp = head;
				while(temp.next !=null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			return head;
		}
		  public Node addNodeAtFirst(Node head, int data) {
		        Node newNode = new Node(data);
		        if(head == null) {
		            head = newNode;
		        }
		        else {
		            newNode.next = head;
		            head = newNode;
		        }
		        return head;
		  }
		
		public void printLinkedList(Node head) {
			/**
			 * assigning temp memory to head
			 * comparing temp equals to null and not equals to null using if else statement
			 */
			Node temp = head;
			if (temp == null) {
				System.out.println("LinkedList is empty");
			}
			else {
				while(temp.next!= null) {
				System.out.print(temp.data+"  ");
				temp=temp.next;
				}
				
			}
			System.out.print(temp.data);

		}
}
