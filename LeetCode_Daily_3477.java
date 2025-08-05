public class LeetCode_Daily_3477 {
    public static void main(String[] args) {
        LeetCode_Daily_3477 sol = new LeetCode_Daily_3477();

        // Example input
        int[] fruits = {2, 3, 5};
        int[] baskets = {3, 4, 1};

        // Function call
        int result = sol.numOfUnplacedFruits(fruits, baskets);

        // Output
        System.out.println("Number of unplaced fruits: " + result);
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt = 0;
        boolean check[] = new boolean[baskets.length];

        for(int i = 0 ; i < fruits.length ; i++){
            for(int j = 0 ; j < baskets.length ; j++){
                if(!check[j] && fruits[i] <= baskets[j]){
                    check[j] = true;
                    break;
                }
            }
        }

        for(int i = 0 ; i < check.length ; i++){
            if(!check[i]) cnt++;
        }
        return cnt;
    }
}
