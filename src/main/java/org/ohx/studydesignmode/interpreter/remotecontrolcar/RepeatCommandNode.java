package org.ohx.studydesignmode.interpreter.remotecontrolcar;

/**
 * @author mudkip
 * @date 2022/10/7
 */
public class RepeatCommandNode extends Node {
    private int number;

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
