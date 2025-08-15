import java.util.*;
public class Buy_Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arrN[] = new int[N];
        int arrM[] = new int[M];

        for(int i = 0 ; i < N ; i++){
            arrN[i] = sc.nextInt();
        }

        for(int i = 0 ; i < M ; i++){
            arrM[i] = sc.nextInt();
        }

        System.out.println(helper(arrN, arrM));
    }

    public static int helper(int[] arrN, int arrM[]){
        Arrays.sort(arrN);
        Arrays.sort(arrM);
        int i = arrN.length - 1;
        int j = arrM.length - 1;
        int sum = 0;

        while(i >= 0 && j >= 0 && (arrN[i] + arrM[j]) > 0){
            sum += arrN[i] + arrM[j];
            i--;
            j--;
        }

        return (sum < 0) ? 0 : sum;
    }
}
