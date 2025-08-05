import java.util.HashMap;
import java.util.Map;

public class LeetCode_1218 {
    public static void main(String[] args) {
        LeetCode_1218 sol = new LeetCode_1218();

        // Example input
        int[] arr = {1, 5, 7, 8, 5, 3, 4, 2, 1};
        int diff = -2;

        // Function call
        int result = sol.longestSubsequence(arr, diff);

        // Output
        System.out.println("Length of the longest arithmetic subsequence: " + result);
    }

    public int longestSubsequence(int[] arr, int diff) {
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i] - diff)){
                map.put(arr[i] , map.get(arr[i] - diff) + 1);
            }else{
                map.put(arr[i], 1);
            }
            maxLength  = Math.max(maxLength, map.get(arr[i]));
        }
        return maxLength;
    }
}
