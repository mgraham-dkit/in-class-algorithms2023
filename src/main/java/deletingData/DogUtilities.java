package deletingData;

public class DogUtilities {
    public static Dog overwrite(Dog[] dogs, int pos){
        if(dogs == null){
            return null;
        }
        if(pos < 0 || pos >= dogs.length){
            return null;
        }

        Dog deleted = dogs[pos];
        dogs[pos] = null;
        return deleted;
    }
}
