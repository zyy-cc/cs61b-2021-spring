import java.util.Arrays;

public class Sort {
    public static void sort(String[] x) {
        // find the smallest item
        // move it to the front
        // selection sort the rest(using recursion?)
        //base case

//        if (x.length <= 1){
//            return;
//        }
//
//        int smallest = findSmallest(x);
//        swap(x, 0, smallest);
//        // In java, we can't slice the list
//        sort(Arrays.copyOfRange(x,1,x.length));
        sort(x,0);
    }


    public static void sort(String[] x, int start){
        if(start == x.length){
            return;
        }
        int small = findSmallest(x,start);
        swap(x, start,small);
        sort(x, start + 1);
    }

    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i++) {
            if (x[i].compareTo(x[smallestIndex]) < 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }


}
