package growingArrays;

public class GrowingAnArray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int [] biggerNums = ArrayManipulationUtilities.growArray(nums);

        ArrayManipulationUtilities.printArray(biggerNums);
    }
}
