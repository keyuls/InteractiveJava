import com.demo.stack.DelimeterCheck;
import com.demo.stack.Reverser;
import com.demo.stack.Stack;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.insertFirst("1");
		linkedlist.insertFirst("2");
		linkedlist.insertFirst("3");
		linkedlist.insertFirst("4");
		
		linkedlist.displayLinkedList();
		
		Node f = linkedlist.find("4");
		if(f!=null)
			System.out.println("Node found"+ f.data);
		else
			System.out.println("Node not found");
		
		Node d = linkedlist.delete("3");
		if(d!=null)
			System.out.println("Node Deleted"+ d.data);
		else
			System.out.println("Node not deleted");
		
		while(!linkedlist.isEmpty()){
			Node deleted = linkedlist.deleteFirst();
			System.out.println("Deleted...." );
			deleted.displayNode();
		}
		
		linkedlist.displayLinkedList();
		
		
		//==== Stack with linkedlist ===//
		
		StackLink stacklink = new StackLink();
		stacklink.push("10");
		stacklink.push("20");
		stacklink.push("30");
		stacklink.push("40");
		stacklink.displayStack();
		System.out.println(stacklink.pop());
		System.out.println(stacklink.pop());
		stacklink.displayStack();
		
		//==== Queue with linkedlist ===//
		
		QueueList qlist = new QueueList();
		qlist.add("51");
		qlist.add("52");
		qlist.add("53");
		qlist.add("54");
		
		qlist.displayQueue();
		
		System.out.println(qlist.remove());
		
		qlist.displayQueue();
		
		//=== sorted LinkedList ===//
		
		SortedList sortedlist = new SortedList();
		sortedlist.insert("5");
		sortedlist.insert("7");
		sortedlist.insert("1");
		sortedlist.insert("3");
		sortedlist.displaySortedList();
		
		sortedlist.remove();
		sortedlist.remove();
		sortedlist.displaySortedList();
		
		//== Doubley Linkedlist ==//
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertFirst("21");
		doublyLinkedList.insertFirst("22");
		doublyLinkedList.insertFirst("23");
		doublyLinkedList.displayForward();
		
		doublyLinkedList.insertLast("31");
		doublyLinkedList.insertLast("32");
		doublyLinkedList.insertLast("33");
		doublyLinkedList.displayForward();
		
		DNode deleted = doublyLinkedList.deleteFirst();
		System.out.println("deleted first"+ deleted.data);
		DNode deleted2=doublyLinkedList.deleteFirst();
		System.out.println("deleted first"+ deleted2.data);
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		System.out.println("Display backward");
		doublyLinkedList.displayBackward();

		
		DNode ldeleted = doublyLinkedList.deleteLast();
		System.out.println("deleted last"+ ldeleted.data);
		DNode ldeleted2 = doublyLinkedList.deleteLast();
		System.out.println("deleted last"+ ldeleted2.data);
		doublyLinkedList.displayForward();
		
		doublyLinkedList.insertAfter("41", "21");
		System.out.println("Display forward after 41");
		doublyLinkedList.displayForward();
		System.out.println("Display backwward after 41");
		doublyLinkedList.displayBackward();
		
		doublyLinkedList.insertAfter("42", "31");
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		
		doublyLinkedList.insertAfter("43", "42");
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		
		DNode deletedkey = doublyLinkedList.deleteKey("42");
		System.out.println("deleted key"+ deletedkey.data);
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		DNode deletedkey2=doublyLinkedList.deleteKey("43");
		System.out.println("deleted key"+ deletedkey2.data);
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		DNode deletedkey3=doublyLinkedList.deleteKey("21");
		System.out.println("deleted key"+ deletedkey3.data);
		System.out.println("Display forward");
		doublyLinkedList.displayForward();
		System.out.println("Display backward");
		doublyLinkedList.displayBackward();
		
		//=== Stack ===//
		
		Stack stck = new Stack(5);
		stck.push('a');
		stck.push('b');
		stck.push('c');
		stck.push('d');
		stck.push('e');
		
		if(stck.isFull())
			System.out.println("stack full");
		
		System.out.println(stck.pop());
		System.out.println(stck.peek());
		System.out.println(stck.pop());
		
		//=== Reverse with Stack ===//
		
		Reverser rs1 = new Reverser("trap");
		System.out.println(rs1.doReverse());
		
		Reverser rs3 = new Reverser("");
		System.out.println(rs3.doReverse());
		
		Reverser rs2 = new Reverser("top123");
		System.out.println(rs2.doReverse());
		
		
		//=== Delimeter Check with Stack ===//
		
		DelimeterCheck dc1 = new DelimeterCheck("a{b(c]d}e");
		dc1.doDelimeterCheck();

		DelimeterCheck dc3 = new DelimeterCheck("a{b(c)");
		dc3.doDelimeterCheck();
		
		DelimeterCheck dc2 = new DelimeterCheck("c[d]");
		dc2.doDelimeterCheck();



	}

}
