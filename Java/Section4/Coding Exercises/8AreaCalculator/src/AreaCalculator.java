public class AreaCalculator {
    private static final double X = -1;
    public static double area (double radius){
        if(radius >= 0){
            double circleArea = Math.PI * Math.pow(radius,2d);
            return circleArea;
        }
        return X;
    }
    public static double area (double x, double y){
        if(x >= 0 && y >= 0){
            double triangleArea = x * y;
            return triangleArea;
        }
        return X;
    }
}
