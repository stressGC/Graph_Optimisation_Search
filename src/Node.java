import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Node {
	private String name;
	private ArrayList<Edge> edges;
	
	public String getName() {
		return this.name;
	}
	
	public Node(String name) {
		this.name = name;
		this.edges = new ArrayList<Edge>();
	}
	
	public void addEdgeTo(Node to, int distance) {
		Edge newEdge = new Edge(to, distance);
		this.edges.add(newEdge);
	}
	
	public String toString() {
		String message = "Node : '" + this.name + "'";
		
		for(Edge e : edges) {
			message += "\n" + e.toString();
		}
		
		message += '\n';
		return message;
	}
}
