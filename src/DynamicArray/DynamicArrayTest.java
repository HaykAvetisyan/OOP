package DynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        for (int i = 0; i <20; i=i+2) {
            da.add(i);
        }

        da.print();
        int byIndex = da.getByIndex(5);
        System.out.println(byIndex);


    }
}
