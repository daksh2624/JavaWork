public class LeetCode_Contest_03_08_25 {
    public boolean isTrionic(int[] arr) {
        int n = arr.length;
        boolean loop1 = false;
        boolean loop2 = false;
        boolean loop3 = false;
        int i = 0;
        int cnt = 0;
        
        while(i < arr.length - 1 && arr[i] < arr[i + 1]){
            i++;
            loop1 = true;
        }
        
        while(i < arr.length - 1 && arr[i] > arr[i + 1]){
            i++;
            loop2 = true;
        }
        
        while(i < arr.length - 1 && arr[i] < arr[i + 1]){
            i++;
            loop3 = true;
        }

        return (loop1 && loop2 && loop3 && i == arr.length - 1);
}
    public int maxBalancedShipments(int[] arr) {
        int n = arr.length;
        int i = 0;
        int grp = 0;
        
        while(i < arr.length - 1){
            if(arr[i] > arr[i + 1]){
                grp++;
                i += 2;
            }else{
                i++;
            }
        }
        int ans = grp;
        System.out.println(grp);
        return ans;
    }
}
