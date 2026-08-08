import java.util.*;

// ==========================================================
// 🚀 LAST MINUTE DSA REVISION CHEAT SHEET (JAVA) 🚀
// ==========================================================
public class DSACheatSheet {

    // ----------------------------------------------------------
    // 1. TWO POINTER 
    // Best for: Searching pairs in sorted arrays, reversing, etc.
    // Time: O(N) | Space: O(1)
    // ----------------------------------------------------------
    public static void twoPointerReverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // ----------------------------------------------------------
    // 2. SLIDING WINDOW (Fixed Size)
    // Best for: Subarrays/substrings of a specific size (K).
    // Time: O(N) | Space: O(1)
    // ----------------------------------------------------------
    public static int slidingWindowMaxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        
        int windowSum = 0, maxSum = 0;
        
        // Calculate initial window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        
        // Slide the window
        for (int i = 0; i < arr.length - k; i++) {
            // Add next element, remove first element of previous window
            windowSum = windowSum - arr[i] + arr[i + k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    // ----------------------------------------------------------
    // 3. GREEDY 
    // Best for: Optimization, intervals, making local optimal choices.
    // Example: Activity Selection (Max non-overlapping intervals)
    // Time: O(N log N) due to sorting | Space: O(N)
    // ----------------------------------------------------------
    public static int greedyActivitySelection(int[] start, int[] end) {
        int n = start.length;
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        
        // Sort by END time (crucial for interval greedy problems)
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));
        
        int count = 1;
        int lastEndTime = activities[0][1];
        
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEndTime) { // If start time >= previous end time
                count++;
                lastEndTime = activities[i][1];
            }
        }
        return count;
    }

    // ----------------------------------------------------------
    // 4. BINARY SEARCH
    // Best for: Searching in sorted arrays or finding monotonic properties.
    // Time: O(log N) | Space: O(1)
    // ----------------------------------------------------------
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids integer overflow
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1;
    }

    // ----------------------------------------------------------
    // 5. TREE BASICS
    // Best for: Hierarchical data. Traversals (Inorder, Preorder, Postorder).
    // Time: O(N) | Space: O(H) where H is height of tree
    // ----------------------------------------------------------
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }
    
    private static void inorderHelper(TreeNode node, List<Integer> res) {
        // Left -> Root -> Right (Produces sorted order for BST)
        if (node == null) return;
        inorderHelper(node.left, res);
        res.add(node.val);
        inorderHelper(node.right, res);
    }

    // ----------------------------------------------------------
    // 6. HASHMAP
    // Best for: Frequency counting, finding pairs (like Two Sum) quickly.
    // Time: O(N) | Space: O(N)
    // ----------------------------------------------------------
    public static int[] hashmapTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores: {value : index}
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[] { numMap.get(diff), i };
            }
            numMap.put(nums[i], i); // Add current number to map
        }
        return new int[]{};
    }

    // ----------------------------------------------------------
    // 7. STACK
    // Best for: LIFO operations, Valid Parentheses, Next Greater Element.
    // Time: O(N) | Space: O(N)
    // ----------------------------------------------------------
    public static boolean stackValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty(); // True if stack is empty
    }

    // ----------------------------------------------------------
    // 8. DYNAMIC PROGRAMMING (1D Tabulation)
    // Best for: Overlapping subproblems, optimal substructure (e.g., Climbing Stairs)
    // Time: O(N) | Space: O(N) array
    // ----------------------------------------------------------
    public static int dpClimbingStairs(int n) {
        if (n <= 2) return n;
            
        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 way to reach step 1
        dp[2] = 2; // 2 ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            // Current step ways = Ways to reach (i-1) + Ways to reach (i-2)
            dp[i] = dp[i-1] + dp[i-2]; 
        }
        return dp[n];
    }
}
// ==========================================================
// END OF CHEAT SHEET
// ==========================================================