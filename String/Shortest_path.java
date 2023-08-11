// given a route containing four directiond (E,W,N,S), find the shortest path to reach destination

public class Shortest_path {
    public static float getShortestPath(String path) {
        int x=0, y=0;
        for(int i=0; i<path.length(); i++) {
            switch(path.charAt(i)) {
                case 'N' : // north
                    y++;
                    break;
                case 'S' : // south
                    y--;
                    break;
                case 'E' : // east
                    x++;
                    break;
                case 'W' : // west
                    x--;
                    break;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
