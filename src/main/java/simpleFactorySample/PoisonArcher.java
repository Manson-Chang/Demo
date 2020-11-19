package simpleFactorySample;

public class PoisonArcher implements Archer{

    @Override
    public void archerAttack() {
        System.out.println("Archer poison attack");
    }
}
