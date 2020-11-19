package abstractFactory;

public class TrainingCampTest{

    public static void main(String[] args) {
        System.out.println("==========工廠模式測試==========");

        //訓練營訓練冒險者
        //先用弓箭手訓練營訓練弓箭手
        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = trainingCamp.trainAdventurer();
        memberA.getType();

        //用鬥士訓練營訓練鬥士
        trainingCamp = new WarriorTrainingCamp();
        Adventurer memberB = trainingCamp.trainAdventurer();
        memberB.getType();

        //用魔法師訓練營訓練魔法師
        trainingCamp = new MagicianTrainingCamp();
        Adventurer memberC = trainingCamp.trainAdventurer();
        memberC.getType();

        //看看是不是真的訓練出我們想要的冒險者
//        System.out.println("Archer = " + memberA.getType());
//        System.out.println("Warrior = " + memberB.getType());
//        System.out.println("Knight = " + memberB.getType());
    }

}
