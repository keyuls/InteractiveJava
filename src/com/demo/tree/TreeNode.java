package com.demo.tree;

public class TreeNode {

	public int data;
	public TreeNode leftChild;
	public TreeNode rightChild;
	
	public TreeNode(int data){
		this.data = data;
		leftChild = null;
		rightChild = null;
	}
	
	
	public void displayTreeNodeData(){
		System.out.println(data);
	}
}
