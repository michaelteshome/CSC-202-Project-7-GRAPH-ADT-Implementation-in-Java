import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class Demo {

	static String reply;
	static String choice;
	static WeightedGraph<String> graph = new WeightedGraph<String>(5);
	static Scanner kybd = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Keys on the Graph: ");
		System.out.println("\n [0]: means that there is neither a vertex or edge. ");
		System.out.println("\n [1]: means that there is a edge and vertex.");
		System.out.println("\n [2] means that ther is a vertex but no edge.");
		
		
		graph = new WeightedGraph<String>(5);
		graph.createVertex("Philadelphia");
		graph.createVertex("Denver");
		graph.createVertex("Washington");
		graph.createVertex("Houston");
		graph.createVertex("Atlanta");
		
		makeFlight();
		graph.Print();
		
		findMaxSum(0);
		
		
	}
	
	
	public static void makeFlight() {
		graph.addEdge("Philadelphia", "Denver", 2075);
		graph.addEdge("Philadelphia", "Washington", 158);
		graph.addEdge("Philadelphia", "Houston", 1542);
		graph.addEdge("Philadelphia", "Atlanta", 660);
		
		graph.addEdge("Denver", "Philadelphia", 2036);
		graph.addEdge("Denver", "Washington", 1524);
		graph.addEdge("Denver", "Houston", 1359);
		graph.addEdge("Denver", "Atlanta", 1744);
		
		graph.addEdge("Washington", "Philadelphia" , 135);
		graph.addEdge("Washington", "Denver", 2120);
		graph.addEdge("Washington", "Houston", 1600);
		graph.addEdge("Washington", "Atlanta", 520);
		
		graph.addEdge("Atlanta", "Philadelphia", 686);
		graph.addEdge("Atlanta", "Denver", 1757);
		graph.addEdge("Atlanta", "Washington", 524);
		graph.addEdge("Atlanta", "Houston", 800);
		
		graph.addEdge("Houston", "Washington", 1698);
		graph.addEdge("Houston", "Denver", 710);
		graph.addEdge("Houston", "Atlanta", 784);
		graph.addEdge("Houston", "Philadelphia", 1492);
		
		
	}
	
	public static void findMaxSum(int j) {
				
		System.out.println("Greates Weight (miles)  for row of weight indice [" + j + "]  " + graph.maxSum(j));
		
		if(j < graph.weight.length)
			j += 1;
		findMaxSum(j);
		
	}

	
	
	


}
