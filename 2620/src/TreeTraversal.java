	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.LinkedList;
	import java.util.List;

	
	public class TreeTraversal {
	    public static class TreeNode {
	        int value;
	        List<TreeNode> children;

	        public TreeNode(int value) {
	            this.value = value;
	            children = new ArrayList<>();
	        }

	        public void addChildren(TreeNode... children) {
	            this.children.addAll(Arrays.asList(children));
	        }
	    }

	    
	    public int sumOfQualifiedValues(TreeNode root, int min, int max) {	    	
			
	    	int sum = 0;
	    	
	    	LinkedList<TreeNode> stack = new LinkedList<>();
	        stack.push(root);
	        while (!stack.isEmpty()) {
	            TreeNode node = stack.pop();
	            
	            if(node != null) {
	            	if(min <= node.value && node.value <= max)
	            		sum += node.value;	
	            	
	            }
	            System.out.println(node.value);
	            for (int i = node.children.size() - 1; i >= 0; --i) {
	                stack.push(node.children.get(i));
	            }
	        }
	        return sum;
	    }
	  
	    	    					
	    public static void main(String[] args) {
	        TreeNode node3 = new TreeNode(3);
	        TreeNode node4 = new TreeNode(4);
	        TreeNode node6 = new TreeNode(6);
	        TreeNode node7 = new TreeNode(7);


	        TreeNode node2 = new TreeNode(2);
	        node2.addChildren(node3, node4);
	        TreeNode node5 = new TreeNode(5);
	        node5.addChildren(node6, node7);
	        TreeNode node8 = new TreeNode(8);

	        TreeNode node1 = new TreeNode(1);
	        node1.addChildren(node2, node5, node8);
	        TreeTraversal solution = new TreeTraversal();
	        
	        System.out.println(solution.sumOfQualifiedValues(node1, 3, 5)); // Should print 12

	        System.out.println(solution.sumOfQualifiedValues(node2, 3, 5)); // Should print 7
	    }
	}



