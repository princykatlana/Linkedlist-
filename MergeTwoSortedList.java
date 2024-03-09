package LinkedList;

public class MergeTwoSortedList {
	
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

	public static MergeTwoSortedList mergeList(MergeTwoSortedList l1, MergeTwoSortedList l2) {
		
		MergeTwoSortedList mergedList = new MergeTwoSortedList();
		SingleList node1 = l1.head;
		SingleList node2 = l2.head;
		
		while(node1!=null && node2!=null) {
			if(node1.data <= node2.data) {
				mergedList.insert(node1.data);
				node1= node1.next;
			}else {
				mergedList.insert(node2.data);
				node2= node2.next;
			}
		}
		
		return mergedList;
	}
	
	
	public static void main(String[] args) {
		
		MergeTwoSortedList list1 = new MergeTwoSortedList();
		list1.insert(10);
		list1.insert(25);
		list1.insert(35);
		list1.insert(60);
	
		System.out.println("First Sorted List");
		list1.traverse();
		
		
		MergeTwoSortedList list2 = new MergeTwoSortedList();
		list2.insert(10);
		list2.insert(15);
		list2.insert(40);
		list2.insert(55);
		
		System.out.println();
		System.out.println("Second Sorted List");
		list2.traverse();
		
		
		System.out.println();
		System.out.println("Merged Sorted List");
		MergeTwoSortedList mergedList = mergeList(list1, list2);
		mergedList.traverse();
		
	
		
		
	}
}
