
public class QueueList {
	
	private DoubleList doubleList;
	
	public QueueList(){
		doubleList = new DoubleList();
	}
	
	public void add (String data){
		doubleList.insertLast(data);
	}
	
	public String remove(){	
		if(!doubleList.isEmpty())
			return doubleList.deleteFirst();
		else
			return null;
	}
	
	public boolean isEmpty(){
		return doubleList.isEmpty();
	}

	public void displayQueue(){
		 doubleList.displayDoubleList();
	}
}
