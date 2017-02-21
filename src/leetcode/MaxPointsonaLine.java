package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxPointsonaLine
{
	public int maxPoints(Point[] points)
	{
		Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x - p2.x == 0 ? p1.y - p2.y : p1.x - p2.x;
            }
        });
        int max = 0;
        int samePoint = 0;
        double k = 0;
        Map<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            Point p1 = points[i];
            samePoint = 1;
            max = Math.max(max, samePoint);
            map.clear();
            for (int j = i+1; j < points.length; j++) {
                Point p2 = points[j];
                if (p2.x == p1.x && p2.y == p1.y) {
                    samePoint++;
                    max = Math.max(max, samePoint);
                } else if (p2.x == p1.x) {
                    k = Double.MAX_VALUE;
                    map.put(k, map.containsKey(k) ? map.get(k)+1 : samePoint+1);
                    max = Math.max(max, map.get(k));
                } else {
                    k = (double)(p2.y - p1.y) / (p2.x - p1.x);
                    map.put(k, map.containsKey(k) ? map.get(k)+1 : samePoint+1);
                    max = Math.max(max, map.get(k));
                }
                while (i+1 < points.length && points[i+1].x == points[i].x && points[i+1].y == points[i].y) {
                    i++;
                }
            }
        }
        return max;
		}
	}

	
class Point
{

	 int x;
	int y;
	Point()
	{
		x=0;
		y=0;
	}
	Point(int a,int b)
	{
		x=a;
		y=b;
	}
}