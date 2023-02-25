// example 1
//public class lec {
//    public static void main(String[] args){
//        System.out.println("Hello world");
//    }
//}

/**
 * 1. All code in Java must be part of a class
 * 2. We delimit the beginning and end of segments using {}
 * 3. All statements in Java must end in a semicolon.
 * 4. For code to run we need public static void main()
 */

// example 2
//public class lec {
//   public static void main(String[] args){
//       int x = 0;//Declare x exists and is an integer
//       while(x < 10){
//           System.out.println(x);
//           x += 1;
//       }
//    }
//}
/**
 * 1. Before Java variables can be used, they must be declared
 * 2. Java variables must have a specific type
 * 3. Java variables type can never change
 * 4. In java, types are verified before the code runs.
 **/

//example 3
public class LecOne {
    public static int larger(int x, int y){
        if (x>y){
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5,-10));
    }
}

/**
 * 1. To declare a function in Java, use "public static"
 * 2. All parameters must have a type, and the function itself
 * must have a return type.
 * 3. All functions  must be part of a class, which means it is a method
 **/




