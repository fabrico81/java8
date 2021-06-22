package java8.algorithms;

import java.util.*;

class Bfs {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();

            for (int i = 0; i < nov; i++) list.add(i, new ArrayList<Integer>());

            for (int i = 1; i <= edg; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            ArrayList<Integer>res = new Traversal().bfs(list,nov);
            for (int i =0 ;i < res.size (); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
 *  g[]: adj list of the graph
 *  N : number of vertices
 */
class Traversal {

    // add your code here
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> list, int nov) {
        boolean vis[] = new boolean[nov];
        for (int i = 0; i < nov; i++) vis[i] = false;

        int src = 0;
        ArrayList<Integer> res = new ArrayList<Integer>(0);
        Queue<Integer> q = new LinkedList<>();
        vis[src] = true;      // Intially mark source vertex as visited(true)
        q.add(src);           // Push the source vertex to queue
        while (q.size() != 0) // Till queue is not empty
        {
            src = q.poll();
            res.add (src);
            Iterator<Integer> it = list.get(src).iterator();
            while (it.hasNext()) // Traverse through all the connected
            // components of front
            {
                int n = it.next();
                if (!vis[n]) // If they are not visited, mark them visited and
                // add to queue
                {
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
        return res;
    }
}