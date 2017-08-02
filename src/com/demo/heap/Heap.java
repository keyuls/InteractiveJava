package com.demo.heap;

public class Heap {

	private int [] arr;
	private int maxSize;
	private int currentItems;
	
	
	public Heap(int size){
		maxSize =size;
		arr = new int[size];
		currentItems=0;
	}
	
	public void insert(int data){
		if(currentItems== maxSize)
			return;
		arr[currentItems]= data;
		trickleUp(currentItems);
		currentItems++;
	}
	
	public void trickleUp(int index){
		int data = arr[index];
		int parent = (index-1)/2 ;
		
		while(index>0 && arr[parent]<data){
			arr[index]= arr[parent];
			index = parent;
			parent = (parent-1)/2 ;
		}
		arr[index]= data;		
	}
	
	public int remove(){
		
		int top = arr[0];
		arr[0]= arr[currentItems-1];
		trickleDown(0);
		currentItems--;
		return top;
	}
	
	public void trickleDown(int index){
		int temp = arr[index];
		int larger;
		
		
		while(index<currentItems/2){
			int leftChild = 2*index+1;
			int rightChild = leftChild+1;
			
			if(rightChild<currentItems && arr[rightChild]>arr[leftChild])
				larger = rightChild;
			else
				larger = leftChild;
			if(arr[larger]<temp){
				break;
			}
			arr[index]= arr[larger];
			index = larger;
		}
		arr[index]=temp;		
	}
	
	public void change(int data, int index){
		int temp = arr[index];
		arr[index]= data;
		
		if(data>temp)
			trickleUp(index);
		else
			trickleDown(index);
		
	}
	
	public void heapDisplay(){
		System.out.println("Display Heap");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
