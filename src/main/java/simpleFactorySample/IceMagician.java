package simpleFactorySample;

public class IceMagician implements Magician{
    @Override
    public void magicAttack() {
        System.out.println("Magician Ice attack");
    }
}
