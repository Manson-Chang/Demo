package abstractFactory;

/**
        * 魔法師訓練營(ConcreteFactory)
        */
public class MagicianTrainingCamp implements TrainingCamp{
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個魔法師");
        return new Magician();
    }
}
