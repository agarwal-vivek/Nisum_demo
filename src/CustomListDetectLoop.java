
public class CustomListDetectLoop {

	
	private Node head;
	 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
	
	//Scenario-2 : UseCase-1 : Construct new LinkedList
 
	public void addNodeToList(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	
	//Scenario 2:UseCase -2 : Detect the loop in linkedlist based on slow and fast pointer traversal
	public boolean ifLoopExists() {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				return true;
 
		}
		return false;
	}
 
	public static void main(String[] args) {
		CustomListDetectLoop list = new CustomListDetectLoop();
		// Creating a linked list
 
		list.addNodeToList(new Node(5));
		list.addNodeToList(new Node(6));
		list.addNodeToList(new Node(7));
		list.addNodeToList(new Node(1));
		list.addNodeToList(new Node(2));
 
 
		list.printList();
 
		// Test if loop existed or not
		System.out.println("Loop existed-->" + list.ifLoopExists());
 
	}
}
