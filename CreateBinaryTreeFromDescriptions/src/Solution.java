import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> parent = new HashSet<>();

        for(int i = 0 ; i < descriptions.length; i++) {
            TreeNode node = null;
            
            parent.add(descriptions[i][1]);

            if(map.containsKey(descriptions[i][0])) {
                node = map.get(descriptions[i][0]);
                
            } else {
                node = new TreeNode(descriptions[i][0]);
                map.put(descriptions[i][0], node);
            }

            if( !map.containsKey(descriptions[i][1]) ) {
                map.put(descriptions[i][1], new TreeNode(descriptions[i][1]));
            }

            if(descriptions[i][2] == 1) {
                 node.left = map.get(descriptions[i][1]);
            } else {
                node.right = map.get(descriptions[i][1]);
            }
        }

        for(int node : map.keySet()) {
            if(!parent.contains(node)) {
                return map.get(node);
            }
        }
        return null;
    }
}
