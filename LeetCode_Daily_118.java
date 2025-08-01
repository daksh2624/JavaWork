import java.util.*;

public class LeetCode_Daily_118 {

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            List<Integer> ans = new ArrayList<>();
            list.add(ans);
            for (int col = 0; col <= row; col++) {
                System.out.println(row + " " + col);
                if (col == 0 || row == col) {
                    ans.add(1);
                } else {
                    int num1 = list.get(row - 1).get(col - 1);
                    int num2 = list.get(row - 1).get(col);
                    ans.add(num1 + num2);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode_Daily_118 obj = new LeetCode_Daily_118();
        int n = 5;
        List<List<Integer>> result = obj.generate(n);

        System.out.println("\nPascal's Triangle:");
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
