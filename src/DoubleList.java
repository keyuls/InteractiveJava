
public class DoubleList {
	
	private Node head;
	private Node tail;
	
	public DoubleList(){
		this.head=null;
		this.tail=null;
	}
	
	public void insertLast(String data){
		Node node = new Node(data);
		if(isEmpty())
			head = node;
		else
			tail.next = node;
		tail = node;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public String deleteFirst(){	
		if(!isEmpty()){
			String data = head.data;
			if(head.next==null)
				tail=null;
			head = head.next;
			return data;
		}
		return null;
	}
	
	public void displayDoubleList(){
		Node current = head;
		while(current != null){
			current.displayNode();
			current= current.next;
		}
	}

}
