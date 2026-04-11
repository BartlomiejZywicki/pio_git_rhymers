package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    /** Maksymalna pojemność stosu. */
    private static final int STACK_CAPACITY = 12;

    /** Wartość oznaczająca pusty stos. */
    private static final int EMPTY = -1;

    /** Tablica przechowująca elementy stosu. */
    private final int[] numbers = new int[STACK_CAPACITY];

    /** Indeks ostatniego elementu na stosie. */
    private int total = EMPTY;

    /**
     * Dodaje liczbę na stos, jeżeli stos nie jest pełny.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, czy stos jest pusty.
     *
    */
 public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     */
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    /**
     * Zwraca ostatnio dodany element bez usuwania go ze stosu.
     */
    protected int peekaBoo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatnio dodany element ze stosu.
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}
