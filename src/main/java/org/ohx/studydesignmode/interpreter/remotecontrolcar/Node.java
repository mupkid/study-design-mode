package org.ohx.studydesignmode.interpreter.remotecontrolcar;

/**
 * @author mudkip
 * @date 2022/10/7
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
