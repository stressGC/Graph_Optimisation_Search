/**
 * @author Georges
 *
 */

public class Edge {
	private int distance;
	private Node to;
	
	public int getDistance() {
		return this.distance;
	}
	
	public Node getLinkedNode() {
		return this.to;
	}
	
	public Edge(Node to, int distance) {
		this.to = to;
		this.distance = distance;
	}
	
	public String toString() {
		return "-> " + to.getName() + " [" + distance + "]";
	}

}
