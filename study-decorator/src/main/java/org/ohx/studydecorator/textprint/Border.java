package org.ohx.studydecorator.textprint;

public abstract class Border extends Display{
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
