package math;

public class DivisorGame {

    //1025. Divisor Game
    //Easy
    //Alice and Bob take turns playing a game, with Alice starting first.
    //
    //Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
    //
    //    Choosing any x with 0 < x < n and n % x == 0.
    //    Replacing the number n on the chalkboard with n - x.
    //
    //Also, if a player cannot make a move, they lose the game.
    //
    //Return true if and only if Alice wins the game, assuming both players play optimally.

    //Related Topics
    //Math
    //Dynamic Programming
    //Brainteaser
    //Game Theory

    public boolean divisorGame(int n) {

        boolean[] dp = new boolean[n + 1];
        dp[0] = false;
        dp[1] = false;


        for (int i = 2; i <= n; i++) {
            dp[i] = !dp[i-1];
        }
        return dp[n];
    }
}
