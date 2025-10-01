import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int c= 1;
        int last_arrow = points[0][1];
        for (int[] point : points) {
            if (point[0] > last_arrow) {
                c++;
                last_arrow = point[1];
            }
        }
        return c;
        
    }
}