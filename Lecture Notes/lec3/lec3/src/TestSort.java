import org.junit.Test;
import static org.junit.Assert.*;
// The static keyword before the import statement means that
// we can use the methods in the Assert
// class without having to prefix them with the class name.

public class TestSort {
    // Test the Sort.sort method
    @Test
    public void testSort(){
        String[] input = {"i", "have","an", "egg"};
        String[] expected = {"an", "egg","have","i"};

        Sort.sort(input);
        assertArrayEquals(expected, input);
//        for (int i = 0; i < input.length; i++) {
//            if (!input[i].equals(expected[i])){
//                System.out.println("Mismatch in position" + i + ", expected:" + expected[i] + ", but got:" + input[i]);
//                return;
//            }
//        }

//        if (!java.util.Arrays.equals(input,expected)){
//            System.out.println("Error! There seems to be a problem.");
//        }

    }
    @Test
    public void testFindSmallest(){
        String[] input = {"i", "have","an", "egg."};
        String expected = "an";

        int index = Sort.findSmallest(input,0);
        String actual = input[index];
        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSwap(){
        String[] input = {"i", "have","an", "egg."};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have","i", "egg."};

        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

//    public static void main(String[] args) {
//        testSort();
//    }

}
