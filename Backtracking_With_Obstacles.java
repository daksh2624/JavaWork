import java.util.*;
public class Backtracking_With_Obstacles {
    
    public static void main(String[] args) {
        boolean arr[][] = {{true,true,true} , {true,true,true}, {true,true,true}};
        maze_With_Restrictions("",arr, 0,0);
        int[][] path = new int[arr.length][arr[0].length]; 
        maze_With_Count("",arr, 0,0,path,1);
    }
    public static void maze_With_Restrictions(String up, boolean arr[][], int row , int col){
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(up);
            return;
        }
        if(!arr[row][col]){
            return;
        }
        arr[row][col] = false;
        if(row < arr.length - 1){
            maze_With_Restrictions(up + 'D',arr , row + 1, col);
        }
        if(col < arr[0].length - 1){
            maze_With_Restrictions(up + 'R',arr, row, col + 1);
        }if(row > 0){
            maze_With_Restrictions(up + 'U',arr , row - 1,col);
        }if(col > 0){
            maze_With_Restrictions(up + 'L',arr , row,col - 1);
        }
        arr[row][col] = true;
    }

    public static void maze_With_Count(String up, boolean arr[][], int row , int col,int[][] path,int count){
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            path[row][col] = count;
            for(int[] ans : path){
                System.out.println(Arrays.toString(ans));
            }
            System.out.println(up);
            System.out.println();
            return;
        }
        if(!arr[row][col]){
            return;
        }
        path[row][col] = count;
        arr[row][col] = false;
        if(row < arr.length - 1){
            maze_With_Count(up + 'D',arr , row + 1, col, path, count+ 1);
        }
        if(col < arr[0].length - 1){
            maze_With_Count(up + 'R',arr, row, col + 1, path, count+ 1);
        }if(row > 0){
            maze_With_Count(up + 'U',arr , row - 1,col, path, count+ 1);
        }if(col > 0){
            maze_With_Count(up + 'L',arr , row,col - 1, path, count+ 1);
        }
        arr[row][col] = true;
        path[row][col] = 0;
    }

}
