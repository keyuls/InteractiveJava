package com.demo.queue;

public class Queue {

	private int maxSize;
	private int nItems;
	private int front;
	private int rear;
	private char [] arr;
	
	public Queue(int size){
		this.maxSize = size;
		this.nItems =0;
		this.rear=-1;
		this.front=0;
		this.arr = new char [size];
	}
	
	public void insert(char ch){
		if(rear==maxSize-1){
			rear= -1;
		}
		 arr[++rear] = ch;
		 nItems=nItems+1;
	}
	public char remove(){
		if(front==maxSize)
			front=0;
		char temp = arr[front]; 
		front = front+1;
		nItems = nItems-1;
		return temp;
		
	}
	
	public boolean isEmpty(){
		return (nItems==0);
	}
	
	public boolean isFull(){
		return (maxSize==nItems);
	}
	
}
