package decorator.documentprint.after;

import java.awt.*;

/**
 * 图片水印打印
 *
 * @author haoxian, ou
 * @date 2021/7/23 7:50
 */
public class ImgWaterMarkDecorator extends PrintDecorator {
    /**
     * 被修饰的打印组件
     */
    private PrintComponent component;

    /**
     * 图片水印只能是公司logo
     */
    private static Image logo;

    public ImgWaterMarkDecorator(PrintComponent component) {
        this.component = component;
    }

    @Override
    public void print() {
        Printer.printImgWaterMark(logo);

        this.component.print();
    }
}
