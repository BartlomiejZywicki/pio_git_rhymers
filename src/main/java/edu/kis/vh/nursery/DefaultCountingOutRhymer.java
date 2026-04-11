package edu.kis.vh.nursery;
// Projekt poprawny – testy jednostkowe przechodzą bez zmian
public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY = -1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
