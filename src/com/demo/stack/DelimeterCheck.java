package com.demo.stack;

public class DelimeterCheck {
	
	private String input;

	public DelimeterCheck(String input){
		this.input = input;
	}
	
	public void doDelimeterCheck(){
		
		Stack stck = new Stack(input.length());
		
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			
			switch(ch){
			
			case '{':
			case '(':
			case '[':
				stck.push(ch);
				break;
				
			case '}':
			case ')':
			case ']':
				if(!stck.isEmpty()){
					char chx= stck.pop();
					if(ch=='}' && chx!='}' || ch==')' && chx!='(' || ch==']' && chx!='[' ){
						System.out.println("Error at "+ ch );
					}
				}
				else
					System.out.println("Error: stack empty");
				break;
			default:
				break;
			}
		}	
			
			if(!stck.isEmpty())
				System.out.println("Error: Missing right delimeter");

	}

}
