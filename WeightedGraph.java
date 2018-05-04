import java.util.*;
public class WeightedGraph<T>  {
	
	int defaultValue;
	int capacity;
	int[][] weight;
	int[][] edge;
	T[][] vertices;
	
	public WeightedGraph() {
		weight = new int[defaultValue][defaultValue];
		edge = new int[defaultValue][defaultValue];
		vertices = (T[][]) new Object[defaultValue][defaultValue];
		
		
		
	}
	
	public WeightedGraph(int j) {
		this.capacity = j;
		setCapacity(j);
		weight = new int[j][j];
		edge = new int[j][j];
		vertices = (T[][]) new Object[j][j];
		
	}
	
	
	public void Print() {
		
		System.out.println("The Weight's of each Node on the graph:");
		
		for(int i = 0; i < weight.length; i ++) {
			
			for(int x = 0; x < weight[i].length; x++) {
				System.out.print("  " + weight[i][x]);
			}
			System.out.println();
			
		}
		
		System.out.println("The Edges on the Graph between Nodes:");
		for(int in = 0; in < edge.length; in ++) {
			
			for(int xo = 0; xo < edge[in].length; xo++) {
				System.out.print("  " + edge[in][xo]);
			}
			
			System.out.println();
			
		}
		
		System.out.println("The Vertices on the Graph: ");
		for(int row = 0; row < vertices.length; row ++) {
			
			for(int column = 0; column < vertices[row].length; column++) {
				System.out.print("  " + vertices[row][column]);
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
	public void addEdge(T fromV, T toV, int weightValue) {
		/*int x = Math.abs(fromV.hashCode()) % getCapacity();
		int y = Math.abs(toV.hashCode()) % getCapacity();
		
		edge[x][y] = 1;
		weight[x][y] = weightValue;*/
		int x = findIndex(fromV);
		int y = findIndex(toV);
		weight[x][y] = weightValue;
		edge[x][y] = 1;
		
		
		
		
		
	}
	
	public int getWeight(T fromV, T toV) {
		/*int x = Math.abs(fromV.hashCode()) % getCapacity();
		int y = Math.abs(toV.hashCode()) % getCapacity();
		
		if(weight[x][y] != 0) {
			return weight[x][y];
		}
		else
			return 0;*/
		
		int x = findIndex(fromV);
		int y = findIndex(toV);
		return weight[x][y];
		
	}
	
	public void createVertex(T element) {
		//Scanner kybd = new Scanner(System.in);
		//int x = Math.abs(element.hashCode()) % getCapacity();
		//edge[x][0] = 2;
		//edge[0][x] = 2;
		//vertices[x][0] = element;
		//vertices[0][x] = element;
		
		// New method *****************************************************************
		
		/*int index = 0;
		if(vertices[index][index] == null && index < vertices.length) {
			vertices[index][index] = element;
			//index += 1;
		}
		
		if(edge[index][index] == 0 && index < edge.length) {
			edge[index][index] = 2;
			//index += 1;
		}
		
		if(vertices[index][index] != null && edge[index][index] != 0 && index < vertices.length && index < edge.length) {
			index += 1;
			vertices[index][index] = element;
			edge[index][index] = 2;// 2 means that there is only a vertex, but no edge.
		}*/
		int x = 0;
		if(vertices[x][x] == null && edge[x][x] == 0) {
			vertices[x][x] = element;
			edge[x][x] = 2;
		}
		else
			x = createIndex();
			vertices[x][x] = element;
			edge[x][x] = 2;
		
		
	}
	
	public boolean hasVertex(T v) {
		/*int x = Math.abs(v.hashCode()) % getCapacity();
		
		if(edge[0][x] == 2 || edge[x][0] == 2) {
			return true;
		}
		else if(edge[0][x] == 1 || edge[x][0] == 1) {
			return true;
		}
		else if(vertices[0][x] == v || vertices[x][0] == v) {
			return true;
		}
		else
			return false;*/
		
		for(int x = 0; x < vertices.length; x++) {
			if(vertices[x][x] == v) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public int createIndex() {
		int j = 0;
		for(j = 0; j < vertices.length && j < edge.length; j++) 
			if(vertices[j][j] == null) 
				return j;
				return j;
			
		
	}
	
	public boolean containsEdge(T fromV, T toV) {
		/*int x = Math.abs(fromV.hashCode()) % getCapacity();
		int y = Math.abs(toV.hashCode()) % getCapacity();
		
		if(edge[x][y] == 1) {
			return true;
		}
		else
			return false;*/
		int x = findIndex(fromV);
		int y = findIndex(toV);
		
		if(edge[x][y] == 1) {
			return true;
		}
		else if(edge[x][y] == 0) {
			return false;
		}
		else
			return false;
		
		
		
	}
	
	public int findIndex(T value) {
		/*int x = 0;
		if(x < vertices.length) 
			x += 1;
			if(vertices[x][x] == value) {
				return x;
			}
			else
				return 0;*/
		int j = 0;
		for(j = 0; j < vertices.length && j < edge.length; j ++) 
			if(vertices[j][j] == value) 
				return j;
				return j;
		
		
		
		
	}
	
	public void determineDirection(T fromV, T toV) {
		int x = findIndex(fromV);
		int y = findIndex(toV);
		
		if(edge[x][y] == 1 && edge[y][x] == 1) {
			System.out.println("Undirected");
		}
		else
			System.out.println("Directed");
		
	}
	
	public void setCapacity(int j) {
		this.capacity = j;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int maxSum(int j) {
		int i;
        
        // Initialize maximum element
        int max = weight[j][0];
        
        //int index = 0;
      
        // Traverse array elements from second and
        // compare every element with current max  
        for (i = 1; i < weight.length; i++)
            if (weight[j][i] > max)
                max = weight[j][i];
        		
      
        return max;
		
	

	}
	
	
	
	
	
	
	
	
	
	
}
