package bellman_ford;

public class Bellman {

	static void BellmanFord(int a[][], int v, int e, int src) {

		int[] dist = new int[v];

		for (int i = 0; i < v; i++)
			dist[i] = 999999999;

		dist[src] = 0;

		for (int i = 0; i < v - 1; i++) {

			for (int j = 0; j < e; j++) {
				if (dist[a[j][0]] != 999999999 && dist[a[j][0]] + a[j][2] < dist[a[j][1]])
					dist[a[j][1]] = dist[a[j][0]] + a[j][2];

//				int x = a[i][0];
//				int y = a[i][1];
//				int weight = a[i][2];
//				if (dist[x] != 999999999 && dist[x] + weight < dist[y])
//					System.out.println("Graph contains negative" + " weight cycle");
			}
		}

		for (int i = 0; i < e; i++) {
			int x = a[i][0];
			int y = a[i][1];
			int weight = a[i][2];
			if (dist[x] + weight < dist[y])
				System.out.println("Graph contains negative" + " weight cycle");
		}

		System.out.println("Vertex" + "\t\t" + "Distance from Source");
		for (int i = 0; i < v; i++)
			System.out.println(i + "\t\t" + dist[i]);
	}

	public static void main(String[] args) {
		int v = 5;
		int e = 7;

//		int a[][] = { { 0, 5, 0, 0, 0 }, { 0, 0, 0, -4, 6 }, { 0, 7, 0, 0, 0 }, { 0, 0, 2, 0, 0 }, { 3, 0, 0, 9, 0 } };
		int a[][] = { { 1, 3, -4 }, { 1, 4, -6 }, { 2, 1, 7 }, { 3, 2, 2 }, { 4, 0, -3 }, { 4, 3, 9 }, { 0, 1, 5 } };

		BellmanFord(a, v, e, 0);
	}
}
