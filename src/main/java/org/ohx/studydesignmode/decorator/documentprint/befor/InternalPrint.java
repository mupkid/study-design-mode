package org.ohx.studydesignmode.decorator.documentprint.befor;

/**
 * 内部公开文档的打印
 *
 * @author haoxian, ou
 * @date 2021/7/22 21:14
 */
public class InternalPrint extends PrintTask {
    @Override
    public void print(String text) {
        Printer.printHeader("内部公开");
        Printer.printText(text);
        Printer.printTextWaterMark("培训资料");
    }
}
