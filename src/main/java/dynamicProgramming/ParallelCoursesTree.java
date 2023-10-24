package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ParallelCoursesTree {

    //2050. Parallel Courses III
    //Hard
    //You are given an integer n, which indicates that there are n courses labeled from 1 to n. You are also given a 2D integer array relations where relations[j] = [prevCoursej, nextCoursej] denotes that course prevCoursej has to be completed before course nextCoursej (prerequisite relationship). Furthermore, you are given a 0-indexed integer array time where time[i] denotes how many months it takes to complete the (i+1)th course.
    //
    //You must find the minimum number of months needed to complete all the courses following these rules:
    //
    //    You may start taking a course at any time if the prerequisites are met.
    //    Any number of courses can be taken at the same time.
    //
    //Return the minimum number of months needed to complete all the courses.
    //
    //Note: The test cases are generated such that it is possible to complete every course (i.e., the graph is a directed acyclic graph).

    //Related Topics
    //Array
    //Dynamic Programming
    //Graph
    //Topological Sort

    public static int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] relation : relations) {
            int prev = relation[0] - 1;
            int next = relation[1] - 1;
            graph.get(next).add(prev);
        }

        int[] dp = new int[n];
        int overallMinTime = 0;

        for (int i = 0; i < n; i++) {
            overallMinTime = Math.max(overallMinTime, calculateTime(i, graph, time, dp));
        }

        return overallMinTime;
    }

    private static int calculateTime(int course, List<List<Integer>> graph, int[] time, int[] dp) {
        if (dp[course] != 0) {
            return dp[course];
        }

        int maxPrerequisiteTime = 0;
        for (int prereq : graph.get(course)) {
            maxPrerequisiteTime = Math.max(maxPrerequisiteTime, calculateTime(prereq, graph, time, dp));
        }

        dp[course] = maxPrerequisiteTime + time[course];
        return dp[course];
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] relations = {{1, 3}, {2, 3}};
        int[] time = {3, 2, 5};

        System.out.println(minimumTime(n, relations, time));
    }

/*
    public static void main(String[] args) {
        int n = 2;
        int[][] relations = {};
        int[] time = {3, 5};

        int[] input = {-1, 0, 1, 2, -1, -4};
        System.out.println(minimumTime(n, relations, time));
    }


     */

}
