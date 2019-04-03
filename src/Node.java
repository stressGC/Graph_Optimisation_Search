import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Node {
	private String name;
	private ArrayList<Edge> edges;
	
	public Node(String name) {
		this.name = name;
		this.edges = new ArrayList<Edge>();
	}
	
	public String toString() {
		return this.name;
	}
}
