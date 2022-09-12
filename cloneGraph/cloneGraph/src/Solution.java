import org.w3c.dom.Node;
import java.util.*;

class Solution {
    public Node cloneGraph(Node root) {

        if (root == null) return null;
        Map<Node, Node> map = new HashMap<Node, Node>();

        Queue<Node> q = new LinkedList<Node>();
        map.put(root, new Node(root.val, new ArrayList<Node>()));
        q.add(root);

        while(!q.isEmpty()){
            Node front = q.remove();
            for (Node neighbor: front.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<Node>()));
                    q.add(neighbor);
                }
                map.get(front).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(root);

    }
}
