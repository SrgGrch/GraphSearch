public class DepthFirstSearch {
    static int matrix[][] = {
           //0  1  2  3  4  5
            {1, 1, 1, 0, 0, 0}, //0
            {1, 1, 0, 1, 1, 0}, //1
            {1, 0, 1, 0, 0, 1}, //2
            {0, 1, 0, 1, 0, 0}, //3
            {0, 1, 0, 0, 1, 0}, //4
            {0, 0, 1, 0, 0, 1}  //5
    };

    public static void main(String[] args) {
        DFS(0);
    }

    private static void DFS(int vertex){
        for (int i = vertex+1; i < 6; i++){
            if (matrix[vertex][i] == 1) {
                System.out.print(i);
                DFS(i);
            }
        }
    }
}
