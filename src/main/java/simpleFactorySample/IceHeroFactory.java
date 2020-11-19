package simpleFactorySample;

public class IceHeroFactory implements  HeroFactory{
    @Override
    public Warrior warrior() {
        return new IceWarrior();
    }

    @Override
    public Magician magician() {
        return new IceMagician();
    }

    @Override
    public Archer archer() {
        return null;
    }
}
