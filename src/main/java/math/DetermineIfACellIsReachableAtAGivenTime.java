package math;

public class DetermineIfACellIsReachableAtAGivenTime {

    //2849. Determine if a Cell Is Reachable at a Given Time
    //Medium
    //You are given four integers sx, sy, fx, fy, and a non-negative integer t.
    //
    //In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.
    //
    //Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.
    //
    //A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.


    //Related Topics
    //Math

    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        if (sx == fx && sy == fy) {
            if (t == 1) {
                return false;
            }
            if (t == 0) {
                return true;
            }
        }

        int x = Math.abs(sx - fx);
        int y = Math.abs(fx - fy);

        int maxDifference = Math.max(x, y);

        return maxDifference <= t;
    }

    public static void main(String[] args) {
        int sx = 1;
        int sy = 4;
        int fx = 1;
        int fy = 2;
        int t = 1;

        System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
    }
}
