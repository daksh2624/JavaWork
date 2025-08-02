import java.util.*;

public class LeetCode_Daily_1388 {

    public int maxSizeSlices(int[] arr) {
        int n = arr.length;
        int slices = arr.length / 3;

        int dp1[][] = new int[arr.length + 1][slices + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            Arrays.fill(dp1[i], -1);
        }

        int dp2[][] = new int[arr.length + 1][slices + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            Arrays.fill(dp2[i], -1);
        }

        return Math.max(helper(0, arr, slices, n - 2, dp1), helper(1, arr, slices, n - 1, dp2));
    }

    public int helper(int index, int[] arr, int slices, int end, int[][] dp) {
        if (slices == 0 || index > end) {
            return 0;
        }

        if (dp[index][slices] != -1) return dp[index][slices];

        int pick = arr[index] + helper(index + 2, arr, slices - 1, end, dp);
        int noPick = helper(index + 1, arr, slices, end, dp);

        return dp[index][slices] = Math.max(pick, noPick);
    }

    public static void main(String[] args) {
        LeetCode_Daily_1388 obj = new LeetCode_Daily_1388();
        int[] slices = {1, 2, 3, 4, 5, 6}; // You can change input to test more cases
        int result = obj.maxSizeSlices(slices);
        System.out.println("Maximum size of slices: " + result);
    }
}
