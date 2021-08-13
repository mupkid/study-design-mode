package decorator.documentprint.after;

/**
 * 页眉打印
 *
 * @author haoxian, ou
 * @date 2021/7/22 23:03
 */
public class HeaderDecorator extends PrintDecorator {
    /**
     * 被修饰的打印组件
     */
    private PrintComponent component;

    /**
     * 需要打印的页眉内容
     */
    private String text;

    /**
     * 初始化的时候，必须包含其他打印组件 component ，这是实现 Decorator 模式的前提
     * 同时需要指定当前组件所需的参数，不能在print函数的参数指定
     * 因为每个 Decorator 所需的参数是不一样的
     *
     * @param component 其他打印组件
     * @param text 需要打印的参数
     */
    public HeaderDecorator(PrintComponent component, String text) {
        this.component = component;
        this.text = text;
    }

    @Override
    public void print() {
        // 打印的时候将当前 Decorator 和被修饰的 Component 分开，这是 Decorator 模式的关键
        Printer.printHeader(this.text);

        // component 本身如果是 Decorator，就会嵌套打印下去
        // component 本身如果不是 Decorator，而是 ConcreteComponent，则打印任务到此结束
        this.component.print();
    }
}
