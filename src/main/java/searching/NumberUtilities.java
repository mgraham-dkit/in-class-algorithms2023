package searching;

public class NumberUtilities {
    public int findLastInstanceBasic(int [] nums, int value){
        int pos = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == value){
                pos = i;
            }
        }

        return pos;
    }

    public int findLastInstanceImproved(int [] nums, int value){
        for(int i = nums.length-1; i >= 0 ; i++){
            if(nums[i] == value){
                return i;
            }
        }
        return -1;
    }
}
