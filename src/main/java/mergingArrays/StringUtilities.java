package mergingArrays;

public class StringUtilities {
    public static void main(String[] args) {
        String [] text1 = {"Hello", "I am", "Jacqui"};
        String [] text2 = {"Beth", "Ingmar", "Monster"};

        String [] result = merge(text1, text2);
        printArray(result);
    }

    public static void printArray(String [] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(i+") " + nums[i]);
        }
    }

    public static String []  merge(String [] text1, String [] text2){
        String [] combined = new String[text1.length + text2.length];

        int text1Pos = 0;
        int text2Pos = 0;

        for(int i = 0; i < combined.length; i++){
            if(text1Pos == text1.length){
                combined[i] = text2[text2Pos];
                text2Pos++;
            } else if(text2Pos == text2.length){
                combined[i] = text1[text1Pos];
                text1Pos++;
            }else if(text1[text1Pos].compareTo(text2[text2Pos]) <= 0){
                combined[i] = text1[text1Pos];
                text1Pos++;
            }else if(text1[text1Pos].compareTo(text2[text2Pos]) > 0){
                combined[i] = text2[text2Pos];
                text2Pos++;
            }
        }

        return combined;
    }

}

