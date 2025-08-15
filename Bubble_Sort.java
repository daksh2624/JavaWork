import  java.util.*;
class Bubble_Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        boolean swapped = false;
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length - 1 ; j++){
                if(arr[j + 1] < arr[j] ){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j +1] = temp;
                swapped = true;
                count++;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(count);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
