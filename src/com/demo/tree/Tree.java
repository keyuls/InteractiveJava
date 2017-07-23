package com.demo.tree;

public class Tree {
	
	private TreeNode root;

	public void insert(int data){
		TreeNode newNode = new TreeNode(data);
		
		if(root==null){
			root=newNode;
			return;
		}
		
		TreeNode current = root;
		TreeNode parent = root;
		while(true){
			parent = current;
			if(data<current.data){
				current=  current.leftChild;
				if(current == null){
					parent.leftChild = newNode;
					return;
				}
			}
			else{
				current = current.rightChild;
				if(current == null){
					parent.rightChild = newNode;
					return;
				}
			}	
		}
		
	}
	
	public boolean find(int data){
		TreeNode current =root;
		while(current.data!= data){
			
			if(data<current.data)
				current = current.leftChild;
			else
				current = current.rightChild;
			
			if(current==null)
				return false;
		}
		return true;
	}
	
	public void delete(int data){
		TreeNode current = root; 
		TreeNode parent = root;
		boolean isLeftChild = true;
		
		while(current.data!=data){
			parent = current;
			if(data<current.data){
				isLeftChild = true;
				current= current.leftChild;
			}
			else{
				current = current.rightChild;
				isLeftChild = false;
			}
			
			if(current==null)
				return;
		}
		
		if(current.leftChild==null && current.rightChild==null){
			if(current==root)
				root = null;
			else if(isLeftChild)
				parent.leftChild=null;
			else
				parent.rightChild=null;
		}
		
		else if(current.leftChild==null){
				if(current==root)
					root = null;
				else if(isLeftChild)
					parent.leftChild = current.rightChild;
				else
					parent.rightChild = current.rightChild;
		}
		
		else if(current.rightChild==null){
				if(current==root)
					root = null;
				else if(isLeftChild)
					parent.leftChild = current.leftChild;
				else
					parent.rightChild = current.leftChild;
		}
		else{
			TreeNode successor = getSuccessor(current);
			if(current==root)
				root = successor;
			if(isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			successor.leftChild = current.leftChild;
		}
	}
	
	public TreeNode getSuccessor(TreeNode delNode){
		TreeNode successorParent = delNode;
		TreeNode successor = delNode;
		TreeNode current = delNode.rightChild;
		while(current!=null){
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor!=delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;			
		}
		
		return successor;
	}
	
	public void preOrder(TreeNode current){
		if(current!=null){
			System.out.println(current.data);
			preOrder(current.leftChild);
			preOrder(current.rightChild);
		}
	}
	
	public void postOrder(TreeNode current){
		if(current!=null){
			postOrder(current.leftChild);
			postOrder(current.rightChild);
			System.out.println(current.data);
		}
	}
	
	public void inOrder(TreeNode current){
		if(current!=null){
			inOrder(current.leftChild);
			System.out.println(current.data);
			inOrder(current.rightChild);
		}
	}
	
	public void display(){
		inOrder(root);
	}
}
