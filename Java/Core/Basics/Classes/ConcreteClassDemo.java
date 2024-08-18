public class ConcreteClassDemo extends ClassA implements Movements {
    @Override
    public void method1(){
        System.out.println("Overrided the method1 of abstract class");
    }
    public static void main(String[] args) {
        ConcreteClassDemo objDemo = new ConcreteClassDemo();
        objDemo.method1();
        String name = ClassA.method2();
        System.out.println("Name : "+name);
        objDemo.move();
    }
    @Override
    public void move() {
        System.out.println("Movement started ....");
    }

}
abstract class ClassA{
    abstract void method1();

    static String method2(){
        return "Shyam";
    }
}
/**
 *  Movements
 
 void move();*/
 interface  Movements {
    void move(); 
}
