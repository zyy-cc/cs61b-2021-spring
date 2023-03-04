public class Dog {
    public int weightInPounds;
    public static String binomen = "Canis";

    // One integer constructor for dogs
    public Dog(int w){
        weightInPounds = w;
    }

    public void makeNoise(){
        if(weightInPounds < 10){
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        }else {
            System.out.println("woooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs){
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for (int i = 0; i < dogs.length ; i++) {
            if (isBiggestOfFour(dogs,i)){
                returnDogs[cnt] = dogs[i];
                cnt = cnt + 1;
            }

        }
        returnDogs = arrayWithNoNulls(returnDogs,cnt);
        return returnDogs;
    }

    public static Dog[] arrayWithNoNulls(Dog[] dogs, int cnt){
        Dog[] noNullDogs = new Dog[cnt];
        for (int i = 0; i < cnt; i++) {
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i){
        boolean isBiggest = true;
        for (int j = -2; j < 2; j++) {
            if (j == 0){
                continue;
            }
            int compareIndex = i + j;
            if (validIndex(dogs, compareIndex){
                if (dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds){
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    public static boolean validIndex(Dog[] dogs, int i){
        if (i < 0){
            return false;
        }
        if (i >= dogs.length) {
            return false;
        }
        return true;
//        return (i >= 0) && (i < dogs.length);
    }




//        for (int i = 0; i < dogs.length; i++) {
//            boolean largest = true;
//            for (int j = -2; j < 2; j++) {
//                if (i + j < 0){
//                    continue;
//                } else if (i + j >= dogs.length) {
//                    break;
//                }
//                if (j == 0){
//                    continue;
//                }
//                Dog neighborDog = dogs[i+j];
//                if (neighborDog.weightInPounds >= dogs[i].weightInPounds){
//                    largest = false;
//                }
//
//
//
//
//            }
//        }






    //    public static void main(String[] args){
//        makeNoise();
//    }
}
