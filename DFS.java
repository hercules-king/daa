import java.util.*;
public class DFS{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int nn=sc.nextInt();
		int graph[][]=new int[nn][nn];
		for(int i=0;i<nn;i++)
			for(int j=0;j<nn;j++)
				graph[i][j]=0;
		int ne=sc.nextInt();
		for(int i=0;i<ne;i++) {
			int i1=sc.nextInt();
			int i2=sc.nextInt();
			graph[i1][i2]=1;
			graph[i2][i1]=1;
		}
		ArrayList<Integer> visited=new ArrayList<Integer>();
		visited.add(0);
		traverse(0,graph,visited);
	}
	public static void traverse(int node,int graph[][],ArrayList<Integer> al) {
		System.out.print(node+" ");
		for(int i=0;i<graph.length;i++) {
				if(graph[node][i]==1&&al.indexOf(i)==-1) {
					al.add(i);
					traverse(i,graph,al);
				}
			}
	}
}
