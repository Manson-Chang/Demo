package abstractFactory;

// 弓箭手(ConcreteProduct)
public class Archer implements Adventurer{
    @Override
    public String getType() {
        System.out.println("我是弓箭手");
        return  this.getClass().getSimpleName();
    }
}
