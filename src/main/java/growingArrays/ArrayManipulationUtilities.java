package growingArrays;

public class ArrayManipulationUtilities {
    public static void printArray(int [] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(i+") " + nums[i]);
        }
    }

    /**
     * Creates a new version of a supplied array with
     * double the capacity.
     * @param nums The array of data to be duplicated
     * @return A new array double the size of the original, containing identical information in the same order.
     */
    public static int [] growArray(int [] nums){
        /*
            Make a new array of original length *2 in same type as original array
        */
        int [] newNums = new int[nums.length*2];
        /*
            for each element in original array:
                store current element in same position in new array
        */
        for(int i = 0; i < nums.length; i++){
            newNums[i] = nums[i];
        }
        /*
            return new array
         */
        return newNums;
    }
}
