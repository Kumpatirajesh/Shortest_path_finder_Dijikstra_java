public class Dijkstra {
    /**
     * Finds the shortest path from the source vertex to all other vertices in the graph.
     * 
     * @param adjacencyMatrix The weight representation of the graph.
     *                        adjacencyMatrix[i][j] is 0 if there is no edge between i and j,
     *                        and a positive weight if there is an edge.
     * @param source The starting vertex.
     */
    public static void findShortestPath(int[][] adjacencyMatrix, int source) {
        int V = adjacencyMatrix.length;
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];

        // 1. Initialize distance array with infinity (Integer.MAX_VALUE) and visited array as false.
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // 2. Set distance of the source vertex to 0.
        distance[source] = 0;

        // 3. Repeat (V - 1) times.
        for (int count = 0; count < V - 1; count++) {
            // Find the unvisited vertex having the minimum distance.
            int u = findMinDistanceVertex(distance, visited, V);
            
            // If all reachable vertices have been visited, break.
            if (u == -1) {
                break;
            }

            // Mark it as visited.
            visited[u] = true;

            // Update the distances of all adjacent vertices if a shorter path is found.
            for (int v = 0; v < V; v++) {
                // We update distance[v] only if:
                // - v is not visited
                // - there is an edge from u to v (adjacencyMatrix[u][v] != 0)
                // - u is reachable (distance[u] != Integer.MAX_VALUE)
                // - new path weight is less than the current distance[v]
                if (!visited[v] && adjacencyMatrix[u][v] != 0 && distance[u] != Integer.MAX_VALUE) {
                    int newDist = distance[u] + adjacencyMatrix[u][v];
                    if (newDist < distance[v]) {
                        distance[v] = newDist;
                    }
                }
            }
        }

        // 4. Display the shortest distance from the source to every vertex.
        displayShortestPaths(source, distance);
    }

    /**
     * Helper method to find the vertex with the minimum distance value,
     * from the set of vertices not yet included in the shortest path tree.
     */
    private static int findMinDistanceVertex(int[] distance, boolean[] visited, int V) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && distance[v] <= min) {
                min = distance[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    /**
     * Displays the shortest path distances in a clean, tabulated format.
     */
    private static void displayShortestPaths(int source, int[] distance) {
        System.out.println("\n========================================================");
        System.out.println("   SHORTEST PATHS FROM SOURCE VERTEX " + source);
        System.out.println("========================================================");
        System.out.printf("%-15s | %-20s\n", "Destination", "Shortest Distance");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < distance.length; i++) {
            String distStr = (distance[i] == Integer.MAX_VALUE) ? "INF (Unreachable)" : String.valueOf(distance[i]);
            System.out.printf("Vertex %-8d | %-20s\n", i, distStr);
        }
        System.out.println("========================================================\n");
    }
}