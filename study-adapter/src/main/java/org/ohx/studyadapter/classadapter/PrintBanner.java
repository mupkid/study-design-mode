package org.ohx.studyadapter.classadapter;

/**
 * @author mudkip
 * @date 2023/7/12
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
