package backtracking.string;
import java.util.ArrayList;



public class RatMaze {



    public static void main(String[] args) {
        
        int[][] maze={{1,0,0},
                        {1,1,0},
                        {1,1,1}};


        int rows=maze.length;
        int col=maze[0].length;

        boolean[][] visited={{false,false,false},
                        {false,false,false},
                        {false,false,false}};
        

        //src ki value ko true mark krdeta hai

        visited[0][0]=true;

        ArrayList<String> path=new ArrayList<>();
        String output="";


        solveMaze(maze,rows,0,0,visited, output);

    }


    public static void solveMaze(int arr[][],int row, int srcx,int srcy, boolean[][] visited,  String output)
    {
            

    }
    
}
