
public interface WeightedGraphInterface<T> {

	boolean isEmpty();
	// Returns true if this graph is empty; otherwise, returns false.
	
	boolean isFull();
	// Returns true if this graph is full; otherwise, returns false.
	
	void addVertex(T vertex);
	// Preconditions: This graph is not full, vertex is not already in the graph, vertex is not null.
	
	// Adds vertex to this graph
	
	boolean hasVertex(T vertex);
	// Returns true if the graph has a vertex; otherwise, it returns false
	
	void addEdge(T fromVertex, T vertex, int weight);
	// Adds an edge with the specified weight from fromVertex to vertex
	
	int weight(T fromVertex, T toVertex);
	// returns the weight between fromVertex and toVertex, only if an edge is exists between the two
	// otherwise, returns null-edge value
	
	void getToVertices(T vertex);
	// Returns a queue of the vertices that vertex is adjacent to
	
	void clearMarks();
	// Unmarks all vertices
	
	void markVertices();
	// Marks vertices
	
	boolean isMarked(T Vertex);
	// checks if the current vertex is visited or marked and returns true; else returns false
	
	T getUnmarked();
	// Returns an unmarked vertex if any exist; otherwise, returns null
	
}
