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

    public static Dog shiftDelete(Dog[] dogs, int pos) {
        if (dogs == null) {
            return null;
        }
        if (pos < 0 || pos >= dogs.length) {
            return null;
        }
        // Save value to be deleted
        Dog deleted = dogs[pos];

        for(int i = pos; i < dogs.length - 1; i++){
            dogs[i] = dogs[i+1];
        }

        dogs[dogs.length-1] = null;

        return deleted;
    }

    public static Dog [] resizeDelete(Dog[] dogs, int pos) {
        if (dogs == null) {
            return null;
        }
        if (pos < 0 || pos >= dogs.length) {
            return null;
        }

        Dog [] dest = new Dog[dogs.length-1];
        int destTracker = 0;

        for(int i = 0; i < dogs.length; i++){
            if(pos != i) {
                dest[destTracker] =dogs[i];
                destTracker++;
            }
        }
        return dest;
    }
}
