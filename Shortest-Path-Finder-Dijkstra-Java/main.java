import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   Dijkstra's Shortest Path Finder");
        System.out.println("==============================================");

        try {
            System.out.print("Enter the number of vertices: ");
            int V = scanner.nextInt();

            if (V <= 0) {
                System.out.println("Number of vertices must be greater than 0.");
                return;
            }

            int[][] graph = new int[V][V];

            System.out.println("\nEnter the adjacency matrix:");
            System.out.println("(Enter 0 if there is no edge)");

            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print("Weight from " + i + " to " + j + ": ");
                    graph[i][j] = scanner.nextInt();

                    if (graph[i][j] < 0) {
                        System.out.println("Negative weights are not allowed.");
                        return;
                    }
                }
            }

            System.out.print("\nEnter the source vertex (0-" + (V - 1) + "): ");
            int source = scanner.nextInt();

            if (source < 0 || source >= V) {
                System.out.println("Invalid source vertex.");
                return;
            }

            Dijkstra.findShortestPath(graph, source);

        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}