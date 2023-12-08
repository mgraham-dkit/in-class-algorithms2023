package sorting;

public class Dictionary {
    private String [] entries;

    public Dictionary(){
        entries = new String[0];
    }

    public Dictionary(String [] entries){
        if(entries != null) {
            this.entries = entries;
            // vulnerablity exists here!!!
        }else{
            entries = new String[0];
        }
    }

    public int indexOf(String value){
        if(value == null){
            return -1;
        }
        for(int i = 0; i < entries.length; i++){
            if(entries[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public void bubblesort(){
        for(int i = 0; i < entries.length; i++) {
            for (int j = 0; j < entries.length - 1 - i; j++) {
                if (entries[j].compareTo(entries[j + 1]) > 0) {
                    String temp = entries[j];
                    entries[j] = entries[j + 1];
                    entries[j + 1] = temp;
                    // Can also do:
                    // swap(j, j+1);
                }
            }
        }
    }

    public void optimisedBubblesort(){
        for(int i = 0; i < entries.length; i++) {
            int swapCount = 0;
            for (int j = 0; j < entries.length - 1 - i; j++) {
                if (entries[j].compareTo(entries[j + 1]) > 0) {
                    String temp = entries[j];
                    entries[j] = entries[j + 1];
                    entries[j + 1] = temp;
                    swapCount++;
                    // Can also do:
                    // swap(j, j+1);
                }
            }
            if(swapCount == 0){
                break;
            }
        }
    }

    public void selectionSort(){
        for(int startPos = 0; startPos < entries.length-1; startPos++) {
            int minPos = startPos;
            for (int i = startPos + 1; i < entries.length; i++) {
                if (entries[i].compareTo(entries[minPos]) < 0) {
                    minPos = i;
                }
            }
            swap(startPos, minPos);
        }
    }

    private void swap(int pos1, int pos2){
        String temp = entries[pos1];
        entries[pos1] = entries[pos2];
        entries[pos2] = temp;
    }

    public void display(){
        for(String value: entries){
            System.out.println(value);
        }
    }
}
