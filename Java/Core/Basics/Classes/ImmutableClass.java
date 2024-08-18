public class ImmutableClass {
    public static void main(String[] args) {
        Shyam obj = new Shyam("Sid", "white");
        System.out.println(obj.getName());
        System.out.println(obj.getSkinTone());
    }
}
final class Shyam{
    final String name;
    final String skintone;

    Shyam(String name, String skintone){
      this.name = name;
      this.skintone = skintone;
    }

    public String getName(){
        return name;
    }
    public String getSkinTone(){
        return skintone;
    }
}