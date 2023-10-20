package partitioningArrays;

import static growingArrays.ArrayManipulationUtilities.printArray;

public class NumberUtilities {
    public static void main(String[] args) {
        int [] values = {12, 4, 12,758, 23, 35, 4, 0, 33, -4};
        int [] partitioned = partition(values, 30);
        printArray(partitioned);
    }

    public static int[] partition(int [] nums, int pivot){
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];

        int leftPos = 0;
        int rightPos = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= pivot){
                left[leftPos] = nums[i];
                leftPos++;
            }else{
                right[rightPos] = nums[i];
                rightPos++;
            }
        }

        int [] combo = new int[leftPos+rightPos];
        int comboTracker = 0;

        for(int i = 0; i < leftPos; i++){
            combo[comboTracker] = left[i];
            comboTracker++;
        }
        for(int i = 0; i < rightPos; i++){
            combo[comboTracker] = right[i];
            comboTracker++;
        }

        return combo;
    }
}
