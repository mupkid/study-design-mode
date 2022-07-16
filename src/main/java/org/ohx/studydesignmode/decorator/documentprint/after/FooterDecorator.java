package org.ohx.studydesignmode.decorator.documentprint.after;

/**
 * 页脚打印，和页眉打印类似
 *
 * @author haoxian, ou
 * @date 2021/7/23 7:45
 */
public class FooterDecorator extends PrintDecorator {
    /**
     * 被修饰的打印组件
     */
    private PrintComponent component;

    /**
     * 需要打印的页眉内容
     */
    private String text;

    public FooterDecorator(PrintComponent component, String text) {
        this.component = component;
        this.text = text;
    }

    @Override
    public void print() {
        Printer.printFooter(this.text);

        this.component.print();
    }
}
