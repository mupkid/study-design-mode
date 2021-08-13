package decorator.documentprint.after;

/**
 * 修饰的打印任务，对应 Decorator 模式中的 Decorator
 * Decorator 可以聚合 ConcreteComponent 或者其他 Decorator
 * 这样可以使得打印任务能够嵌套执行下去，直到最后完成所有的打印任务
 *
 * @author haoxian, ou
 * @date 2021/7/22 22:47
 */
public abstract class PrintDecorator extends PrintComponent {
    @Override
    abstract public void print();
}
