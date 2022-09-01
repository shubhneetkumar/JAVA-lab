// A Java program for Bellman-Ford's single source
// shortest path algorithm.

class Bellman
{

static void BellmanFord(int graph[][], int V, int E, int src)
{
	// Initialize distance of all vertices as infinite.
	int []dis = new int[V];
	for (int i = 0; i < V; i++)
		dis[i] = Integer.MAX_VALUE;

	// initialize distance of source as 0
	dis[src] = 0;

	// Relax all edges |V| - 1 times. A simple
	// shortest path from src to any other
	// vertex can have at-most |V| - 1 edges
	for (int i = 0; i < V - 1; i++)
	{

		for (int j = 0; j < E; j++)
		{
			if (dis[graph[j][0]] != Integer.MAX_VALUE && dis[graph[j][0]] + graph[j][2] <dis[graph[j][1]])
				dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
		}
	}

	for (int i = 0; i < E; i++)
	{
		int x = graph[i][0];
		int y = graph[i][1];
		int weight = graph[i][2];
		if (dis[x] != Integer.MAX_VALUE &&
				dis[x] + weight < dis[y])
			System.out.println("Graph contains negative"+" weight cycle");
	}

	System.out.println("Vertex Distance from Source");
	for (int i = 0; i < V; i++)
		System.out.println(i + "\t\t" + dis[i]);
}

// Driver code
public static void main(String[] args)
{
	int V = 5; // Number of vertices in graph
	int E = 8; // Number of edges in graph

	int graph[][] = { { 0, 1, -1 }, { 0, 2, 4 },
					{ 1, 2, 3 }, { 1, 3, 2 },
					{ 1, 4, 2 }, { 3, 2, 5 },
					{ 3, 1, 1 }, { 4, 3, -3 } };

	BellmanFord(graph, V, E, 0);
	}
}

