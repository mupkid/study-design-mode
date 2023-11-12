package org.ohx.studybuilder.document;

public class TextBuilder extends Builder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("=========================\n")
                .append("[")
                .append(title)
                .append("]\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("■").append(str).append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            sb.append("•").append(item).append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("=========================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
