package org.ohx.studystrategy.fingerguess;

public interface Strategy {
    Hand nextHand();

    void study(boolean win);
}
