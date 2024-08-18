public class AbstractClassDemo {

    AbstractClassDemo(){
        System.out.println("Main class constructor called");
    }
    public static void main(String[] args){
        ImplementingCalculator objCalculator = new ImplementingCalculator();
        int result = objCalculator.operation(2, 3);
        System.out.println("Result : "+result);
        // AbstractClassDemo obj = new AbstractClassDemo();
    }
}
class ImplementingCalculator extends Casio{
    public ImplementingCalculator(){
        System.out.println("Implementing calculator constructor called ..");
    }
    @Override
    public int operation(int num1, int num2) {
        return num1 * num2;
    }

}
interface calculator{
    int operation(int num1, int num2);
}

abstract class Casio implements calculator
{
    public Casio(){
        System.out.println("Abstract class constuctor called  ");
    }
public abstract int operation(int num1, int num2);    
}

