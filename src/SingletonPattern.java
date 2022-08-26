import java.lang.reflect.Field;
/**
 This is show singleton design pattern with eager intilization because because is already created and project
 and static is created once and it is a creational design pattern
 */
class A
{
    private static A a = new A();
    private A(){}
    public static A getInstance()
    {
        return a;
    }
}
/*
this B is the example of lazy intilization object is created on demand
 */
class B
{
    private static B b;
    private B(){}
    public static B getInstance()
    {
        if(b==null)
            b= new B();
        return b;
    }
}
/*
when two or more user trying to access the C class at the same time then their is problem occur so for this
we can make our method synchronized
 */
class C
{
    private static C c;
    private C(){}
    public static synchronized C getInstance()
    {
        if(c==null)
            c= new C();
        return c;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        System.out.println("===========Eager intilization Of A===============");
        System.out.println(A.getInstance());
        System.out.println(A.getInstance());
        System.out.println("===========Lazy intilization Of B===============");
        System.out.println(B.getInstance());
        System.out.println(B.getInstance());
        System.out.println("===========Lazy intilization Of C With Synchronized Method===============");
        System.out.println(C.getInstance());
        System.out.println(C.getInstance());
    }
}
