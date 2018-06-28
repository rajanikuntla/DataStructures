package LinkedList;


//These functions are written assuming the list doesn't contain duplicates
public class LinkedListFunctions {

	public void traverseLinkedList(LinkedList src) {

		LinkedList temp = src;
		while (temp != null) {
			System.out.print(" " + temp.data);
			System.out.print( temp.next!=null?"->":"");
			temp = temp.next;
		}

	}
	
	public LinkedList insertFirst(LinkedList src, int data) {
		LinkedList temp = new LinkedList(data);
		temp.next = src;		
		return temp;
	}
	
	public LinkedList insertLast(LinkedList src, int data) {
		LinkedList temp = src;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new LinkedList(data);
		return src;
	}
	
	public LinkedList deleteFirst(LinkedList src) {
		return src.next;
	}
	
	public LinkedList deleteLast(LinkedList src) {
		LinkedList temp = src;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return src;
	}
	
	public LinkedList insertAfter(LinkedList src, int data, int after) {
		System.out.println("entered..");
		LinkedList temp = src;
		while(temp.next != null) {
			if(temp.data == after) {
				LinkedList l = new LinkedList(data);
				l.next = temp.next;
				temp.next = l;
				break;
			}
			temp = temp.next;
		}
		return src;
	}
	
	public boolean isCircular(LinkedList src) {
		LinkedList temp = src;
		while(temp.next != null) {
			temp = temp.next;
			if(temp.data == src.data) {
				return true;
			}
		}
		return false;
	}

}
