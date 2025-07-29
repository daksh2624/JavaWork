import java.util.*;
public class BackTracking_Maze1st {
    public static void main(String[] args) {
        boolean arr[][] = {{true,true,true} , {true,false,true}, {true,true,true}};
        arr[1][1] = false;
        // mazeNew("",3,3);
        // System.out.println(maze(3,3));
        // System.out.println(maze_returning_List("", 3,3));
        // System.out.println(maze_With_Diagnoal_Also("", 3,3));
        maze_With_Restrictions("",arr, 0,0);
    }

    public static void maze_With_Restrictions(String up,boolean[][] arr, int row, int col){
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(up);
            return;
        }
        if(!arr[row][col]){
            return;
        }
        // if(row < arr.length - 1 &&  col < arr[0].length - 1){
        //     maze_With_Restrictions(up + 'L',arr , row + 1,col + 1);
        // }
        if(row < arr.length - 1){
            maze_With_Restrictions(up + 'D',arr , row + 1, col);
        }
        if(col < arr[0].length - 1){
            maze_With_Restrictions(up + 'R',arr, row, col + 1);
        }
    }

    public static int maze(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = maze(row - 1,col);
        int right = maze(row, col - 1);
        return left + right;
    }
    public static void mazeNew(String up, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(up);
            return;
        }if(row > 1){
            mazeNew(up + 'D', row - 1, col);
        }if(col > 1){
            mazeNew(up + 'R', row, col - 1);
        }
    }

    public static ArrayList<String> maze_returning_List(String up, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(up);
            return ans;
        }
        
        ArrayList<String> ans = new ArrayList<>();

        if(row > 1){
            ans.addAll(maze_returning_List(up + 'D', row - 1, col));
        }if(col > 1){
            ans.addAll(maze_returning_List(up + 'R', row, col - 1));
        }
        return ans; 
    }

    public static ArrayList<String> maze_With_Diagnoal_Also(String up, int row, int col){
        if (row == 1 && col == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(up);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row > 1 &&  col > 1){
            ans.addAll(maze_With_Diagnoal_Also(up + 'L' , row - 1,col - 1));
        }
        if(row > 1){
            ans.addAll(maze_With_Diagnoal_Also(up + 'D', row - 1, col));
        }
        if(col > 1){
            ans.addAll(maze_With_Diagnoal_Also(up + 'R', row, col - 1));
        }
        return ans;
    }



}
