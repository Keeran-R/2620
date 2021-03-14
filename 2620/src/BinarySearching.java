public class BinarySearching {
    /**
     * The method for you to implement.
     * 
     * Please DO NOT modify the header.
     */
    int binarySearch(int[] nums, int target, boolean inclusive) {
    	
    	int l = 0;
    	int r = nums.length - 1;
    	while(r > l) {
    		int mid = 1 + (r - 1)/2;
    		
    		if (nums[mid] == target) {
    			return mid;
    		}
    		
    		if(nums[mid] < target) {
    			l = mid + 1;
    		}
    		else
    			r = mid - 1;
    	}
 
        return -1;
       	
        
    }

    /**
     * The main method is for test only and won't be evaluated.
     */
    public static void main(String[] args) {
        BinarySearching solution = new BinarySearching();
        System.out.println(solution.binarySearch(new int[]{1, 2, 3, 4}, 2, true)); // Should be 1
        System.out.println(solution.binarySearch(new int[]{1, 2, 3, 4}, 2, false)); // Should be 2
    }
}
