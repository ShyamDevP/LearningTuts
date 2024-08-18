public class SingletonClass {
    public static void main(String[] args) {
        SingleTon obj1 =  SingleTon.getSingleTonInstance();
        SingleTon obj2 =  SingleTon.getSingleTonInstance();
        
        System.out.println("(obj1.str) :: "+ obj1.str +"  "+ obj1.hashCode());
        System.out.println("(obj2.str) :: "+ obj2.str + "  "+ obj2.hashCode());

        obj1.str = (obj1.str).toUpperCase();
        System.out.println("After changing to upper case");
        System.out.println("(obj1.str) :: "+ obj1.str + "  "+ obj1.hashCode());
        System.out.println("(obj2.str) :: "+ obj2.str + "   "+ obj2.hashCode());
    }
}
class SingleTon{
    private static SingleTon single_instance = null;
    public  String str;
    private SingleTon(){
        str = "Only Single instance will be created at any point of time ";
        System.out.println("SingleTOn Class :: Private Constructor");
        System.out.println(str);
    }

    // method to create a single instance for Singleton class
    public static SingleTon getSingleTonInstance(){
        if(single_instance == null)
            single_instance =  new SingleTon();
        
        return single_instance;
    }
}