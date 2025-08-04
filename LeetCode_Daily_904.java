import java.util.HashMap;
import java.util.Map;

public class LeetCode_Daily_904 {
    public static void main(String[] args) {
        LeetCode_Daily_904 sol = new LeetCode_Daily_904();

        int[] fruits = {1, 2, 1, 2, 3};  // Example input

        int maxFruits = sol.totalFruit(fruits);

        System.out.println("Maximum number of fruits that can be collected: " + maxFruits);
    }

    public int totalFruit(int[] arr) {
        int left = 0;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length  ; right ++){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            
            if(map.size() > 2){
                while(map.size() > 2){
                    map.put(arr[left], map.get(arr[left]) - 1);
                    if(map.get(arr[left]) == 0){
                        map.remove(arr[left]);
                    }left++;
                }
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }return maxLength;
    }
}
