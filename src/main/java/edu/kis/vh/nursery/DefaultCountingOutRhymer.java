package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int startNumber = -1;
    private static final int numbersCount = 12;
    private final int[] numbers = new int[numbersCount];

    private int total = startNumber;
    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() { return total == startNumber; }

    public boolean isFull() {
        return total == (numbersCount-1);
    }

    protected int peekaboo() {
        if (callCheck())
            return startNumber;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return startNumber;
        return numbers[total--];
    }

}
