package abstractFactory;

public class Magician implements Adventurer{


    @Override
    public String getType() {
        System.out.println("我是魔法師");
        return  this.getClass().getSimpleName();
    }
}
