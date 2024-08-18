public class POJOClassDemo {
    public static void main(String[] args){
        POJO obPojo = new POJO();
        POJO.setName("Shyam");
        obPojo.setAge(24);
        System.out.println(POJO.getName()+ " and my age is :"+obPojo.getAge());
    }
}
class POJO{
    private static String name;
    private int age;
    
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        POJO.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}