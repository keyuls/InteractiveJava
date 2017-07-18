package com.demo.stack;

public class Stack {
	
	private char [] arr;
	private int maxSize;
	private int top;
	
	public Stack(int maxSize){
		this.maxSize = maxSize; 
		arr = new char[this.maxSize];
		top = -1;
	}
	
	public void push(char str){
		arr[++top] = str;
	}
	
	public char pop(){
		return arr[top--];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top==maxSize-1);
	}
	
	public char peek(){
		return arr[top];
	}

}
