interface Pizza
{
  void bakingProcess();
}
class Margerita implements  Pizza
{
    public void bakingProcess()
    {
        System.out.println("Margerita Class is runnning");
    }
}
class CheezPizza implements Pizza
{
    public void bakingProcess()
    {
        System.out.println("CheezPizza Class is running");
    }
}
class FactoryClass
{
    public static Pizza getInstance(String classname)
    {
        if(classname.equals("Margerita"))
            return new Margerita();
        else if(classname.equals("CheezPizza"))
            return new CheezPizza();
        return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Pizza p = FactoryClass.getInstance("CheezPizza");
        p.bakingProcess();
    }
}
