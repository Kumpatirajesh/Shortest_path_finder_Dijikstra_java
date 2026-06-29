Shortest-Path-Finder-Dijkstra-Java
Repository navigation
Code
Issues
Pull requests
Shortest-Path-Finder-Dijkstra-Java
/README.md
Vishnu-5346
Vishnu-5346
4 days ago
103 lines (83 loc) · 2.91 KB

Preview

Code

Blame
Shortest Path Finder using Dijkstra's Algorithm in Java
A simple and interactive Java implementation of Dijkstra's Shortest Path Algorithm for find the shortest distance from a single source vertex to all other vertices in a directed or undirected graph with non-negative edge weights.

🚀 Algorithm Details
The implementation follows these steps:

Start
Read the number of vertices (
V
).
Read the adjacency matrix representing the graph's edge weights.
Read the source vertex.
Initialize:
Distance array with infinity (Integer.MAX_VALUE).
Visited array with false.
Set the distance of the source vertex to 0.
Repeat (
V
−
1
) times:
Find the unvisited vertex having the minimum distance.
Mark it as visited.
Update the distances of all adjacent vertices if a shorter path is found.
Display the shortest distance from the source to every vertex.
Stop
📁 Repository Structure
Shortest-Path-Finder-Dijkstra-Java/
│── Main.java       # User interface & input handling
│── Dijkstra.java   # Dijkstra's Algorithm implementation
└── README.md       # Project documentation
🛠️ How to Compile and Run
Make sure you have Java Development Kit (JDK) installed on your system.

1. Compile the Code
Open your terminal/command prompt and navigate to the project directory, then run:

javac Main.java Dijkstra.java
2. Run the Program
Run the compiled class files using:

java Main
📋 Example Walkthrough
🕹️ Input
Let's consider a graph with 3 vertices (0, 1, 2).

Adjacency Matrix Input:

Vertex 0 to 0: 0
Vertex 0 to 1: 4
Vertex 0 to 2: 2
Vertex 1 to 0: 0
Vertex 1 to 1: 0
Vertex 1 to 2: 1
Vertex 2 to 0: 0
Vertex 2 to 1: 3
Vertex 2 to 2: 0
Source Vertex: 0

💻 Console Interface Example
========================================================
   Dijkstra's Shortest Path Finder (Java Mini Project)  
========================================================
Enter the number of vertices: 3
Enter the adjacency matrix (size 3x3):
(Enter positive weight for edge, and 0 if there is no edge)
Weight from Vertex 0 to 0: 0
Weight from Vertex 0 to 1: 4
Weight from Vertex 0 to 2: 2
Weight from Vertex 1 to 0: 0
Weight from Vertex 1 to 1: 0
Weight from Vertex 1 to 2: 1
Weight from Vertex 2 to 0: 0
Weight from Vertex 2 to 1: 3
Weight from Vertex 2 to 2: 0
Enter the source vertex (0 to 2): 0

========================================================
   SHORTEST PATHS FROM SOURCE VERTEX 0
========================================================
Destination     | Shortest Distance   
--------------------------------------------------------
Vertex 0        | 0                   
Vertex 1        | 4                   
Vertex 2        | 2                   
========================================================