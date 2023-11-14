package deduplicating;

public class NumberUtilities {

    public static int[] deduplicate(int [] data){
        int [] filtered = new int[0];
        int tracker = 0;

        for(int num : data){
            boolean found = false;
            for(int i = 0; i < tracker; i++){
                if(filtered[i] == num){
                    found = true;
                    break;
                }
            }
            if(!found){
                // Make a larger version of filtered
                filtered = grow(filtered);
                filtered[tracker] = num;
                tracker++;
            }
        }
        return filtered;
    }

    public static String[] deduplicate(String [] data){
        if(data == null){
            return new String[0];
        }
        String [] filtered = new String[data.length];
        int tracker = 0;

        for(int i = 0; i < data.length; i++){
            if(!contains(filtered, data[i], tracker)){
                filtered[tracker] = data[i];
                tracker++;
            }
        }
        return copy(filtered, tracker);
    }

    public static String[] deduplicate_ArrayGrowth(String [] data){
        if(data == null){
            return new String[0];
        }
        String [] filtered = new String[0];
        int tracker = 0;

        for(int i = 0; i < data.length; i++){
            if(!contains(filtered, data[i], tracker)){
                filtered = grow(filtered, 1);
                filtered[tracker] = data[i];
                tracker++;
            }
        }
        return filtered;
    }

    public static String [] grow(String [] data, int numExtraSlots){
        String [] larger = new String[data.length + numExtraSlots];
        for(int i = 0; i < data.length; i++){
            larger[i] = data[i];
        }
        return larger;
    }

    public static String [] copy(String [] data, int numElements){
        String [] copy = new String[numElements];
        for(int i = 0; i < copy.length; i++){
            copy[i] = data[i];
        }
        return copy;
    }

    public static boolean contains(String [] data, String element, int cutoff){
        for(int i = 0; i < cutoff; i++){
            if(data[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public static int [] grow(int [] data){
        int [] larger = new int[data.length+1];
        for(int i = 0; i < data.length; i++){
            larger[i] = data[i];
        }
        return larger;
    }
}
