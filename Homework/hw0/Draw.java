public class Draw {
    public static void drawTriangle(int N){
        int i = 1;
        String res = "*";
        while (i <= N){
            System.out.println(res);
            res = res + "*";
            i = i + 1;
        }

    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
 }


// create array like lists in python
//  int[] numbers = new int[3];
//  numbers[0] = 4;
//  numbers[1] = 7;
//  numbers[2] = 10;

// int[] numbers = new int[]{4, 7, 10};
// System.out.println(numbers.length);


 
