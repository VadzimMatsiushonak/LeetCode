package by.vadzim.LeetCode75.Day5.T121;

/**
 * Best results
 * <p>
 * Runtime 1 ms Beats 100%
 * <p>
 * Memory 58.7 MB Beats 84.81%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int result2 = solution.maxProfit(new int[]{7, 6, 4, 3, 1});

        System.out.println((5 == result1) + " result1 = " + result1);
        System.out.println((0 == result2) + " result2 = " + result2);
    }

    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            bestProfit = Math.max(bestProfit, prices[i] - min);
        }
        return bestProfit;
    }

/*
    Second solution
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int left = 0;

        int profit;
        for (int i = 0; i < prices.length; i++) {
            profit = prices[i] - prices[left];
            if (profit > 0) {
                if (profit > bestProfit) {
                    bestProfit = profit;
                }
            } else {
                left = i;
            }
        }

        return bestProfit;
    }
*/

/*
    First Solution Time Limit Exceeded
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int currentProfit;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                currentProfit = prices[j] - prices[i];
                if (currentProfit > bestProfit) {
                    bestProfit = currentProfit;
                }
            }
        }
        return bestProfit;
    }
*/

}
