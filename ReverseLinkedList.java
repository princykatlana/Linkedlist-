package LinkedList;

public class ReverseLinkedList {
	
	SingleList head;
	
	public void insert(int data) {
		
		//creating a node
		SingleList ll = new SingleList();
		ll.data = data;
		ll.next = null;
		
		if(head == null) {
			System.out.println("Linked list is empty");
			head = ll;
		} else {
			SingleList node = head;
			
			while(node.next!=null) {
				 node = node.next; 
			}
			node.next = ll;
		}	
	}
	
	public void traverse() {
		
		SingleList node = head;
		
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void reverse() {
	
		SingleList next = null;
		SingleList previous = null;
		SingleList current = head;
		
		while(current != null) {
	
			next = current.next ;
			current.next = previous;
			previous = current;
			current = next;	
		}
		head = previous;
	}
	
	
	public static void main(String[] args) {
		
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		
		obj.traverse();
		
		obj.reverse();
		
		System.out.println("after reversing the linked list");
		
		obj.traverse();
		
		
	}

}
