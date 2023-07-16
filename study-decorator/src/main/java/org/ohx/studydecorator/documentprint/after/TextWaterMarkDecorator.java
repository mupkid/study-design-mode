package org.ohx.studydecorator.documentprint.after;

/**
 * 文本水印打印
 *
 * @author haoxian, ou
 * @date 2021/7/23 7:48
 */
public class TextWaterMarkDecorator extends PrintDecorator {
    /**
     * 被修饰的打印组件
     */
    private PrintComponent component;

    /**
     * 需要打印的页眉内容
     */
    private String text;

    public TextWaterMarkDecorator(PrintComponent component, String text) {
        this.component = component;
        this.text = text;
    }

    @Override
    public void print() {
        Printer.printTextWaterMark(this.text);

        this.component.print();
    }
}
