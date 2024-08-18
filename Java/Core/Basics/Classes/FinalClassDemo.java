public class FinalClassDemo {
    public static void main(String[] args) {
        InnerFinalClassDemo objDemo = new InnerFinalClassDemo();
        double radius = 5.56;
        double areaOfCircle = objDemo.calculateArea(radius);
        System.out.println("Area of Circle for the radius : "+radius + " is : " +areaOfCircle);
    }
}
 final class InnerFinalClassDemo {
    static final double pie = 3.14;
    static double area;
    final double calculateArea(double radius){
        area = pie * (Math.pow(radius,2));
        return area;
    }
}