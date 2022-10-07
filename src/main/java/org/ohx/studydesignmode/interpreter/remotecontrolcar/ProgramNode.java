package org.ohx.studydesignmode.interpreter.remotecontrolcar;

/**
 * @author mudkip
 * @date 2022/10/7
 */
public class ProgramNode extends Node {
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + ']';
    }
}
