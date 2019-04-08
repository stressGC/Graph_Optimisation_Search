import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Node {
	
	/* attributes */
	private String name;
	private ArrayList<Edge> edges;
	private int score = 0;
	
	/* getters / setters */
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return this.name;
	}
	
	/**
	 * Node constructor
	 * @param name name of the Node
	 */
	public Node(String name) {
		this.name = name;
		this.edges = new ArrayList<Edge>();
	}
	
	/**
	 * 
	 * @param to
	 * @param distance
	 */
	public void addEdgeTo(Node to, int distance) {
		Edge newEdge = new Edge(to, distance);
		this.edges.add(newEdge);
	}
	
	/**
	 * Checks if the current Node has the destination in its direct links
	 * @param dest destination Node
	 * @return boolean if true or false
	 */
	public boolean hasDestinationAsNeighbor(Node dest) {
		for(Edge e : edges) {
			if(dest.getName().equals(e.getLinkedNode().getName())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return Node return closest Node to the current One
	 */
	public Node getNextNode() {
		Node closestNode = null;
		int closestDistance = Integer.MAX_VALUE;
		
		for(Edge e : this.edges) {
			if (e.getDistance() < closestDistance && e.getDistance() <= Graph.maxDistance) {
				closestNode = e.getLinkedNode();
				closestDistance = e.getDistance();
			}
		}
		return closestNode;
	}
	
	/**
	 * adds score to the current Node
	 */
	public void addScore() {
		this.setScore(this.getScore() + 1);
	}
	
	/**
	 * @return String the Node as a string for debugging purpose
	 */
	public String toString() {
		String message = "\nNode : '" + this.name + "'";
		
		for(Edge e : edges) {
			message += "\n" + e.toString();
		}
		
		message += "\nclosest: " + this.getNextNode().name + "\nscore: " + this.getScore() + "\n";
		return message;
	}
}
