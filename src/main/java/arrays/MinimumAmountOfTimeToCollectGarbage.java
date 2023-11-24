package arrays;

public class MinimumAmountOfTimeToCollectGarbage {

    //2391. Minimum Amount of Time to Collect Garbage
    //Medium
    //You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.
    //
    //You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.
    //
    //There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.
    //
    //Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.
    //
    //Return the minimum number of minutes needed to pick up all the garbage.

    //Related Topics
    //Array
    //String
    //Prefix Sum

    public int garbageCollection(String[] garbage, int[] travel) {

        int result = 0;
        int lastM = -1;
        int lastP = -1;
        int lastG = -1;
        int total = 0;

        for (int i = 0; i < garbage.length; i++) {
            String s = garbage[i];
            if (s.contains("M")) {
                lastM = i;
            }
            if (s.contains("P")) {
                lastP = i;
            }
            if (s.contains("G")) {
                lastG = i;
            }
            total += s.length();
        }
        result = total;
        for (int i = 0; i < lastG; i++) {
            result += travel[i];
        }
        for (int i = 0; i < lastM; i++) {
            result += travel[i];
        }
        for (int i = 0; i < lastP; i++) {
            result += travel[i];
        }
        return result;

    }

    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage minimumAmountOfTimeToCollectGarbage = new MinimumAmountOfTimeToCollectGarbage();
        int result = minimumAmountOfTimeToCollectGarbage.garbageCollection(new String[]{"MMM", "PGM", "GP"}, new int[]{3, 10});
        System.out.println(result);
    }

}
