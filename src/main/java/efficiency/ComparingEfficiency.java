package efficiency;

public class ComparingEfficiency {
    /**
     * Finds the position of the first instance of a supplied String within an array
     * @param textArray The String array to be searched
     * @param text The String to be found
     * @return The first position at which the String was found, otherwise -1.
     */
    public static int getFirst(String [] textArray, String text){
        for(int i = 0; i < textArray.length; i++){
            if(textArray[i].equals(text)){
                return i;
            }
        }
        return -1;
    }
}
