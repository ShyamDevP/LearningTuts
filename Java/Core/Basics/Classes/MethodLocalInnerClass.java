public class MethodLocalInnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.area();
    }
}
class Outer{
    int side = 5;
    public void area(){
        class CalculateAreaOfRec{
            void display(){
            int area  = 2 * side * side;
            System.out.println("Area :"+area);
        }
        }
        CalculateAreaOfRec obj = new CalculateAreaOfRec();
        obj.display();
    }
    
}