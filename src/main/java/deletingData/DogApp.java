package deletingData;

public class DogApp {
    public static void main(String[] args) {
        Dog [] dogs = new Dog[5];

        dogs[0] = new Dog("Fido", "Retriever", 3, 4.5);
        dogs[1] =new Dog("Boots", "Retriever", 3, 4.5);
        dogs[2] =new Dog("Cammy", "Retriever", 3, 4.5);
        dogs[3] =new Dog("Bingo", "Retriever", 3, 4.5);
        dogs[4] =new Dog("Sam", "Retriever", 3, 4.5);

        DogUtilities.overwrite(dogs, 3);
    }
}
