package LinkedList;

public class Add1InLinkedList {
	
	SingleList head; 
	
	
	public void insert(int data) {
		
	
		//creating a node
		SingleList ll = new SingleList();
		ll.data = data;
		ll.next = null;
		
		if(head == null) {
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
			System.out.print(node.data + " , ");
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void reverse() {
		//SingleList node = head; 
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
	
	// considering the addition number will be single digit only
	public void add(int add) {
		
		SingleList node = head; 
		int carry = 0;
		node.data = node.data + add;
		
		while(node!=null) {
			int temp = node.data + carry;
			carry = temp/10;
			node.data = temp % 10;
			node = node.next;
		}
		
	}
	
	public static void main(String[] args) {
		Add1InLinkedList list = new Add1InLinkedList();
		list.insert(1);
		list.insert(9);
		list.insert(9);
		list.insert(9);
	
		
		System.out.println("Given List: ");
		list.traverse();
		
		System.out.println("");
		System.out.println("Reserve the  List: ");
		list.reverse();
		list.traverse();
		
		int number = 1;
		System.out.println("");
		System.out.println("Adding the number : " + number);
		list.add(number);
		list.reverse();
		list.traverse();
	}

}
