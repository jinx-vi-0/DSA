import java.util.PriorityQueue;

/*
 we are given n points in a 2D plane which are locations of
 N cars. If we are at the origin, print the nearest k cars.
 and k<n

 c0 (3,3)
 c1 (5,-1)
 c2 (-2,4)

 */

public class NearByCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int dixtSq;
        int idx;

        public Point(int x, int y, int dixtSq, int idx) {
            this.x = x;
            this.y = y;
            this.dixtSq = dixtSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.dixtSq - p2.dixtSq;
        }
    }
    public static void main(String[] args) {
        int[][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++) {
            int dixtSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], dixtSq, i));
        }

        // nearest k cars
        for(int i=0; i<k; i++) {
            System.out.println("c" + pq.remove().idx);
        }
    }
}
