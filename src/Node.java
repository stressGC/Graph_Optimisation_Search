import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Node {
	private String name;
	private ArrayList<Edge> edges;
	private int score = 0;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void addScore() {
		this.setScore(this.getScore() + 1);
	}
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
	 
	public boolean hasDestinationAsNeighbor(Node dest) {
		for(Edge e : edges) {
			if(dest.getName().equals(e.getLinkedNode().getName())) {
				return true;
			}
		}
		return false;
	}
	
	public Node getNextNode() {
		Node closestNode = null;
		int closestDistance = Integer.MAX_VALUE;
		
		for(Edge e : this.edges) {
			if (e.getDistance() < closestDistance) {
				closestNode = e.getLinkedNode();
				closestDistance = e.getDistance();
			}
		}
		return closestNode;
	}
	
	public String toString() {
		String message = "\nNode : '" + this.name + "'";
		
		for(Edge e : edges) {
			message += "\n" + e.toString();
		}
		
		message += "\nclosest: " + this.getNextNode().name + "\nscore: " + this.getScore() + "\n";
		return message;
	}
}
