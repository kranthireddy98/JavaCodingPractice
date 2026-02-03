package BFS;

import DFS.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth {

    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth=0;
        List<List<Integer>> store = new ArrayList<>();

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> current = new ArrayList<>();
            for(int i =0;i<levelSize;i++){

                TreeNode currentNode = queue.poll();
                current.add(currentNode.val);
                if(currentNode.left != null){

                    queue.add(currentNode.left);
                }

                if(currentNode.right != null){

                    queue.add(currentNode.right);
                }
            }
            store.add(current);
            depth++;
        }
        System.out.println(store);
        return depth;

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val=1;
        node.left = new TreeNode();
        node.right = new TreeNode();

        node.left.val=2;
        node.left.right = new TreeNode();
        node.left.right.val=5;
        node.left.left = new TreeNode();
        node.left.left.val=4;

        node.right.val=3;

        int deep = maxDepth(node);
    }
}
