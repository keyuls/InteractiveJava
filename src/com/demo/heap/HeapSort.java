package com.demo.heap;

public class HeapSort {

	private int [] arr;
	private int maxSize;
	private int currentItems;
	
	public HeapSort(int size){
		maxSize = size;
		arr= new int[maxSize];
		currentItems=0;
	}
	
	public int remove(){
		int top = arr[0];
		currentItems--;
		arr[0] = arr[currentItems];
		trickleDown(0);
		return top;
	}
	
	public void trickleDown(int index){
		int temp = arr[index];
		int largeIndex = 0;
		
		while(index<currentItems/2){
			int left = 2*index+1;		
			int right= left+1;
			if(right< currentItems && arr[right]>arr[left])
				largeIndex = right;
			else
				largeIndex = left;
			if(arr[largeIndex]<temp)
				break;
			arr[index]= arr[largeIndex];
			index=largeIndex;
		}
		arr[index]=temp;
	}
	
	public void insertAt(int data, int index){
		arr[index]= data;
	}
	
	public void incrementItems(){
		currentItems++;
	}
	
	public void displayHeap(){
		System.out.println("Heap sort Display");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
