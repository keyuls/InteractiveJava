
public class SortedList {
	private Node head;
	
	public SortedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public void insert(String data){
		Node current = head;
		Node previous = null;
		
		while(current!=null && Integer.parseInt(data) > Integer.parseInt(current.data)){
			previous = current;
			current = current.next;		
		}
		
		Node temp= new Node(data);
		
		if(previous==null)
			head = temp;
		else
			previous.next = temp;
		temp.next = current;
	}
	
	public Node remove(){
		if(!isEmpty()){
			Node temp = head;
			head=head.next;
			return temp;
		}
		return null;
	}
	
	public void displaySortedList(){
		Node current = head;
		while(current!=null){
			current.displayNode();
			current = current.next;
		}
	}
}
