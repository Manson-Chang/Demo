package simpleFactorySample;

public  class WorkHourse {

    public static void main(String[] args) {

//        FireWarrior fireWarrior = new FireWarrior();
//        fireWarrior.swordAttack();
//        IceWarrior iceWarrior = new IceWarrior();
//        iceWarrior.swordAttack();

        HeroFactory fireWarrior = new FireHeroFactory();
        fireWarrior.warrior().swordAttack();

        HeroFactory iceMagician = new IceHeroFactory();
        iceMagician.magician().magicAttack();

        HeroFactory poisonArcher = new PoisonHeroFactory();
        poisonArcher.archer().archerAttack();

    }



}
