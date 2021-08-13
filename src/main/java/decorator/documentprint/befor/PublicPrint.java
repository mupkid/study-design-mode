package decorator.documentprint.befor;

import java.awt.*;

/**
 * 对外宣传文档的打印
 *
 * @author haoxian, ou
 * @date 2021/7/22 21:41
 */
public class PublicPrint extends PrintTask {
    private Image logo;

    @Override
    public void print(String text) {
        Printer.printText(text);
        Printer.printImgWaterMark(logo);
    }
}
