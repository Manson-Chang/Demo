package abstractFactory;


/**
 * 弓箭手訓練營(ConcreteFactory)
 */
public class ArcherTrainingCamp implements TrainingCamp{
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("訓練一個弓箭手");
        return new Archer();
    }
}
