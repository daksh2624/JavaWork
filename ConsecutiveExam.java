import java.util.*;

public class ConsecutiveExam {

    public static int consecutive(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        boolean found = true;

        while (found) {
            found = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    int points = 2;
                    while (i + points < arr.length && arr[i] == arr[i + points]) {
                        points++;
                    }
                    count += points;
                    found = true;
                    // Remove the consecutive characters
                    for (int j = i; j < arr.length - points; j++) {
                        arr[j] = arr[j + points];
                    }
                    // Update the length of the array to reflect the removal
                    arr = Arrays.copyOf(arr, arr.length - points);
                    i = -1; // Reset i to start checking from the beginning
                    break; // Break to recheck the array from the start
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "axyyyxb";
        int store = consecutive(str);
        System.out.print(store);
    }
}

