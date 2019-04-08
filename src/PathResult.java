import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class PathResult {
	private ArrayList<Node> nodes;
	
	public PathResult() {
		this.nodes = new ArrayList<Node>();
	}
	
	public PathResult(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void addNode(Node node) {
		node.addScore();
		this.nodes.add(node);
	}
		
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
