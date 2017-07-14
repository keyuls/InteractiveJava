
public class DNode {
	public String data;
	public DNode next;
	public DNode previous;
	
	
	public DNode(String data){
		this.data=data;
	}
	
	public void displayDNode(){
		System.out.println("["+data+"]");
	}
}
