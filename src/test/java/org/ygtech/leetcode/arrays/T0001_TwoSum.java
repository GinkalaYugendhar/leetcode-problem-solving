
package org.ygtech.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class T0001_TwoSum {

    @Test
    void testExample1() {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = P0001_TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testExample2() {

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = P0001_TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testExample3() {

        int[] nums = {3, 3};
        int target = 6;

        int[] result = P0001_TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}