import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class PathResult {
	
	/* attributes */
	private ArrayList<Node> nodes;
	
	/**
	 * PathResult constructor w/o args
	 */
	public PathResult() {
		this.nodes = new ArrayList<Node>();
	}
	
	/**
	 * PathResult constructor with args
	 * @param nodes Nodes forming the path
	 */
	public PathResult(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	/* setters / getters */
	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	/**
	 * adds a new Node to the resulting path
	 * @param node Node to add to the path
	 */
	public void addNode(Node node) {
		node.addScore();
		this.nodes.add(node);
	}
	
	/**
	 * returns the PathResult object as a string
	 */
	public String toString() {
		if(this.nodes.size() == 0) {
			return "Aucun chemin trouvé";
		}
		
		String msg = "";
		for(Node n : nodes) {
			msg += n.getName() + " -> ";
		}
		return msg;
	}
}
