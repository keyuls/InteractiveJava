package com.demo.stack;

public class Reverser {

	private String input;
	private String output;
	
	public Reverser(String input){
		this.input = input;
	}
	
	public String doReverse(){
		Stack stck = new Stack(input.length());
		
		for(int i=0;i<input.length();i++){
			stck.push(input.charAt(i));
		}
		output="";
		while(!stck.isEmpty()){
			char ch = stck.pop();
			output = output+ch;
		}
		return output;
	}
}
