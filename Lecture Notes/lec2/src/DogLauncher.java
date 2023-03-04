public class DogLauncher {
    public static void main(String[] args) {
        Dog d = new Dog(51);
        // d.weightInPounds = 25;
        d.makeNoise();
//        Dog[] dogs = new Dog[2];
//        dogs[0] = new Dog(8);
//        dogs[1] = new Dog(20);
//        dogs[0].makeNoise();

        Dog d2 = new Dog(100);

//        Dog bigger = Dog.maxDog(d,d2);
//        bigger.makeNoise();
        Dog bigger = d.maxDog(d2);
        bigger.makeNoise();

    }
}
