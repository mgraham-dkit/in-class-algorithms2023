package mergingArrays;

public class NumberUtilities {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int [] nums2 = {36, 34, 1, 5};
        NumberUtilities.merge(nums1, nums2);
    }
    public static int [] merge(int [] nums1, int [] nums2){
        int [] combo = new int[nums1.length + nums2.length];
        int comboTracker = 0;

        for(int i = 0; i < nums1.length; i++){
            combo[comboTracker] = nums1[i];
            comboTracker++;
        }

        for(int i = 0; i < nums2.length; i++){
            combo[comboTracker] = nums2[i];
            comboTracker++;
        }

        return combo;
    }
}
