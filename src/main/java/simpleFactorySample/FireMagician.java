package simpleFactorySample;

public class FireMagician implements Magician{
    @Override
    public void magicAttack() {
        System.out.println("Magician fire attack");
    }
}
