package decorator.documentprint.after;

/**
 * 文本打印，对应 Decorator 模式中的 ConcreteComponent
 * 打印任务到 ConcreteComponent 就算真正完成了
 *
 * @author haoxian, ou
 * @date 2021/7/22 22:54
 */
public class TextComponent extends PrintComponent {
    private String text;

    public TextComponent(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        Printer.printText(this.text);
    }
}
