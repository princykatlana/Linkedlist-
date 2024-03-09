package LinkedList;

public class FloydLoopInLinkedList {
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
	
	public boolean detectLoop() {
		
		SingleList slow = head.next;
		SingleList fast = head.next.next;
		
		SingleList node = head;
		
		while(node.next!=null && slow!=null && fast!=null && fast.next!=null) {
			if(slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		FloydLoopInLinkedList obj = new FloydLoopInLinkedList();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
	
		obj.traverse();
		
		//creating the loop in linked list
		obj.head.next.next.next = obj.head;
		
		System.out.println(obj.detectLoop());
	}

}
