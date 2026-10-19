import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.naming.LinkLoopException;

class Assignment8_3{

    private int vertices;
    private int edges;
    private List<Integer> arr[];

    

    public Assignment8_3(int vertices){
        this.vertices = vertices;
        arr = new List[vertices];

        for(int i = 0 ; i < vertices; i++){
            arr[i] = new LinkedList<>();
        }
        edges = 0;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter edges : ");
        edges = sc.nextInt();
        System.out.println("ENTER SOURCE DESTINATION ");

        for(int i = 0 ; i < edges; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            

            arr[source].add(destination);
            arr[destination].add(source);

        }
    }

    public void DFSTraversal(){
        int start = 4;
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        boolean visited[] = new boolean[vertices];
        visited[start] = true;

        while(!stack.isEmpty()){
            int u = stack.pop();
            System.out.println(" " + u);
            for(Integer a : arr[u]){
                if(visited[a] == false){
                    stack.push(a);
                    visited[a] = true;
                }
            }
        }
    }

    public void BFSTraversal(){
        int start = 4;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        boolean visited[] = new boolean[vertices];
        visited[start] = true;

        while(!queue.isEmpty()){
            int u = queue.poll();
            System.out.println(" " + u);
            for(Integer a : arr[u]){
                if(visited[a] == false){
                    queue.offer(a);
                    visited[a] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Assignment8_3 a = new Assignment8_3(6);
        a.accept();
        a.DFSTraversal();
    }
}