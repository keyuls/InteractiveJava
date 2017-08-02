import com.demo.heap.Heap;
import com.demo.graph.Graph;
import com.demo.heap.HeapSort;
import com.demo.queue.PriorityQ;
import com.demo.queue.Queue;
import com.demo.stack.DelimeterCheck;
import com.demo.stack.Reverser;
import com.demo.stack.Stack;
import com.demo.tree.Tree;
import com.demo.tree.TreeNode;

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
		
		//=== Queue ===//
		
		Queue q1 = new Queue(4);
		q1.insert('a');
		q1.insert('b');
		q1.insert('c');
		q1.insert('d');
		
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		
		q1.insert('e');
		q1.insert('f');
		
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		
		//== Priority Queue with Array ==//
		
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		while( !thePQ.isEmpty() )
		{
		long item = thePQ.remove();
		System.out.println(item);
		} 
		
		//== Heap ==//
		
				Heap hp = new Heap(5);
				hp.insert(101);
				hp.insert(201);
				hp.insert(301);
				hp.insert(401);
				hp.insert(501);
				
				hp.heapDisplay();
				
				hp.remove();
				hp.heapDisplay();
		
		//== Heap Sort ===//
		
		HeapSort hsort = new HeapSort(5);
		hsort.insertAt(100, 0);
		hsort.incrementItems();
		hsort.insertAt(90, 1);
		hsort.incrementItems();
		hsort.insertAt(80, 2);
		hsort.incrementItems();
		hsort.insertAt(70, 3);
		hsort.incrementItems();
		hsort.insertAt(60, 4);
		hsort.incrementItems();
		
		hsort.displayHeap();
		
		for(int j=((5/2)-1); j>=0;j--){
			hsort.trickleDown(j);
		}
		hsort.displayHeap();
		
		for(int k=4;k>=0;k--){
			int temp = hsort.remove();
			hsort.insertAt(temp, k);
		}
		
		hsort.displayHeap();
		
		
		//== Tree ===//
		
		Tree tree = new Tree();
		tree.insert(50);
		tree.insert(10);
		tree.insert(60);
		tree.insert(40);
		tree.insert(70);
		tree.insert(80);
		tree.insert(20);
		tree.insert(5);
		tree.insert(55);
		tree.insert(57);
		tree.insert(54);
		tree.insert(65);
		tree.insert(63);
		tree.insert(64);

		System.out.println("Tree Display");
		tree.display();
		
		tree.delete(5);
		System.out.println("Tree Delete 5");
		tree.display();
		
		tree.delete(40);
		System.out.println("Tree Delete 40");
		tree.display();
		
		tree.delete(60);
		System.out.println("Tree Delete 60");
		tree.display();
		
		//== Graph ==//
		Graph theGraph = new Graph(20); 
		theGraph.insert('A');    // 0  (start for dfs)
		theGraph.insert('B');    // 1 
		theGraph.insert('C');    // 2 
		theGraph.insert('D');    // 3 
		theGraph.insert('E');    // 4
		theGraph.addEdge(0, 1);     // AB 
		theGraph.addEdge(1, 2);     // BC 
		theGraph.addEdge(0, 3);     // AD 
		theGraph.addEdge(3, 4);     // DE
		theGraph.addEdge(1, 4);     // BE
		System.out.println("DFS"); 
		theGraph.dfs(); 
		System.out.println("BFS"); 
		theGraph.bfs(); 
		theGraph.MST();
		
		// Topological sort
		Graph tgraph = new Graph(20); 
		tgraph.insert('A');    // 0 
		tgraph.insert('B');    // 1 
		tgraph.insert('C');    // 2 
		tgraph.insert('D');    // 3 
		tgraph.insert('E');    // 4 
		tgraph.insert('F');    // 5 
		tgraph.insert('G');    // 6 
		tgraph.insert('H');    // 7
		tgraph.addEdge(0, 3);     // AD 
		tgraph.addEdge(0, 4);     // AE 
		tgraph.addEdge(1, 4);     // BE 
		tgraph.addEdge(2, 5);     // CF 
		tgraph.addEdge(3, 6);     // DG 
		tgraph.addEdge(4, 6);     // EG 
		tgraph.addEdge(5, 7);     // FH 
		tgraph.addEdge(6, 7);     // GH
		tgraph.topoSort();
		

	}

}
