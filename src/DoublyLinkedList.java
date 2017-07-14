
public class DoublyLinkedList {
	private DNode head;
	private DNode tail;
	
	public DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public void insertFirst(String data){
		DNode newNode = new DNode(data);
		if(isEmpty()){
			tail = newNode;
		}else{
			newNode.next=head;
			head.previous=newNode;
		}
		head = newNode;
	}
	
	public void insertLast(String data){
		DNode newNode = new DNode(data);
		if(!isEmpty()){
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	
	public DNode deleteFirst(){
		if(!isEmpty()){
			DNode temp = head;
			if(tail==head){
				return head;
			}
			head.next.previous = null;
			head = head.next;
			return temp;
		}
		return null;
	}
	
	public DNode deleteLast(){
		if(!isEmpty()){
			DNode temp = tail;
			if(tail==head)
				return tail;
			tail.previous.next=null;
			tail = tail.previous;
			return temp;
		}
		return null;
	}
	
	public void insertAfter(String data , String after){
		if(!isEmpty()){
			DNode nNode = new DNode(data);
			DNode current = head;
			while(!current.data.equals(after)){
				current = current.next;
				if(current==null){
					return;
				}
			}
			nNode.next = current.next;
			nNode.previous = current;
			
			if(current == tail){
				current.next = nNode;
				tail = nNode;
				return;
			}
			current.next.previous = nNode;	
			current.next = nNode;
		}	
	}
	
	public DNode deleteKey(String data){
		if(!isEmpty()){
			DNode current = head;
			while(current.data!= data){
				current = current.next;
				if(current==null)
					return null;
			}
			if(current==head){
				head= current.next;
				head.previous=null;
			}
			else if(current == tail){
				tail= current.previous;
				tail.next = null;
				
			}
			else{
			current.previous.next = current.next;
			current.next.previous = current.previous;
			}
			return current;	
		}
		return null;
	}
	
	public void displayForward(){
		if(!isEmpty()){
			DNode current = head;
			while(current!=null){
				current.displayDNode();
				current = current.next;
			}
		}
	}
	
	public void displayBackward(){
		if(!isEmpty()){
			DNode current = tail;
			while(current!=null){
				current.displayDNode();
				current = current.previous;
			}
		}
	}
	
}
