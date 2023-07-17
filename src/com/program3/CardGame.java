package com.program3;

public class CardGame {
    private final int c1;
    private final int c2;

    public CardGame(int c1, int c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public int output() {
        if (c1 > 0 && c2 > 0) return reverseNumberAndSum(c1, c2); //Both Positive
        else if (c1 < 0 && c2 < 0) return changeSignAndSum(c1, c2); // Both Negative
        else if (c2 < 0) return reverseNumberAndReverseSign(c1, c2); // + and -
        else return reverseNumberAndReverseSign(c2, c1); //- and +
    }

    private int reverseNumberAndReverseSign(int n1, int n2) {
        return reverseNumber(n1) + ((-1) * n2);
    }

    private int changeSignAndSum(int n1, int n2) {
        return ((-1) * n1) + ((-1) * n2);
    }

    private int reverseNumberAndSum(int n1, int n2) {
        return reverseNumber(n1) + reverseNumber(n2);
    }

    // Easy One Compared to Traditional Method
    private int reverseNumber(int number) {
        String s = Integer.toString(number);
        String rs = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(rs);
    }

}