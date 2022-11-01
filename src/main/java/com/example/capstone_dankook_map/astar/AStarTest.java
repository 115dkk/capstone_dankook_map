package com.example.capstone_dankook_map.astar;

import java.util.List;

public class AStarTest {

    public static void main(String[] args) {
        Node initialNode = new Node(10, 11);
        Node finalNode = new Node(3, 3);
        int rows = 20;
        int cols = 14;
        AStar aStar = new AStar(rows, cols, initialNode, finalNode);
        int[][] blocksArray = new int[][]{{ 0 , 5 },
                { 0 , 6 },
                { 0 , 7 },
                { 0 , 8 },
                { 0 , 9 },
                { 0 , 10 },
                { 0 , 11 },
                { 0 , 16 },
                { 0 , 19 },
                { 1 , 5 },
                { 1 , 6 },
                { 1 , 7 },
                { 1 , 8 },
                { 1 , 9 },
                { 1 , 10 },
                { 1 , 11 },
                { 1 , 16 },
                { 1 , 19 },
                { 2 , 5 },
                { 2 , 11 },
                { 2 , 19 },
                { 3 , 5 },
                { 3 , 6 },
                { 3 , 7 },
                { 3 , 9 },
                { 3 , 10 },
                { 3 , 11 },
                { 3 , 13 },
                { 3 , 14 },
                { 3 , 15 },
                { 3 , 16 },
                { 3 , 17 },
                { 3 , 18 },
                { 3 , 19 },
                { 4 , 0 },
                { 4 , 1 },
                { 4 , 2 },
                { 4 , 3 },
                { 4 , 17 },
                { 5 , 0 },
                { 6 , 0 },
                { 6 , 18 },
                { 6 , 19 },
                { 7 , 0 },
                { 7 , 1 },
                { 7 , 2 },
                { 7 , 3 },
                { 7 , 4 },
                { 7 , 5 },
                { 7 , 18 },
                { 7 , 19 },
                { 8 , 2 },
                { 8 , 5 },
                { 8 , 15 },
                { 8 , 16 },
                { 8 , 17 },
                { 8 , 18 },
                { 8 , 19 },
                { 9 , 0 },
                { 9 , 2 },
                { 9 , 3 },
                { 9 , 4 },
                { 9 , 5 },
                { 9 , 15 },
                { 10 , 9 },
                { 10 , 11 },
                { 10 , 15 },
                { 11 , 2 },
                { 11 , 4 },
                { 11 , 5 },
                { 11 , 7 },
                { 11 , 9 },
                { 11 , 11 },
                { 11 , 13 },
                { 11 , 15 },
                { 11 , 16 },
                { 11 , 17 },
                { 11 , 18 },
                { 11 , 19 },
                { 12 , 0 },
                { 12 , 1 },
                { 12 , 2 },
                { 12 , 4 },
                { 12 , 7 },
                { 12 , 9 },
                { 12 , 10 },
                { 12 , 11 },
                { 12 , 13 },
                { 13 , 4 },
                { 13 , 7 },
                { 13 , 9 },
                { 13 , 10 },
                { 13 , 11 },
                { 13 , 13 },
                { 14 , 4 },
                { 14 , 7 },
                { 14 , 9 },
                { 14 , 10 },
                { 14 , 11 },
                { 14 , 13 }};
        aStar.setBlocks(blocksArray);
        List<Node> path = aStar.findPath();
        for (Node node : path) {
            System.out.println(node);
        }

        //Search Area
        //      0   1   2   3   4   5   6
        // 0    -   -   -   -   -   -   -
        // 1    -   -   -   B   -   -   -
        // 2    -   I   -   B   -   F   -
        // 3    -   -   -   B   -   -   -
        // 4    -   -   -   -   -   -   -
        // 5    -   -   -   -   -   -   -

        //Expected output with diagonals
        //Node [row=2, col=1]
        //Node [row=1, col=2]
        //Node [row=0, col=3]
        //Node [row=1, col=4]
        //Node [row=2, col=5]

        //Search Path with diagonals
        //      0   1   2   3   4   5   6
        // 0    -   -   -   *   -   -   -
        // 1    -   -   *   B   *   -   -
        // 2    -   I*  -   B   -  *F   -
        // 3    -   -   -   B   -   -   -
        // 4    -   -   -   -   -   -   -
        // 5    -   -   -   -   -   -   -

        //Expected output without diagonals
        //Node [row=2, col=1]
        //Node [row=2, col=2]
        //Node [row=1, col=2]
        //Node [row=0, col=2]
        //Node [row=0, col=3]
        //Node [row=0, col=4]
        //Node [row=1, col=4]
        //Node [row=2, col=4]
        //Node [row=2, col=5]

        //Search Path without diagonals
        //      0   1   2   3   4   5   6
        // 0    -   -   *   *   *   -   -
        // 1    -   -   *   B   *   -   -
        // 2    -   I*  *   B   *  *F   -
        // 3    -   -   -   B   -   -   -
        // 4    -   -   -   -   -   -   -
        // 5    -   -   -   -   -   -   -
    }
}
