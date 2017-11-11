package info.xiaomo.strategy;

import info.xiaomo.strategy.bean.DecoyDuck;
import info.xiaomo.strategy.bean.MultiplyContext;
import info.xiaomo.strategy.bean.RedHeadDuck;
import info.xiaomo.strategy.bean.RubberDuck;
import info.xiaomo.strategy.bean.base.AbstractDuck;

public class StrategyMain {

    public static void main(String[] args) {
        AbstractDuck decoyAbstractDuck = new DecoyDuck();
        decoyAbstractDuck.display();
        decoyAbstractDuck.performFly();
        decoyAbstractDuck.performQuack();
        System.out.println("\n");

        AbstractDuck redHeadAbstractDuck = new RedHeadDuck();
        redHeadAbstractDuck.display();
        redHeadAbstractDuck.performQuack();
        redHeadAbstractDuck.performFly();
        System.out.println("\n");

        AbstractDuck rubberAbstractDuck = new RubberDuck();
        rubberAbstractDuck.display();
        rubberAbstractDuck.performFly();
        rubberAbstractDuck.performQuack();

        //计算策略
        MultiplyContext addContext = new MultiplyContext();
        addContext.count(1,5);

    }
}
