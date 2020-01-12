package com.company;

public class MainGame {

    public static void main(String[] args) {

        System.out.println("This is just for a trial.");

        System.out.println();

        /*

         The wonder number to leave for opponent to provide yourself 100% win is the nearest element of the
        following sequence:

                       wonderNumber = 4*i + 1, i = 0, 1, 2, ...

         In counting system with radix 4 this is any number with the most right digit equal to 1. So the only last
        digit here in 4-radix equivalent of the number matters! In binary representation it is the two right bits
        of the number. So these 2 most right bits should be 0b01 to make the number a wonder number.
         For every possible combination of these 2 right bits of current number ( actually there are only four of
        them ) the 2 corresponding right bits of the number that is 1 less than current are exactly those that
        having been subtracted from current number make its 2 right bits equal to 0b01 that is make the current number
        a wonder number, being at the same time within the tolerance for one move ( i.e. less than 4 ):

                matchesToRemoveToWin = (numberOfMatches - 1) & 0b11

         */

        byte numberOfMatches = 20;
        byte matchesToRemoveToWin = (byte) ((numberOfMatches - 1) & 0b11);
        byte newNumberOfMatches = (byte) (numberOfMatches - matchesToRemoveToWin);

        System.out.println("numberOfMatches = " + numberOfMatches);
        System.out.println("matchesToRemoveToWin = " + matchesToRemoveToWin);
        System.out.println("newNumberOfMatches = " + newNumberOfMatches);

    }
}
