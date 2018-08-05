import java.util.PriorityQueue;
import java.util.Queue;

public class BreadthFirstSearch {

    static Queue<Integer> queue = new PriorityQueue<>();

    // матрица смежности графа
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
        queue.add(0); // добавляем первый элемент в очередь
        BFS();
    }

    private static void BFS () {
        while (queue.peek() != null){ // цикл до конца очереди
            int vertex = queue.poll(); // первый элемент в очереди
            System.out.print(vertex);
            for (int i = vertex + 1; i < 6; i++){ // добавляем в очередь его смежные вершины
                if (matrix[vertex][i] == 1){
                    queue.add(i);
                }
            }
        }
    }
}
