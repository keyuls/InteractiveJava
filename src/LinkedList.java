
public class LinkedList {

	private Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public boolean isEmpty(){
		return(head==null);
	}

	public void insertFirst(String data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public Node deleteFirst(){
		if(!isEmpty()){
			Node temp = head;
			head = head.next;
			return temp;
		}
		return null;
	}
	
	public void displayLinkedList(){
		Node current = head;
		while(current!= null){
			current.displayNode();
			current = current.next;
		}
	}
	
	public Node find(String data){
		if(!isEmpty()){
		Node current = head;
			while(current.data!=data){
				if(current.next==null)
					return null;
				else
					current= current.next;
			}
			return current;
		}
		return null;
	}
	
	public Node delete(String data){
		
		while(! isEmpty()){
			Node current =head;
			Node previous = head;
			
			while(current.data != data){
				if(current.next==null)
					return null;
				else{
					previous = current;
					current = current.next;
				}
			}
			
			if(current == head)
				head = head.next;
			else
				previous.next = current.next;
			return current;
		}
		return null;
	
	}
}
