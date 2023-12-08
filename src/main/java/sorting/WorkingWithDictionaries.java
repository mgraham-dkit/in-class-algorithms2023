package sorting;

public class WorkingWithDictionaries {
    public static void main(String[] args) {
        String [] entries = {"Termite", "Woodchuck", "Ardvaark", "Elephant", "Beaver", "Zebra", "Heifer"};
        Dictionary myDict = new Dictionary(entries);
        myDict.display();
        System.out.println("-------------");
        myDict.selectionSort();
        myDict.display();
    }
}
