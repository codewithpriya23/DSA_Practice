import java.util.*;
class Solution {
    class Pair implements Comparable<Pair>{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        public int compareTo(Pair that){
            return that.getDistance()-this.getDistance();
        }
        public int getDistance(){
            return(x*x)+(y*y);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
         for(int i=0; i<points.length; i++){
            pq.offer(new Pair(points[i][0],points[i][1]));
            if (pq.size() > k) {
                pq.poll();
         }
    }
    int[][] result = new int[k][2];
        int index = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            result[index][0] = p.x;
            result[index][1] = p.y;
            index++;
        }
        return result;
    }
}