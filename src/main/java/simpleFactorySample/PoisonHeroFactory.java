package simpleFactorySample;

public class PoisonHeroFactory implements HeroFactory{


    @Override
    public Warrior warrior() {
        return null;
    }

    @Override
    public Magician magician() {
        return null;
    }

    @Override
    public Archer archer() {
        return new PoisonArcher();
    }
}
