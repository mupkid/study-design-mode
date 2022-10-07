package org.ohx.studydesignmode.interpreter.remotecontrolcar;

/**
 * @author mudkip
 * @date 2022/10/7
 */
public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
