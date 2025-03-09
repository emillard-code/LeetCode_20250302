package com.project.attempt;

import java.util.*;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[][] nums1 = { {1, 2}, {2, 3}, {4, 5} };
        int[][] nums2 = { {1, 4}, {3, 2}, {4, 1} };
        int[][] nums3 = mergeTwo2DArraysBySummingValues(nums1, nums2);

        System.out.println(Arrays.deepToString(nums3));

        int[][] nums4 = { {2, 4}, {3, 6}, {5, 5} };
        int[][] nums5 = { {1, 3}, {4, 3} };
        int[][] nums6 = mergeTwo2DArraysBySummingValues(nums4, nums5);

        System.out.println(Arrays.deepToString(nums6));

    }

    // This method merges the two 2D arrays as per challenge specifications.
    public static int[][] mergeTwo2DArraysBySummingValues(int[][] nums1, int[][] nums2) {

        // We'll use a Set (as it can only contain unique values) to store each id that
        // exists between both of the 2D arrays. This ensures no duplicate id being repeated.
        TreeSet<Integer> integers = new TreeSet();

        for (int i = 0; i < nums1.length; i++) {
            integers.add(nums1[i][0]);
        }

        for (int i = 0; i < nums2.length; i++) {
            integers.add(nums2[i][0]);
        }

        // We'll then add back our collection of different id values into a LinkedList
        // and perform a sort operation on it to make sure they're in ascending order.
        LinkedList<Integer> integerList = new LinkedList(integers);

        Collections.sort(integerList);

        // We will then have a third array that will be the merger between the 2D arrays.
        int[][] nums3 = new int[integerList.size()][2];

        // We'll first add all the unique id values that exist between both 2D arrays.
        for (int i = 0; i < integerList.size(); i++) {

            nums3[i][0] = integerList.get(i);

        }

        // We will then add the corresponding values for each id into the merger array.
        for (int i = 0; i < nums1.length; i++) {

            for (int k = 0; k < nums3.length; k++) {

                if (nums3[k][0] == nums1[i][0]) {
                    nums3[k][1] = nums3[k][1] + nums1[i][1];
                }

            }

        }

        for (int i = 0; i < nums2.length; i++) {

            for (int k = 0; k < nums3.length; k++) {

                if (nums3[k][0] == nums2[i][0]) {
                    nums3[k][1] = nums3[k][1] + nums2[i][1];
                }

            }

        }

        return nums3;


    }

}
