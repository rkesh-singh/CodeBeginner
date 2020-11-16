//https://www.algoexpert.io/questions/Two%20Number%20Sum

package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

    public static void main(String[] args) {

        int[] inpArray = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

        int targetSum = 10;

        int[] twoNumbersSum = getTwoNumberSum(inpArray, targetSum);

    }

    
    public static int[] getTwoNumberSum(int[] inpArray, int targetSum) {

        Set<Integer> stageNumbers = new HashSet<Integer>();
        for (int num : inpArray) {
            int diff = targetSum - num;

            if (stageNumbers.contains(diff)) {
                return new int[]{num, diff};
            } else {
                stageNumbers.add(num);
            }
        }

        return new int[0];
    }

    private static int[] getTwoNumbersSum(int[] inpArray, int targetSum) {

        int diff;
        ArrayList<Integer> stage_result = new ArrayList<Integer>();
        for (int i = 0; i < inpArray.length; i++) {
            diff = targetSum - inpArray[i];
            if (!stage_result.contains(diff)) {
                stage_result.add(inpArray[i]);
            } else {
                return new int[]{diff, inpArray[i]};
            }
        }

        return new int[]{};
    }
}
