package backtracking.string;
import java.util.ArrayList;



public class RatMaze {



    public static void main(String[] args) {
        
        int[][] maze={{1,0,0,0},
                        {1,1,0,1},
                        {1,1,0,0},
                    {0,1,1,1}};




                        if(maze[0][0]==0)
                        {
                            System.out.println("No Path exists");
                            return;
                        }
        int row=maze.length;
        int col=maze[0].length;

        boolean[][] visited={{false,false,false,false},
                        {false,false,false,false},
                        {false,false,false,false},{false,false,false,false}};
        

        //src ki value ko true mark krdeta hai

        visited[0][0]=true;

        ArrayList<String> path=new ArrayList<>();
        String output="";


        solveMaze(maze,row,col,0,0,visited,path, output);
        
        if(path.size()==0)
        {
            System.out.println("No path exist");
        }
        else{
            System.out.println(path);
        }

     

        

    }


    public static void solveMaze(int arr[][],int row, int col,int i,int j, boolean[][] visited,  ArrayList<String> path,String output)
    {


        //base case

        if(i==row-1 && j==col-1 )
        {
            path.add(output);
            return;
        }



        //down i+1,j

        if(isSafe(i+1,j,row,col,arr,visited)){
                visited[i+1][j]=true;
                solveMaze(arr, row, col, i+1, j, visited, path, output+"D");
                //backtrack
                visited[i+1][j]=false;

        }



        //left i,j-1


        if(isSafe(i,j-1,row,col,arr,visited)){
            visited[i][j-1]=true;
            solveMaze(arr, row, col, i, j-1, visited, path, output+"L");
            //backtrack
            visited[i][j-1]=false;

    }

     

        //right i,j+1
        if(isSafe(i,j+1,row,col,arr,visited)){
            visited[i][j+1]=true;
            solveMaze(arr, row, col, i, j+1, visited, path, output+"R");
            //backtrack
            visited[i][j+1]=false;

    }

        //up i-1,j

        if(isSafe(i-1,j,row,col,arr,visited)){
            visited[i-1][j]=true;
            solveMaze(arr, row, col, i+1, j, visited, path, output+"U");
            //backtrack
            visited[i-1][j]=false;

    }





    }


    public static boolean isSafe(int i,int j,int row,int col,int[][] arr,boolean[][] visited)
    {

        if(((i>=0 && i<row) && (j>=0 && j<col))&&(arr[i][j]==1) && (visited[i][j]==false))
        {
                return true;
        }
        else{
            return false;
        }
    }
    
}
