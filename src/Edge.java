/**
 * @author Georges
 *
 */

public class Edge {
	
	/* attributes */
	private int distance;
	private Node to;
	
	/**
	 * Edge constructor
	 * @param to Node
	 * @param distance
	 */
	public Edge(Node to, int distance) {
		this.to = to;
		this.distance = distance;
	}
	
	/* setters / getters */
	public int getDistance() {
		return this.distance;
	}
	public Node getLinkedNode() {
		return this.to;
	}
	
	/**
	 * returns a String representing the Edge object
	 * @returns String 
	 */
	public String toString() {
		return "-> " + to.getName() + " [" + distance + "]";
	}

}
