import java.util.LinkedList;

public class CustomLinkedList {

	 
		private Node head;
	 
		private static class Node {
			private int value;
			private Node next;
	 
			Node(int value) {
				this.value = value;
	 
			}
		}
	 //Scenario UseCase-1 : This method will construct one new linked list
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
	 
	 
		public void printList(Node head) {
			Node temp = head;
			while (temp != null) {
				System.out.format("%d ", temp.value);
				temp = temp.next;
			}
			System.out.println();
		}
	 
		// Scenario-1,Use Case-2 : Reverse linkedlist using this function 
		public static Node reverseLinkedList(Node currentNode)
		{
			// For first node, previousNode will be null
			Node previousNode=null;
			Node nextNode;
			while(currentNode!=null)
			{
				nextNode=currentNode.next;
				currentNode.next=previousNode;
				previousNode=currentNode;
				currentNode=nextNode;
			}
			return previousNode;
		}
	 
		public static void main(String[] args) {
			CustomLinkedList list = new CustomLinkedList();
			// Creating a linked list
			Node head=new Node(5);
			list.addNodeToList(head);
			list.addNodeToList(new Node(6));
			list.addNodeToList(new Node(7));
			list.addNodeToList(new Node(1));
			list.addNodeToList(new Node(2));
			System.out.println("Before reversing");
			list.printList(head);
			//Reversing LinkedList
			Node reverseHead=reverseLinkedList(head);
			System.out.println("After reversing");
			list.printList(reverseHead);
	 
		}
	 
	}
	 
