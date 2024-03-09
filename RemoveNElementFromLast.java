package LinkedList;

public class RemoveNElementFromLast {
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

	public void removeFromLast(RemoveNElementFromLast list, int n) {
		
		SingleList temp = head;
		int index= 1;
		
		while(temp!= null) {
			temp = temp.next;
			index++;
		}
		
		int j = index-n;
		
		SingleList node = head;
		SingleList next = null;
		for (int i = 1; i < j; i++) {
			node = node.next;
			
			if( i == j-1) {
				next = node.next;
			}
		}
		
		node.next = next;
	
	}

	public static void main(String[] args) {
		
		RemoveNElementFromLast list = new RemoveNElementFromLast();
		list.insert(5);
		list.insert(10);
		list.insert(12);
		list.insert(45);
		list.insert(51);
		list.insert(78);
		
		System.out.println("Given List: ");
		list.traverse();
		
		//Remove Nth element from last of the Linked List.
		int n= 2;
		list.removeFromLast(list, n);
		
		System.out.println("");
		System.out.println("After removing the " + n + " element of list: ");
		list.traverse();
		
	}

}
