package abstractFactory;

// 鬥士(ConcreteProduct)
public class Warrior implements Adventurer {
    @Override
    public String getType() {
        System.out.println("我是鬥士");
        return  this.getClass().getSimpleName();
    }
}
