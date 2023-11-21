package hw8;

public class Interval {
    private double point1;

    private double point2;
    private boolean includePoint1;
    private boolean includePoint2;

    
    public Interval(double point1, double point2, boolean includePoint1, boolean includePoint2) 
    {
        this.point1 = point1;
        this.point2 = point2;

        this.includePoint1 = includePoint1;
        this.includePoint2 = includePoint2;
    }

    
    public static Interval union(Interval interval1, Interval interval2) 
    {
        double newPoint1 = Math.min(interval1.point1, interval2.point1);

        double newPoint2 = Math.max(interval1.point2, interval2.point2);


        boolean newIncludePoint1 = interval1.includePoint1 || interval2.includePoint1;
        boolean newIncludePoint2 = interval1.includePoint2 || interval2.includePoint2;
        return new Interval(newPoint1, newPoint2, newIncludePoint1, newIncludePoint2);
    }

    
    public static Interval intersection(Interval interval1, Interval interval2) 
    {
        double newPoint1 = Math.max(interval1.point1, interval2.point1);
        double newPoint2 = Math.min(interval1.point2, interval2.point2);

        boolean newIncludePoint1 = interval1.includePoint1 && interval2.includePoint1;
        boolean newIncludePoint2 = interval1.includePoint2 && interval2.includePoint2;
        
        if (newPoint1 <= newPoint2) 
        {
            return new Interval(newPoint1, newPoint2, newIncludePoint1, newIncludePoint2);
        } 
        else 
        {
            return null; 
        }
    }

    
    public static double maxDistance(Interval[] intervals) 
    {
        double maxDistance = 0.0;
        for (Interval interval : intervals) 
        {
            double distance = Math.abs(interval.point2 - interval.point1);
            maxDistance = Math.max(maxDistance, distance);
        }
        return maxDistance;
    }

    public static void main(String[] args) 
    {
        int n = 3; 

        
        Interval[] intervals = new Interval[n];
        intervals[0] = new Interval(1.0, 5.0, true, false);
        intervals[1] = new Interval(3.0, 8.0, false, true);
        intervals[2] = new Interval(6.0, 10.0, true, true);

        
        double maxDist = maxDistance(intervals);
        System.out.println("Найбільша відстань між точками об'єктів: " + maxDist);

        
        Interval unionResult = union(intervals[0], intervals[1]);
        System.out.println("Об'єднання першого та другого інтервалів: [" +
                unionResult.point1 + ", " + unionResult.point2 + "]");

        
        Interval intersectionResult = intersection(intervals[1], intervals[2]);
        if (intersectionResult != null) 
        {
            System.out.println("Перетин другого та третього інтервалів: [" +
                    intersectionResult.point1 + ", " + intersectionResult.point2 + "]");
        } else 
        {
            System.out.println("Інтервали не перетинаються.");
        }
    }
}