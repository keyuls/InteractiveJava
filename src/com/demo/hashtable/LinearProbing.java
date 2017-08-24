package com.demo.hashtable;

public class LinearProbing {
	
	private HashData newItem;
	
	public LinearProbing(){
		newItem = new HashData(-1);
	}
	
	public void insert(int val){
		HashData hm = new HashData(val);
		int key = hashFunc(val);
	}
	
	public int hashFunc(int val){
		return val%arraySize;
	}
}
