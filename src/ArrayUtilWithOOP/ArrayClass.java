package ArrayUtilWithOOP;

public class ArrayClass {

    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

    }

    int getMaximum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int getMinimum(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int getCountOfEven(int[] array) {
        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                countOfEven++;
            }
        }
        return countOfEven;
    }

    int getCountOfOdd(int[] array) {
        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {

                countOfOdd++;
            }
        }
        return countOfOdd;
    }

    int getSum(int[] array) {
        int sum = 0;
        double mean;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        mean = (double) sum / array.length;
        return sum;
    }

    double getAvg(int[] array) {
        int sum = 0;
        double mean;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        mean = (double) sum / array.length;
        return mean;
    }

}
