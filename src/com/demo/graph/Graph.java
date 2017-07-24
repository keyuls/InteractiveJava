package com.demo.graph;

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
}
