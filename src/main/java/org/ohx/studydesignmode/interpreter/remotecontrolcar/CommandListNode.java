package org.ohx.studydesignmode.interpreter.remotecontrolcar;

import java.util.ArrayList;

/**
 * @author mudkip
 * @date 2022/10/7
 */
public class CommandListNode extends Node {
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
