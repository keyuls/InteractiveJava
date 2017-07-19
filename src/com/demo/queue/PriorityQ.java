package com.demo.queue;

public class PriorityQ {
	private int maxSize;
	private int[] arr;
	private int nItems;
	
	public PriorityQ(int size){
		maxSize =size;
		arr = new int[size];
		nItems=0;
	}
	
	public void insert(int num){
		if(nItems==0)
			arr[nItems++]=num;
		else{
			int j;
			for(j=nItems-1;j>=0;j--){
				if(num>arr[j]){
					arr[j+1]= arr[j];
				}
				else
					break;
			}
			arr[j+1]=num;
			nItems++;
		}
	}
	
	public int remove(){
		return arr[--nItems];
	}
	
	public int peekMin(){
		return arr[nItems-1];
	}
	
	public boolean isEmpty(){
		return(nItems==0);
	}
	
	public boolean isFull(){
		return (nItems==maxSize);
	}
	
}
