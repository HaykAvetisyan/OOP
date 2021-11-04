package DynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        size++;

        if (size == array.length) {
            extend();
        }
        array[size] = value;
    }


    private void extend() {
        int[] newArr = new int[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
       array = newArr;
    }

    public void print() {
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    public int getByIndex(int index) {
        if (index > size || index < 0) {
            return 0;
        } else {
            return array[index];
        }

    }


}

