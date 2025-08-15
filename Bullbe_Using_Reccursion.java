public class Bullbe_Using_Reccursion {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        bubbleSort(arr, 0, arr.length - 1);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr, int index , int length){
        if(length == 0){
            return;
        }
        else if(index == length){
            index = 0;
            length--;
            bubbleSort(arr, index, length);
        }
        else if(arr[index] > arr[index + 1]){
            int temp = arr[index + 1];
            arr[index + 1] = arr[index];
            arr[index] = temp;
            bubbleSort(arr, index + 1, length);
        }else{
            bubbleSort(arr, index + 1, length);
        }
    }
}