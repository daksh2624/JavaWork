    import java.util.*;
    public class Shortest_Duplicate_Subarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0 ; i < N ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(helper(arr));
        }

        public static int helper(int[] arr) {
            int left = 0;
            int maxLength = Integer.MAX_VALUE;
            Map<Integer, Integer> map = new HashMap<>();
            for(int right = 0 ; right < arr.length ; right++){
                int ele = arr[right];

                if(map.containsKey(arr[right])){
                    int index = map.get(arr[right]);
                    maxLength = Math.min(maxLength, right - index + 1);
                }

                map.put(arr[right], right);
            }
            if(maxLength == Integer.MAX_VALUE) return -1;
            return maxLength;
        }
    }
