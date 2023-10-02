package math;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {

    //2038. Remove Colored Pieces if Both Neighbors are the Same Color
    //Medium
    //There are n pieces arranged in a line, and each piece is colored either by 'A' or by 'B'. You are given a string colors of length n where colors[i] is the color of the ith piece.
    //
    //Alice and Bob are playing a game where they take alternating turns removing pieces from the line. In this game, Alice moves first.
    //
    //    Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. She is not allowed to remove pieces that are colored 'B'.
    //    Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. He is not allowed to remove pieces that are colored 'A'.
    //    Alice and Bob cannot remove pieces from the edge of the line.
    //    If a player cannot make a move on their turn, that player loses and the other player wins.
    //
    //Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.

    //Related Topics
    //Math
    //String
    //Greedy
    //Game Theory


    public boolean winnerOfGame(String colors) {

        if (colors.length() < 3) {
            return false;
        }

        int aliceScore = 0;
        int bobScore = 0;

        int left = 1;
        int right = colors.length() - 2;

        while (left <= right) {
            if (colors.charAt(left) == colors.charAt(left + 1) && colors.charAt(left) == colors.charAt(left - 1)) {

                if (colors.charAt(left) == 'A') {
                    aliceScore++;
                } else bobScore++;

            }

            if (colors.charAt(right) == colors.charAt(right + 1) && colors.charAt(right) == colors.charAt(right - 1)) {

                if (colors.charAt(right) == 'A') {
                    aliceScore++;
                } else bobScore++;

            }

            right--;
            left++;


        }

        return aliceScore > bobScore;

    }

    public boolean winnerOfGame1(String colors) {
        int aTemp = 0, bTemp = 0;

        int aliceScore = 0;
        int bobScore = 0;


        for (int i = 0; i < colors.length(); i++) {
            char c = colors.charAt(i);
            if (c == 'A') {
                bTemp = 0;
                aTemp++;
                if (aTemp >= 3) {
                    aliceScore++;
                }
            } else {
                aTemp = 0;
                bTemp++;
                if (bTemp >= 3) {
                    bobScore++;
                }
            }
        }
        return aliceScore > bobScore;
    }

}
