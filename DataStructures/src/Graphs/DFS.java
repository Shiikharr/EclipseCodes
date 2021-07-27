package Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

	private int V;
	private int E;
	private LinkedList<Integer> adj[];
	
	public DFS(int nodes)
	{
		this.V=nodes;
		this.E=0;
		this.adj=new LinkedList[nodes];
		for(int i=0;i<V;i++)
		{
			this.adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int u, int v)
	{
		adj[v].add(u);
		adj[u].add(v);
		E++;
	}
	
	public void DFSIterative(int s)
	{
		boolean visited[]=new boolean[V];
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(s);
		while(!stack.isEmpty())
		{
			int u=stack.pop();
			if(!visited[u])
			{
				visited[u]=true;
				System.out.print(u+" ");
				for(int w: adj[u])
				{
					if(!visited[w])
					{
						stack.push(w);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DFS ob=new DFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		ob.addEdge(2, 4);
		ob.DFSIterative(0);

	}

}
