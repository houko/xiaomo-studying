import info.xiaomo.bean.DecoyDuck;
import info.xiaomo.bean.RedHeadDcuk;
import info.xiaomo.bean.RubberDuck;
import info.xiaomo.bean.base.Duck;

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
