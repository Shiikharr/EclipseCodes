package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private int V;
	private int E;
	private LinkedList<Integer> adj[];
	
	public BFS(int nodes)
	{
		this.V=nodes;
		this.E=0;
		this.adj=new LinkedList[nodes];
		for(int i=0;i<V;i++)
		{
			this.adj[i]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	public void BFSIterative(int s)
	{
		boolean visited[]=new boolean[V];
		Queue<Integer> queue=new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty())
		{
			int u=queue.poll();
			System.out.print(u+" ");
			for(int w:adj[u])
			{
				if(!visited[w])
				{
					visited[w]=true;
					queue.add(w);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BFS ob=new BFS(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		ob.addEdge(2, 4);
		ob.BFSIterative(0);
	}

}
