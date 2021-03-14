import java.util.Stack;
/**
 * Do not modify the class header.
 */
public class Stacks {
    
	
    public boolean isBalanced(String s) {
    	
    	Stack<Character> sta = new Stack<Character>();
    	
    	for(int index = 0; index<s.length(); index++) {
    		
    		Character ch = s.charAt(index);
    		
    		if(!sta.isEmpty() && ch == '}' && sta.peek() == '{') {
    			sta.pop();
    		}
    		
    		else if(!sta.isEmpty() && ch == ']' && sta.peek() == '[') {
    			sta.pop();
    		}
    		
    		else if(!sta.isEmpty() && ch == ')' && sta.peek() == '(') {
    			sta.pop();
    		}
    		
    		else {
    			sta.push(ch);
    		}
    		
    	}
    	
    	if(sta.isEmpty()) {
        return true;
    	}
    	
    	return false;
    }
    /**
     * The main method is for test only and won't be evaluated.
     */
    public static void main(String[] args) {
        Stacks solution = new Stacks();
        System.out.println(solution.isBalanced("()")); // should be true
        System.out.println(solution.isBalanced("(")); // should be false
        System.out.println(solution.isBalanced("(])")); // should be false
      
    }
}