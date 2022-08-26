import com.sun.org.apache.xml.internal.security.utils.XalanXPathFactory;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface A1
{
    void show();
}
interface abstractLayer
{
    A1 createPC();
}
class laptop implements A1
{
    private String name;
    public laptop(String name)
    {
        this.name=name;
    }
    public void show()
    {
        System.out.println("Hello i am inside laptop "+name);
    }
}
class computer implements  A1
{
    private String name;
    public computer(String name)
    {
        this.name=name;
    }
    public void show()
    {
        System.out.println("Hello i am inside computer class "+name);
    }
}
class  LaptopFactory implements  abstractLayer
{
    private String name;

    public LaptopFactory(String name)
    {
        this.name=name;
    }
    @Override
    public A1 createPC() {
        return new laptop(name);
    }
}
class  computerFactory implements  abstractLayer
{
    private String name;
    public computerFactory(String name)
    {
        this.name=name;
    }
    @Override
    public A1 createPC() {
        return new computer(name);
    }
}
class Factory
{
    private Factory(){}
    public static A1 getInstance(abstractLayer a)
    {
        return a.createPC();
    }
}
class s
{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return "[ "+id+" : "+name+" ]";
    }
}
public class AbstractDesignPattern {
    public  static void main(String[] args)throws Exception{
     List<s> l = new ArrayList<>();
     s s1 = new s();
     s1.id=120;
     s1.name="Anuj sundriyal";
     s s2 = new s();
     s2.id=342;
     s2.name="Shailesh";
     s s3 = new s();
     s3.name="Pankash";
     s3.id=500;
     l.add(s1);
     l.add(s2);
     l.add(s3);
        System.out.println(l);
        System.out.println("============================");
        Stream<s> sp = l.stream();
       List<s> ll =sp.sorted(Comparator.comparing(s::getName)).collect(Collectors.toList());
        System.out.println(ll);

    }

}
