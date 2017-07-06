
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

	}

}
