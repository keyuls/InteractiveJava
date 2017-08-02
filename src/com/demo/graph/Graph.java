package com.demo.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	public int maxSize;
	public Vertex [] vertexList;
	public int [][] adjMatrix;
	public int nVertex;
	
	public Graph(int maxSize){
		this.maxSize = maxSize;
		vertexList = new Vertex [maxSize];
		adjMatrix = new int [maxSize][maxSize];
		nVertex = 0;
		
		for (int i=0;i<maxSize;i++)
			for(int j=0;j<maxSize;j++)
				adjMatrix[i][j]=0;
	}
	
	public void insert(char vertex){
		vertexList[nVertex++]= new Vertex(vertex);
	}
	
	public void addEdge(int start, int end){
		adjMatrix[start][end] =1;
		adjMatrix[end][start]=1; 
	}
	
	// Depth first search
	public void dfs(){
		Stack<Integer> stck = new Stack<Integer>();
		vertexList[0].isVisited = true;
		stck.push(0);
		displayVertex(0);
	
		
		while(!stck.isEmpty()){
			int v = stck.peek();
			int index = unVisitedVertex(v);
			if(index==-1){
				stck.pop();
			}
			else{
				vertexList[index].isVisited = true;
				stck.push(index);
				displayVertex(index);
			}						
		}
	}
	
	public int unVisitedVertex(int v){
		int vIndex =-1;
		for(int i=0;i<nVertex;i++){
			if(adjMatrix[v][i]==1 && vertexList[i].isVisited==false)
				vIndex = i;
		}
		return vIndex;
	}
	
	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
	
	public void reset(){
		for(int i=0;i<nVertex;i++)
			vertexList[i].isVisited = false;
	}
	
	// Breath first Search
	public void bfs(){
		reset();
		Queue<Integer> queue = new LinkedList<>();
		int unvisitedIndex;
		
		vertexList[0].isVisited = true;
		queue.add(0);
		displayVertex(0);
		
		while(!queue.isEmpty()){
			int index = queue.poll();

			while((unvisitedIndex =unVisitedVertex(index))!= -1){
				vertexList[unvisitedIndex].isVisited = true;
				queue.add(unvisitedIndex);
				displayVertex(unvisitedIndex);
			}
		}
		
	}
	
	//Minimum Spanning Tree
	public void MST(){
		reset();
		System.out.println("--MST--");
		Stack<Integer> stck = new Stack<Integer>();
		vertexList[0].isVisited = true;
		stck.add(0);
		
		while(!stck.isEmpty()){
			int currentVertex = stck.peek();
			int v = unVisitedVertex(currentVertex);
			if(v!=-1){
				vertexList[v].isVisited = true;
				stck.push(v);
				displayVertex(currentVertex);
				displayVertex(v);
				System.out.println("----");
			}
			else{
				stck.pop();
			}
		}
		
	}
	
	// Topological Sort
	public void topoSort(){
		char [] sortedArray = new char[nVertex];
		
		while(nVertex>0){
			int v = noSuccessor();
			
			if(v==-1){
				System.out.println("graph has loop");
				return;
			}
			sortedArray[nVertex-1] = vertexList[v].label;
			deleteVertex(v);
		}

		System.out.println("Topological sort");
		for(int i=0;i<sortedArray.length;i++){
			System.out.print(sortedArray[i]);
		}		
	}
	
	public int noSuccessor(){
		boolean isEdge;
		
		for(int i=0;i<nVertex;i++){
			isEdge = false;
			for(int j=0;j<nVertex;j++){
				if(adjMatrix[i][j]>0){
					isEdge = true;
					break;
				}
			}
			if(!isEdge){
				return i;
			}
		}
		return -1;
	}
	
	public void deleteVertex(int delVertex){
		if(delVertex != nVertex-1){
			for(int i=delVertex;i<nVertex-1;i++)
				vertexList[i]= vertexList[i+1];
			
			for(int i=delVertex;i<nVertex-1;i++)
				moveUp(i,nVertex);
			
			for(int i=delVertex;i<nVertex-1;i++)
				moveDown(i,nVertex);
		}
		nVertex--;
	}
	
	public void moveUp(int row, int nVertex){		
		for(int i=0;i<nVertex;i++)
			adjMatrix[row][i] = adjMatrix[row+1][i];
	}
	
	public void moveDown(int col, int nVertex){
		for(int j=0;j<nVertex;j++)
			adjMatrix[j][col]= adjMatrix[j][col+1];
	}
}
