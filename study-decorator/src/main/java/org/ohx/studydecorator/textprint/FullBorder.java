package org.ohx.studydecorator.textprint;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + String.valueOf('-').repeat(Math.max(0, display.getColumns())) + "+";
        } else {
            return "!" + display.getRowText(row - 1) + "|";
        }
    }
}
