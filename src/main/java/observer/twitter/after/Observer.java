package observer.twitter.after;

/**
 * 观察者
 *
 * @author haoxian, ou
 * @date 2021/7/28 0:29
 */
abstract public class Observer {
    /**
     * “观察者”类提供给”发布者“类的接口，此接口的实现关键点在于并没有参数
     * 这样达到通用性
     */
    abstract public void update();
}
