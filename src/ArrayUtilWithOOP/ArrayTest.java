package ArrayUtilWithOOP;

public class ArrayTest {
    public static void main(String[] args) {

        int [] testArray = {-1,2,36,24,56,0};

        ArrayClass ac = new ArrayClass();



        int sum = ac.getSum(testArray);
        int max = ac.getMaximum(testArray);
        int min = ac.getMinimum(testArray);
        double mean = ac.getAvg(testArray);
        int even = ac.getCountOfEven(testArray);
        int odd = ac.getCountOfOdd(testArray);



        ac.print(testArray);
        System.out.println();
        System.out.println("Sum of array is " + sum );
        System.out.println("Peak is " + max );
        System.out.println("Low number is " + min );
        System.out.println("Mean " + mean);
        System.out.println("Odds " + even + " evens " + odd);



    }
}
