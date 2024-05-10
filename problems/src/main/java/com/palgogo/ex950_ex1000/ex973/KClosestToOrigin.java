package com.palgogo.ex950_ex1000.ex973;

import java.util.PriorityQueue;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class KClosestToOrigin {

    //two solutions with standard minHeap and another one more optimized with max heap
    //First solution Time Complexity is O(NlogN)
    //Just take a min heap and add the values using the formula and return the top k values
    //We can completely ignore the square root as we are just comparing the values (if a*a>b*b => a>b)

    public int[][] kClosestToOriginMinHeap(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->
                Integer.compare(
                        (a[0] * a[0] + a[1] * a[1]),
                        (b[0] * b[0] + b[1] * b[1])
                ));
        //fill the queue
        for (int[] point : points) {
            q.offer(point);
        }

        //prepare the answer
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] cur = q.poll();
            ans[i][0] = cur[0];
            ans[i][1] = cur[1];
        }

        return ans;
    }

    public int[][] kClosestToOriginMaxHeap(int[][] points, int k) {
        //create maxheap with PriorityHeap
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(
                (b[0] * b[0] + b[1] * b[1]),
                (a[0] * a[0] + a[1] * a[1])
        ));

        //fill the heap exactly k elements
        for (int[] point : points) {
            queue.offer(point);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        //fill the answer block
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] cur = queue.poll();
            ans[i][0] = cur[0];
            ans[i][1] = cur[1];
        }

        return ans;
    }
}
