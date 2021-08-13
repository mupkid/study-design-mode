package decorator.documentprint.befor;

/**
 * 绝密文档的打印
 *
 * @author haoxian, ou
 * @date 2021/7/22 20:45
 */
public class SecretPrint extends PrintTask {

    @Override
    public void print(String text) {
        Printer.printHeader("绝密");
        Printer.printText(text);
        Printer.printFooter("本文包含绝密信息，请勿泄露！");
        Printer.printTextWaterMark("绝密文档");
    }
}
