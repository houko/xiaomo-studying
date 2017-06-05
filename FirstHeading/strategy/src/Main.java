import info.xiaomo.strategy.bean.DecoyDuck;
import info.xiaomo.strategy.bean.RedHeadDcuk;
import info.xiaomo.strategy.bean.RubberDuck;
import info.xiaomo.strategy.bean.base.Duck;

public class Main {

    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println("\n");

        Duck redHeadDuck = new RedHeadDcuk();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        System.out.println("\n");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
