package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {
    /**
     * Pomocniczy stos używany do odwracania kolejności elementów.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    /**
     * Zwraca pierwszy wprowadzony element.
     * Wykorzystuje stos pomocniczy do tymczasowego przebudowania struktury.
     * * @return Wartość pierwszego elementu w kolejce lub -1, jeśli pusta.
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
