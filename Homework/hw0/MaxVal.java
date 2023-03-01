public class MaxVal {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        // int i = 1;
        int val = m[0];
        // while(i < m.length){
        //     if (m[i] >= val){
        //         val = m[i];
        //     }
        //     i = i + 1;
        // }
        for(int i = 1; i < m.length; i = i + 1){
            if (m[i] >= val){
                val = m[i];
            }
        }
        return val;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
       System.out.println(max(numbers));    
    }
}

// do-while
// do {
//     statement(s)
// } while (expression);
// The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once