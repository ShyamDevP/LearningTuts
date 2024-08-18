public class NestedInnerClass {
    public static void main(String[] args) {
        OuterDemo.InnerClass obj = new OuterDemo.InnerClass();
        obj.display();
    }    
}

class OuterDemo{
    private static String name = "Shyam";
    private static int age  = 24;

    
    static class InnerClass{
        public void display(){
            System.out.println("My name :"+name+" and my age is :"+age);
        }
    }
}
