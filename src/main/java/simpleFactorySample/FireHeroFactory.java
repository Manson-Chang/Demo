package simpleFactorySample;

public class FireHeroFactory implements HeroFactory{
    @Override
    public Warrior warrior() {
        return new FireWarrior();
    }

    @Override
    public Magician magician() {
        return new FireMagician();
    }

    @Override
    public Archer archer() {
        return null;
    }
}
