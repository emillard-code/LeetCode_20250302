package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void mergeArrays() {

        int[][] nums1 = { {1, 2}, {2, 3}, {4, 5} };
        int[][] nums2 = { {1, 4}, {3, 2}, {4, 1} };
        int[][] nums3 = { {1, 6}, {2, 3}, {3, 2}, {4, 6} };
        int[][] nums4 = LeetCodeSolution.mergeArrays(nums1, nums2);

        assertArrayEquals(nums3, nums4);

        int[][] nums5 = { {2, 4}, {3, 6}, {5, 5} };
        int[][] nums6 = { {1, 3}, {4, 3} };
        int[][] nums7 = { {1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5} };
        int[][] nums8 = LeetCodeSolution.mergeArrays(nums5, nums6);

        assertArrayEquals(nums7, nums8);

    }

}
