public class ForLoop {
    /** Uses a basic for loop to sum a. */
    public static int sum(int[] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i = i + 1) {
        sum = sum + a[i];
      }
      return sum;
    }
}

// for (initialization; termination; increment) {
//     statement(s)
// }

// for (int i = 0, j = 10; i < j; i += 1) {
//     System.out.println(i + j);
// }