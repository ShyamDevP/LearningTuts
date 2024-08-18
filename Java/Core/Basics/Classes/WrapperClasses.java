public class WrapperClasses {
    public static void main(String args[])  {  
    Main obj = new Main();
    obj.displayConversions();
    }
}
 class Main {  
    public void displayConversions(){
        byte bbyte=10;  
        short sshort=20;  
        int iint=300;  
        long llong=400;  
        float ffloat=3.14F;  
        double ddouble=77.2D;  
        char cchar='A';  
        boolean bboolean=true;  
   
        //Convert primitives into objects => Autoboxing 
        Byte byteobj=bbyte;  
        Short shortobj=sshort;  
        Integer intobj=iint;  
        Long longobj=llong;  
        Float floatobj=ffloat;  
        Double doubleobj=ddouble;  
        Character charobj=cchar;  
        Boolean boolobj=bboolean;  
 
         //Print converted objects  
        System.out.println("Primitives converted to Objects:");  
        System.out.println("Byte object: "+byteobj);  
        System.out.println("Short object: "+shortobj);  
        System.out.println("Integer object: "+intobj);  
        System.out.println("Long object: "+longobj);  
        System.out.println("Float object: "+floatobj);  
        System.out.println("Double object: "+doubleobj);  
        System.out.println("Character object: "+charobj);  
        System.out.println("Boolean object: "+boolobj);  
   
        //Convert Objects to Primitives => Unboxing 
        byte bytevalue=byteobj;  
        short shortvalue=shortobj;  
        int intvalue=intobj;  
        long longvalue=longobj;  
        float floatvalue=floatobj;  
        double doublevalue=doubleobj;  
        char charvalue=charobj;  
        boolean boolvalue=boolobj;  
   
        //Print primitives  
        System.out.println("Converting Objects to Primitives");  
        System.out.println("byte value: "+bytevalue);  
        System.out.println("short value: "+shortvalue);  
        System.out.println("int value: "+intvalue);  
        System.out.println("long value: "+longvalue);  
        System.out.println("float value: "+floatvalue);  
        System.out.println("double value: "+doublevalue);  
        System.out.println("char value: "+charvalue);  
        System.out.println("boolean value: "+boolvalue);  
    }
}
