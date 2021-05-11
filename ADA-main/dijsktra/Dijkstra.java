package dijsktra;

public class Dijkstra {

	public static void dijkstra(int a[][]) {

		int v = a.length;

		boolean visited[] = new boolean[v];

		int dist[] = new int[v];

		dist[0] = 0;

		for (int i = 1; i < v; i++) {
			dist[i] = 99999999;
		}

		for (int i = 0; i < v - 1; i++) {

			// min dist vertex
			int minVertex = findMinVertex(dist, visited);
			visited[minVertex] = true;

			// find neighbors
			for (int j = 0; j < v; j++) {
				if (a[minVertex][j] != 0 && !visited[j] && dist[minVertex] != 99999999) {
					int newDist = dist[minVertex] + a[minVertex][j];
					if (newDist < dist[j]) {
						dist[j] = newDist;
					}
				}
			}
		}

		// print
		System.out.println("Vertex \t\t Distance from source");
		for (int i = 0; i < v; i++) {
			System.out.println(i + " \t\t " + dist[i]);
		}

	}

	public static int findMinVertex(int[] distance, boolean visited[]) {

		int min = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i] && (min == -1 || distance[i] < distance[min])) {
				min = i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 0, 5, 0, 0, 0 }, { 0, 0, 0, 4, 6 }, { 0, 7, 0, 0, 0 }, { 0, 0, 2, 0, 0 }, { 3, 0, 0, 9, 0 } };
//		int b[][] = { { 0, 1, 5 }, { 1, 3, -4 }, { 1, 4, 6 }, { 2, 1, 7 }, { 3, 2, 2 }, { 4, 0, 3 }, { 4, 3, 9 } };
//		int a[][] = { { 0, 6, 5, 5, 0, 0, 0 }, { 0, 0, 0, 0, -1, 0, 0 }, { 0, 0, 0, 0, 5, 0, 0 },
//				{ 0, 0, -2, 0, 0, -1, 0 }, { 0, 0, 0, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0, 3 }, { 0, 0, 0, 0, 0, 0, 0 } };

		dijkstra(a);
	}

}
