package Graphs;

import java.util.LinkedList;

public class GraphsAdjacentLists {

	private LinkedList<Integer> adj[];
	private int V;
	private int E;
	
	public GraphsAdjacentLists(int nodes)
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
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(V+" vertices, "+E+" Edges"+"\n");
		for(int v=0;v<V;v++)
		{
			sb.append(v+ ": ");
			for(int w: adj[v])
			{
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		GraphsAdjacentLists ob=new GraphsAdjacentLists(4);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		System.out.println(ob);
	}

}
