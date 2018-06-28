package LinkedList;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedListFunctions func = new LinkedListFunctions();
		LinkedList[] list = new LinkedList[n];
		LinkedList temp = new LinkedList();
		temp.data = in.nextInt();
		list[0] = temp;
		for (int i = 1; i < n; i++) {
			LinkedList l = new LinkedList();
			l.data = in.nextInt();
			temp.next = l;
			temp = temp.next;
		}
		//func.traverseLinkedList(list[0]);
		//LinkedList ll = func.deleteFirst(list[0]);
		//LinkedList ll = func.deleteLast(list[0]);
		//LinkedList ll = func.insertLast(list[0], in.nextInt());
		//LinkedList ll = func.insertFirst(list[0], in.nextInt());
		//LinkedList ll = func.insertAfter(list[0], in.nextInt(), in.nextInt());
		//func.traverseLinkedList(ll);

		if(func.isCircular(list[0])) {
			System.out.println("Is a cirular Linked List");
		} else {
			System.out.println("Is not a cirular Linked List");
		}
	}


}
