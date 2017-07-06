
public class StackLink {
	
	private LinkedList linkedlist;
	
	public StackLink(){
		this.linkedlist = new LinkedList();
	}
	
	public void push(String data){
		linkedlist.insertFirst(data);
	}
	
	public String pop(){
		return linkedlist.deleteFirst().data;
	}
	
	public boolean isEmpty(){
		return (linkedlist.isEmpty());
	}
	
	public void displayStack(){
		linkedlist.displayLinkedList();
	}
	

}
